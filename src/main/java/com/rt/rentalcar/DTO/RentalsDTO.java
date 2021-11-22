/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rt.rentalcar.DTO;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author emanueld92
 */
@Data
public class RentalsDTO implements Serializable {
     private Integer id;

    private Date rentalDate;


    private Date returnDate;


    private Date lastUpdate;
}
