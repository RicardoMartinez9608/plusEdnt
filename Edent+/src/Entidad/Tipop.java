/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "TIPOP")
@NamedQueries({
    @NamedQuery(name = "Tipop.findAll", query = "SELECT t FROM Tipop t")})
public class Tipop implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPOP")
    private BigDecimal idTipop;
    @Basic(optional = false)
    @Column(name = "NOMBRET")
    private String nombret;

    public Tipop() {
    }

    public Tipop(BigDecimal idTipop) {
        this.idTipop = idTipop;
    }

    public Tipop(BigDecimal idTipop, String nombret) {
        this.idTipop = idTipop;
        this.nombret = nombret;
    }

    public BigDecimal getIdTipop() {
        return idTipop;
    }

    public void setIdTipop(BigDecimal idTipop) {
        this.idTipop = idTipop;
    }

    public String getNombret() {
        return nombret;
    }

    public void setNombret(String nombret) {
        this.nombret = nombret;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipop != null ? idTipop.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipop)) {
            return false;
        }
        Tipop other = (Tipop) object;
        if ((this.idTipop == null && other.idTipop != null) || (this.idTipop != null && !this.idTipop.equals(other.idTipop))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Tipop[ idTipop=" + idTipop + " ]";
    }
    
}
