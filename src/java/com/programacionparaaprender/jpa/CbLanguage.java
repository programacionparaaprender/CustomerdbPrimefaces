/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacionparaaprender.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lacorrea
 */
@Entity
@Table(name = "cb_language", catalog = "customerdb", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CbLanguage.findAll", query = "SELECT c FROM CbLanguage c")
    , @NamedQuery(name = "CbLanguage.findByIdlanguage", query = "SELECT c FROM CbLanguage c WHERE c.idlanguage = :idlanguage")
    , @NamedQuery(name = "CbLanguage.findByNamelanguage", query = "SELECT c FROM CbLanguage c WHERE c.namelanguage = :namelanguage")
    , @NamedQuery(name = "CbLanguage.findByIsactive", query = "SELECT c FROM CbLanguage c WHERE c.isactive = :isactive")
    , @NamedQuery(name = "CbLanguage.findByLanguageiso", query = "SELECT c FROM CbLanguage c WHERE c.languageiso = :languageiso")
    , @NamedQuery(name = "CbLanguage.findByCountrycode", query = "SELECT c FROM CbLanguage c WHERE c.countrycode = :countrycode")
    , @NamedQuery(name = "CbLanguage.findByIsbaselanguage", query = "SELECT c FROM CbLanguage c WHERE c.isbaselanguage = :isbaselanguage")
    , @NamedQuery(name = "CbLanguage.findByIssystemlanguage", query = "SELECT c FROM CbLanguage c WHERE c.issystemlanguage = :issystemlanguage")})
public class CbLanguage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    private String idlanguage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    private String namelanguage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    private String isactive;
    @Size(max = 2)
    private String languageiso;
    @Size(max = 2)
    private String countrycode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    private String isbaselanguage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    private String issystemlanguage;

    public CbLanguage() {
    }

    public CbLanguage(String idlanguage) {
        this.idlanguage = idlanguage;
    }

    public CbLanguage(String idlanguage, String namelanguage, String isactive, String isbaselanguage, String issystemlanguage) {
        this.idlanguage = idlanguage;
        this.namelanguage = namelanguage;
        this.isactive = isactive;
        this.isbaselanguage = isbaselanguage;
        this.issystemlanguage = issystemlanguage;
    }

    public String getIdlanguage() {
        return idlanguage;
    }

    public void setIdlanguage(String idlanguage) {
        this.idlanguage = idlanguage;
    }

    public String getNamelanguage() {
        return namelanguage;
    }

    public void setNamelanguage(String namelanguage) {
        this.namelanguage = namelanguage;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getLanguageiso() {
        return languageiso;
    }

    public void setLanguageiso(String languageiso) {
        this.languageiso = languageiso;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getIsbaselanguage() {
        return isbaselanguage;
    }

    public void setIsbaselanguage(String isbaselanguage) {
        this.isbaselanguage = isbaselanguage;
    }

    public String getIssystemlanguage() {
        return issystemlanguage;
    }

    public void setIssystemlanguage(String issystemlanguage) {
        this.issystemlanguage = issystemlanguage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlanguage != null ? idlanguage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CbLanguage)) {
            return false;
        }
        CbLanguage other = (CbLanguage) object;
        if ((this.idlanguage == null && other.idlanguage != null) || (this.idlanguage != null && !this.idlanguage.equals(other.idlanguage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.programacionparaaprender.jpa.CbLanguage[ idlanguage=" + idlanguage + " ]";
    }
    
}
