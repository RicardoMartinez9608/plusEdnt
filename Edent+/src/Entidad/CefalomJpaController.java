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
public class CefalomJpaController implements Serializable {

    public CefalomJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cefalom cefalom) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consulta idConsulta = cefalom.getIdConsulta();
            if (idConsulta != null) {
                idConsulta = em.getReference(idConsulta.getClass(), idConsulta.getIdConsulta());
                cefalom.setIdConsulta(idConsulta);
            }
            em.persist(cefalom);
            if (idConsulta != null) {
                idConsulta.getCefalomList().add(cefalom);
                idConsulta = em.merge(idConsulta);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCefalom(cefalom.getIdCefalometria()) != null) {
                throw new PreexistingEntityException("Cefalom " + cefalom + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cefalom cefalom) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cefalom persistentCefalom = em.find(Cefalom.class, cefalom.getIdCefalometria());
            Consulta idConsultaOld = persistentCefalom.getIdConsulta();
            Consulta idConsultaNew = cefalom.getIdConsulta();
            if (idConsultaNew != null) {
                idConsultaNew = em.getReference(idConsultaNew.getClass(), idConsultaNew.getIdConsulta());
                cefalom.setIdConsulta(idConsultaNew);
            }
            cefalom = em.merge(cefalom);
            if (idConsultaOld != null && !idConsultaOld.equals(idConsultaNew)) {
                idConsultaOld.getCefalomList().remove(cefalom);
                idConsultaOld = em.merge(idConsultaOld);
            }
            if (idConsultaNew != null && !idConsultaNew.equals(idConsultaOld)) {
                idConsultaNew.getCefalomList().add(cefalom);
                idConsultaNew = em.merge(idConsultaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                BigDecimal id = cefalom.getIdCefalometria();
                if (findCefalom(id) == null) {
                    throw new NonexistentEntityException("The cefalom with id " + id + " no longer exists.");
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
            Cefalom cefalom;
            try {
                cefalom = em.getReference(Cefalom.class, id);
                cefalom.getIdCefalometria();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cefalom with id " + id + " no longer exists.", enfe);
            }
            Consulta idConsulta = cefalom.getIdConsulta();
            if (idConsulta != null) {
                idConsulta.getCefalomList().remove(cefalom);
                idConsulta = em.merge(idConsulta);
            }
            em.remove(cefalom);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cefalom> findCefalomEntities() {
        return findCefalomEntities(true, -1, -1);
    }

    public List<Cefalom> findCefalomEntities(int maxResults, int firstResult) {
        return findCefalomEntities(false, maxResults, firstResult);
    }

    private List<Cefalom> findCefalomEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cefalom.class));
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

    public Cefalom findCefalom(BigDecimal id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cefalom.class, id);
        } finally {
            em.close();
        }
    }

    public int getCefalomCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cefalom> rt = cq.from(Cefalom.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
