/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rt.rentalcar.DTO;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author emanueld92
 */
@Data
public class UsersDTO implements Serializable{
    private Integer id;
    private String username;
    private String email;
    
}
