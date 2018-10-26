/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Entidad.exceptions.NonexistentEntityException;
import Entidad.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author DELL
 */
public class TrataorJpaController implements Serializable {

    public TrataorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Trataor trataor) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consulta idConsulta = trataor.getIdConsulta();
            if (idConsulta != null) {
                idConsulta = em.getReference(idConsulta.getClass(), idConsulta.getIdConsulta());
                trataor.setIdConsulta(idConsulta);
            }
            em.persist(trataor);
            if (idConsulta != null) {
                idConsulta.getTrataorList().add(trataor);
                idConsulta = em.merge(idConsulta);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTrataor(trataor.getIdOrtodoncia()) != null) {
                throw new PreexistingEntityException("Trataor " + trataor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Trataor trataor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Trataor persistentTrataor = em.find(Trataor.class, trataor.getIdOrtodoncia());
            Consulta idConsultaOld = persistentTrataor.getIdConsulta();
            Consulta idConsultaNew = trataor.getIdConsulta();
            if (idConsultaNew != null) {
                idConsultaNew = em.getReference(idConsultaNew.getClass(), idConsultaNew.getIdConsulta());
                trataor.setIdConsulta(idConsultaNew);
            }
            trataor = em.merge(trataor);
            if (idConsultaOld != null && !idConsultaOld.equals(idConsultaNew)) {
                idConsultaOld.getTrataorList().remove(trataor);
                idConsultaOld = em.merge(idConsultaOld);
            }
            if (idConsultaNew != null && !idConsultaNew.equals(idConsultaOld)) {
                idConsultaNew.getTrataorList().add(trataor);
                idConsultaNew = em.merge(idConsultaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = trataor.getIdOrtodoncia();
                if (findTrataor(id) == null) {
                    throw new NonexistentEntityException("The trataor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(BigDecimal id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Trataor trataor;
            try {
                trataor = em.getReference(Trataor.class, id);
                trataor.getIdOrtodoncia();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The trataor with id " + id + " no longer exists.", enfe);
            }
            Consulta idConsulta = trataor.getIdConsulta();
            if (idConsulta != null) {
                idConsulta.getTrataorList().remove(trataor);
                idConsulta = em.merge(idConsulta);
            }
            em.remove(trataor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Trataor> findTrataorEntities() {
        return findTrataorEntities(true, -1, -1);
    }

    public List<Trataor> findTrataorEntities(int maxResults, int firstResult) {
        return findTrataorEntities(false, maxResults, firstResult);
    }

    private List<Trataor> findTrataorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Trataor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Trataor findTrataor(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Trataor.class, id);
        } finally {
            em.close();
        }
    }

    public int getTrataorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Trataor> rt = cq.from(Trataor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
