/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rt.rentalcar.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emanueld92
 */
@Entity
@Table(name = "vehicle_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VehicleCategory.findAll", query = "SELECT v FROM VehicleCategory v"),
    @NamedQuery(name = "VehicleCategory.findByLastUpdate", query = "SELECT v FROM VehicleCategory v WHERE v.lastUpdate = :lastUpdate"),
    @NamedQuery(name = "VehicleCategory.findById", query = "SELECT v FROM VehicleCategory v WHERE v.id = :id")})
public class VehicleCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "categoryid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Category categoryid;
    @JoinColumn(name = "vehicleid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Vehicle vehicleid;

    public VehicleCategory() {
    }

    public VehicleCategory(Integer id) {
        this.id = id;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Category categoryid) {
        this.categoryid = categoryid;
    }

    public Vehicle getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Vehicle vehicleid) {
        this.vehicleid = vehicleid;
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
        if (!(object instanceof VehicleCategory)) {
            return false;
        }
        VehicleCategory other = (VehicleCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rt.rentalcar.entity.VehicleCategory[ id=" + id + " ]";
    }
    
}
