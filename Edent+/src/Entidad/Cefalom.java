/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "CEFALOM")
@NamedQueries({
    @NamedQuery(name = "Cefalom.findAll", query = "SELECT c FROM Cefalom c")})
public class Cefalom implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CEFALOMETRIA")
    private BigDecimal idCefalometria;
    @Column(name = "ARTICULAR")
    private String articular;
    @Column(name = "GONIACO")
    private String goniaco;
    @Column(name = "IMPA")
    private String impa;
    @Column(name = "JARABAK")
    private String jarabak;
    @Column(name = "FACIAL")
    private String facial;
    @Column(name = "I_S")
    private String iS;
    @Column(name = "II")
    private String ii;
    @Column(name = "FHIS")
    private String fhis;
    @Column(name = "ANB82")
    private String anb82;
    @Column(name = "ANB80")
    private String anb80;
    @Column(name = "ANB2")
    private String anb2;
    @Column(name = "PALS")
    private String pals;
    @Column(name = "PALI")
    private String pali;
    @Column(name = "PTB")
    private String ptb;
    @Column(name = "SPEELEVE")
    private BigInteger speeleve;
    @Column(name = "SPEEMODERADA")
    private BigInteger speemoderada;
    @Column(name = "SPEESEVERA")
    private BigInteger speesevera;
    @Column(name = "DSD")
    private String dsd;
    @Column(name = "CLASIM")
    private String clasim;
    @Column(name = "ENTORNOD")
    private String entornod;
    @JoinColumn(name = "ID_CONSULTA", referencedColumnName = "ID_CONSULTA")
    @ManyToOne(optional = false)
    private Consulta idConsulta;

    public Cefalom() {
    }

    public Cefalom(BigDecimal idCefalometria) {
        this.idCefalometria = idCefalometria;
    }

    public BigDecimal getIdCefalometria() {
        return idCefalometria;
    }

    public void setIdCefalometria(BigDecimal idCefalometria) {
        this.idCefalometria = idCefalometria;
    }

    public String getArticular() {
        return articular;
    }

    public void setArticular(String articular) {
        this.articular = articular;
    }

    public String getGoniaco() {
        return goniaco;
    }

    public void setGoniaco(String goniaco) {
        this.goniaco = goniaco;
    }

    public String getImpa() {
        return impa;
    }

    public void setImpa(String impa) {
        this.impa = impa;
    }

    public String getJarabak() {
        return jarabak;
    }

    public void setJarabak(String jarabak) {
        this.jarabak = jarabak;
    }

    public String getFacial() {
        return facial;
    }

    public void setFacial(String facial) {
        this.facial = facial;
    }

    public String getIS() {
        return iS;
    }

    public void setIS(String iS) {
        this.iS = iS;
    }

    public String getIi() {
        return ii;
    }

    public void setIi(String ii) {
        this.ii = ii;
    }

    public String getFhis() {
        return fhis;
    }

    public void setFhis(String fhis) {
        this.fhis = fhis;
    }

    public String getAnb82() {
        return anb82;
    }

    public void setAnb82(String anb82) {
        this.anb82 = anb82;
    }

    public String getAnb80() {
        return anb80;
    }

    public void setAnb80(String anb80) {
        this.anb80 = anb80;
    }

    public String getAnb2() {
        return anb2;
    }

    public void setAnb2(String anb2) {
        this.anb2 = anb2;
    }

    public String getPals() {
        return pals;
    }

    public void setPals(String pals) {
        this.pals = pals;
    }

    public String getPali() {
        return pali;
    }

    public void setPali(String pali) {
        this.pali = pali;
    }

    public String getPtb() {
        return ptb;
    }

    public void setPtb(String ptb) {
        this.ptb = ptb;
    }

    public BigInteger getSpeeleve() {
        return speeleve;
    }

    public void setSpeeleve(BigInteger speeleve) {
        this.speeleve = speeleve;
    }

    public BigInteger getSpeemoderada() {
        return speemoderada;
    }

    public void setSpeemoderada(BigInteger speemoderada) {
        this.speemoderada = speemoderada;
    }

    public BigInteger getSpeesevera() {
        return speesevera;
    }

    public void setSpeesevera(BigInteger speesevera) {
        this.speesevera = speesevera;
    }

    public String getDsd() {
        return dsd;
    }

    public void setDsd(String dsd) {
        this.dsd = dsd;
    }

    public String getClasim() {
        return clasim;
    }

    public void setClasim(String clasim) {
        this.clasim = clasim;
    }

    public String getEntornod() {
        return entornod;
    }

    public void setEntornod(String entornod) {
        this.entornod = entornod;
    }

    public Consulta getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Consulta idConsulta) {
        this.idConsulta = idConsulta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCefalometria != null ? idCefalometria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cefalom)) {
            return false;
        }
        Cefalom other = (Cefalom) object;
        if ((this.idCefalometria == null && other.idCefalometria != null) || (this.idCefalometria != null && !this.idCefalometria.equals(other.idCefalometria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Cefalom[ idCefalometria=" + idCefalometria + " ]";
    }
    
}
