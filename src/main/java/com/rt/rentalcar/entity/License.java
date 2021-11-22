/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rt.rentalcar.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author emanueld92
 */
@Entity
@Table(name = "license")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "License.findAll", query = "SELECT l FROM License l"),
    @NamedQuery(name = "License.findById", query = "SELECT l FROM License l WHERE l.id = :id"),
    @NamedQuery(name = "License.findByType", query = "SELECT l FROM License l WHERE l.type = :type"),
    @NamedQuery(name = "License.findByNLicense", query = "SELECT l FROM License l WHERE l.nLicense = :nLicense"),
    @NamedQuery(name = "License.findByValldity", query = "SELECT l FROM License l WHERE l.valldity = :valldity"),
    @NamedQuery(name = "License.findByBloodtype", query = "SELECT l FROM License l WHERE l.bloodtype = :bloodtype"),
    @NamedQuery(name = "License.findByImgUrl", query = "SELECT l FROM License l WHERE l.imgUrl = :imgUrl")})
public class License implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private Character type;
    @Column(name = "n_license")
    private Integer nLicense;
    @Column(name = "valldity")
    @Temporal(TemporalType.TIMESTAMP)
    private Date valldity;
    @Column(name = "bloodtype")
    private String bloodtype;
    @Column(name = "img_url")
    private String imgUrl;
    @OneToMany(mappedBy = "licenseid")
    private Collection<Rental> rentalCollection;

    public License() {
    }

    public License(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public Integer getNLicense() {
        return nLicense;
    }

    public void setNLicense(Integer nLicense) {
        this.nLicense = nLicense;
    }

    public Date getValldity() {
        return valldity;
    }

    public void setValldity(Date valldity) {
        this.valldity = valldity;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @XmlTransient
    public Collection<Rental> getRentalCollection() {
        return rentalCollection;
    }

    public void setRentalCollection(Collection<Rental> rentalCollection) {
        this.rentalCollection = rentalCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof License)) {
            return false;
        }
        License other = (License) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rt.rentalcar.entity.License[ id=" + id + " ]";
    }
    
}
