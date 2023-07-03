/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacionparaaprender.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lacorrea
 */
@Entity
@Table(name = "cb_persona", catalog = "customerdb", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CbPersona.findAll", query = "SELECT c FROM CbPersona c")
    , @NamedQuery(name = "CbPersona.findByIdpersona", query = "SELECT c FROM CbPersona c WHERE c.idpersona = :idpersona")
    , @NamedQuery(name = "CbPersona.findByNombre", query = "SELECT c FROM CbPersona c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CbPersona.findByApellido", query = "SELECT c FROM CbPersona c WHERE c.apellido = :apellido")})
public class CbPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idpersona;
    @Size(max = 150)
    private String nombre;
    @Size(max = 100)
    private String apellido;

    public CbPersona() {
    }

    public CbPersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public Integer getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Integer idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpersona != null ? idpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CbPersona)) {
            return false;
        }
        CbPersona other = (CbPersona) object;
        if ((this.idpersona == null && other.idpersona != null) || (this.idpersona != null && !this.idpersona.equals(other.idpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.programacionparaaprender.jpa.CbPersona[ idpersona=" + idpersona + " ]";
    }
    
}
