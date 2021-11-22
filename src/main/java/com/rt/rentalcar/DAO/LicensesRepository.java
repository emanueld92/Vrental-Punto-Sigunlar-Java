/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rt.rentalcar.DAO;

import com.rt.rentalcar.entity.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author emanueld92
 */
@Repository
public interface LicensesRepository extends CrudRepository <License, Integer>{
    
}
