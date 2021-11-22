/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rt.rentalcar.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author emanueld92
 */
@Entity
@Table(name = "vehicle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v"),
    @NamedQuery(name = "Vehicle.findById", query = "SELECT v FROM Vehicle v WHERE v.id = :id"),
    @NamedQuery(name = "Vehicle.findByModel", query = "SELECT v FROM Vehicle v WHERE v.model = :model"),
    @NamedQuery(name = "Vehicle.findByYear", query = "SELECT v FROM Vehicle v WHERE v.year = :year"),
    @NamedQuery(name = "Vehicle.findByVehicleRegistration", query = "SELECT v FROM Vehicle v WHERE v.vehicleRegistration = :vehicleRegistration"),
    @NamedQuery(name = "Vehicle.findByDescription", query = "SELECT v FROM Vehicle v WHERE v.description = :description"),
    @NamedQuery(name = "Vehicle.findByRentalDuration", query = "SELECT v FROM Vehicle v WHERE v.rentalDuration = :rentalDuration"),
    @NamedQuery(name = "Vehicle.findByRentalRate", query = "SELECT v FROM Vehicle v WHERE v.rentalRate = :rentalRate"),
    @NamedQuery(name = "Vehicle.findByRentalRateExtra", query = "SELECT v FROM Vehicle v WHERE v.rentalRateExtra = :rentalRateExtra")})
public class Vehicle implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicleid")
    private Collection<VehicleCategory> vehicleCategoryCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "model")
    private String model;
    @Column(name = "year")
    private Integer year;
    @Column(name = "vehicle_registration")
    private String vehicleRegistration;
    @Column(name = "description")
    private String description;
    @Column(name = "rental_duration")
    private Integer rentalDuration;
    @Column(name = "rental_rate")
    private BigInteger rentalRate;
    @Column(name = "rental_rate_extra")
    private BigInteger rentalRateExtra;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicleid")
    private Collection<InventoryVehicle> inventoryVehicleCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicleid")
    private Collection<VehicleDetails> vehicleDetailsCollection;

    public Vehicle() {
    }

    public Vehicle(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigInteger getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigInteger rentalRate) {
        this.rentalRate = rentalRate;
    }

    public BigInteger getRentalRateExtra() {
        return rentalRateExtra;
    }

    public void setRentalRateExtra(BigInteger rentalRateExtra) {
        this.rentalRateExtra = rentalRateExtra;
    }

    @XmlTransient
    public Collection<InventoryVehicle> getInventoryVehicleCollection() {
        return inventoryVehicleCollection;
    }

    public void setInventoryVehicleCollection(Collection<InventoryVehicle> inventoryVehicleCollection) {
        this.inventoryVehicleCollection = inventoryVehicleCollection;
    }

    @XmlTransient
    public Collection<VehicleDetails> getVehicleDetailsCollection() {
        return vehicleDetailsCollection;
    }

    public void setVehicleDetailsCollection(Collection<VehicleDetails> vehicleDetailsCollection) {
        this.vehicleDetailsCollection = vehicleDetailsCollection;
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
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rt.rentalcar.entity.Vehicle[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<VehicleCategory> getVehicleCategoryCollection() {
        return vehicleCategoryCollection;
    }

    public void setVehicleCategoryCollection(Collection<VehicleCategory> vehicleCategoryCollection) {
        this.vehicleCategoryCollection = vehicleCategoryCollection;
    }
    
}
