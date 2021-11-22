/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rt.rentalcar.DAO;

import com.rt.rentalcar.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author emanueld92
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>  {
    
}
