/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rt.rentalcar.DTO;

import java.io.Serializable;
import java.math.BigInteger;
import lombok.Data;

/**
 *
 * @author emanueld92
 */
@Data
public class VehiclesDTO implements Serializable{
    private Integer id;
    private String model;
    private Integer year;
    private String vehicleRegistration;
    private String description;
    private Integer rentalDuration;
    private BigInteger rentalRate;
    private BigInteger rentalRateExtra;
    
}
