/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "CONSULTA")
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c")})
public class Consulta implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsulta")
    private List<Trataor> trataorList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsulta")
    private List<Cefalom> cefalomList;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CONSULTA")
    private BigDecimal idConsulta;
    @Column(name = "MOTIVO_CONSULTA")
    private String motivoConsulta;
    @Column(name = "FECHA_CONSULTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConsulta;
    @Column(name = "TOTAL_PAGAR")
    private BigDecimal totalPagar;
    @Basic(optional = false)
    @Column(name = "HISTORIAM")
    private String historiam;
    @Basic(optional = false)
    @Column(name = "HISTORIAO")
    private String historiao;
    @Basic(optional = false)
    @Column(name = "EXAMENC")
    private String examenc;
    @Basic(optional = false)
    @Column(name = "DXODON")
    private String dxodon;
    @JoinColumn(name = "ID_PACIENTE", referencedColumnName = "ID_PACIENTE")
    @ManyToOne(optional = false)
    private Paciente idPaciente;

    public Consulta() {
    }

    public Consulta(BigDecimal idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Consulta(BigDecimal idConsulta, String historiam, String historiao, String examenc, String dxodon) {
        this.idConsulta = idConsulta;
        this.historiam = historiam;
        this.historiao = historiao;
        this.examenc = examenc;
        this.dxodon = dxodon;
    }

    public BigDecimal getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(BigDecimal idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public BigDecimal getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(BigDecimal totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getHistoriam() {
        return historiam;
    }

    public void setHistoriam(String historiam) {
        this.historiam = historiam;
    }

    public String getHistoriao() {
        return historiao;
    }

    public void setHistoriao(String historiao) {
        this.historiao = historiao;
    }

    public String getExamenc() {
        return examenc;
    }

    public void setExamenc(String examenc) {
        this.examenc = examenc;
    }

    public String getDxodon() {
        return dxodon;
    }

    public void setDxodon(String dxodon) {
        this.dxodon = dxodon;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsulta != null ? idConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idConsulta == null && other.idConsulta != null) || (this.idConsulta != null && !this.idConsulta.equals(other.idConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Consulta[ idConsulta=" + idConsulta + " ]";
    }

    public List<Cefalom> getCefalomList() {
        return cefalomList;
    }

    public void setCefalomList(List<Cefalom> cefalomList) {
        this.cefalomList = cefalomList;
    }

    public List<Trataor> getTrataorList() {
        return trataorList;
    }

    public void setTrataorList(List<Trataor> trataorList) {
        this.trataorList = trataorList;
    }
    
}
