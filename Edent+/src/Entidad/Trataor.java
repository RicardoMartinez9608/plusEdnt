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
@Table(name = "TRATAOR")
@NamedQueries({
    @NamedQuery(name = "Trataor.findAll", query = "SELECT t FROM Trataor t")})
public class Trataor implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ORTODONCIA")
    private BigDecimal idOrtodoncia;
    @Column(name = "ARCOS")
    private String arcos;
    @Column(name = "F_FACIALES")
    private BigInteger fFaciales;
    @Column(name = "F_INTRAORALES")
    private BigInteger fIntraorales;
    @Column(name = "MODELO_MX")
    private BigInteger modeloMx;
    @Column(name = "MODELO_MD")
    private BigInteger modeloMd;
    @Column(name = "RX_PANORAMICA")
    private BigInteger rxPanoramica;
    @Column(name = "RX_CAFALOMETRICA")
    private BigInteger rxCafalometrica;
    @Column(name = "RX_INCICIVOS")
    private BigInteger rxIncicivos;
    @Column(name = "RX_ROCABADO")
    private String rxRocabado;
    @Column(name = "BANDAS")
    private String bandas;
    @Column(name = "TUBOS")
    private String tubos;
    @Column(name = "OTROS")
    private String otros;
    @Column(name = "APARATO")
    private String aparato;
    @Column(name = "EXODONCIA")
    private String exodoncia;
    @Column(name = "BRACKETS")
    private String brackets;
    @Column(name = "RETENCIONES")
    private String retenciones;
    @Column(name = "MD")
    private String md;
    @JoinColumn(name = "ID_CONSULTA", referencedColumnName = "ID_CONSULTA")
    @ManyToOne(optional = false)
    private Consulta idConsulta;

    public Trataor() {
    }

    public Trataor(BigDecimal idOrtodoncia) {
        this.idOrtodoncia = idOrtodoncia;
    }

    public BigDecimal getIdOrtodoncia() {
        return idOrtodoncia;
    }

    public void setIdOrtodoncia(BigDecimal idOrtodoncia) {
        this.idOrtodoncia = idOrtodoncia;
    }

    public String getArcos() {
        return arcos;
    }

    public void setArcos(String arcos) {
        this.arcos = arcos;
    }

    public BigInteger getFFaciales() {
        return fFaciales;
    }

    public void setFFaciales(BigInteger fFaciales) {
        this.fFaciales = fFaciales;
    }

    public BigInteger getFIntraorales() {
        return fIntraorales;
    }

    public void setFIntraorales(BigInteger fIntraorales) {
        this.fIntraorales = fIntraorales;
    }

    public BigInteger getModeloMx() {
        return modeloMx;
    }

    public void setModeloMx(BigInteger modeloMx) {
        this.modeloMx = modeloMx;
    }

    public BigInteger getModeloMd() {
        return modeloMd;
    }

    public void setModeloMd(BigInteger modeloMd) {
        this.modeloMd = modeloMd;
    }

    public BigInteger getRxPanoramica() {
        return rxPanoramica;
    }

    public void setRxPanoramica(BigInteger rxPanoramica) {
        this.rxPanoramica = rxPanoramica;
    }

    public BigInteger getRxCafalometrica() {
        return rxCafalometrica;
    }

    public void setRxCafalometrica(BigInteger rxCafalometrica) {
        this.rxCafalometrica = rxCafalometrica;
    }

    public BigInteger getRxIncicivos() {
        return rxIncicivos;
    }

    public void setRxIncicivos(BigInteger rxIncicivos) {
        this.rxIncicivos = rxIncicivos;
    }

    public String getRxRocabado() {
        return rxRocabado;
    }

    public void setRxRocabado(String rxRocabado) {
        this.rxRocabado = rxRocabado;
    }

    public String getBandas() {
        return bandas;
    }

    public void setBandas(String bandas) {
        this.bandas = bandas;
    }

    public String getTubos() {
        return tubos;
    }

    public void setTubos(String tubos) {
        this.tubos = tubos;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getAparato() {
        return aparato;
    }

    public void setAparato(String aparato) {
        this.aparato = aparato;
    }

    public String getExodoncia() {
        return exodoncia;
    }

    public void setExodoncia(String exodoncia) {
        this.exodoncia = exodoncia;
    }

    public String getBrackets() {
        return brackets;
    }

    public void setBrackets(String brackets) {
        this.brackets = brackets;
    }

    public String getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(String retenciones) {
        this.retenciones = retenciones;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
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
        hash += (idOrtodoncia != null ? idOrtodoncia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trataor)) {
            return false;
        }
        Trataor other = (Trataor) object;
        if ((this.idOrtodoncia == null && other.idOrtodoncia != null) || (this.idOrtodoncia != null && !this.idOrtodoncia.equals(other.idOrtodoncia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Trataor[ idOrtodoncia=" + idOrtodoncia + " ]";
    }
    
}
