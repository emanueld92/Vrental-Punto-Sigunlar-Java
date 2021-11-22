/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rt.rentalcar.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emanueld92
 */
@Entity
@Table(name = "vehicle_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VehicleDetails.findAll", query = "SELECT v FROM VehicleDetails v"),
    @NamedQuery(name = "VehicleDetails.findById", query = "SELECT v FROM VehicleDetails v WHERE v.id = :id"),
    @NamedQuery(name = "VehicleDetails.findByDetail", query = "SELECT v FROM VehicleDetails v WHERE v.detail = :detail"),
    @NamedQuery(name = "VehicleDetails.findByStatus", query = "SELECT v FROM VehicleDetails v WHERE v.status = :status")})
public class VehicleDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "detail")
    private String detail;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @JoinColumn(name = "vehicleid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Vehicle vehicleid;

    public VehicleDetails() {
    }

    public VehicleDetails(Integer id) {
        this.id = id;
    }

    public VehicleDetails(Integer id, Character status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
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
        if (!(object instanceof VehicleDetails)) {
            return false;
        }
        VehicleDetails other = (VehicleDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rt.rentalcar.entity.VehicleDetails[ id=" + id + " ]";
    }
    
}
