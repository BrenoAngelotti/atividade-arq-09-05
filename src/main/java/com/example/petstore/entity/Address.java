/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petstore.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author jean
 */
@Data
@Entity
public class Address implements Serializable{
    private String country;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipCode;
}
