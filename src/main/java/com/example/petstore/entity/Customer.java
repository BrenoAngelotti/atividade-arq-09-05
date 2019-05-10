/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petstore.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jean
 */
@Data
@Entity
@Builder
public class Customer implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String password;
    private String email;
    private int age;
    private String firstName;
    private String lastName;
    private String login;
    private Date dateOfBirth;
    private String telephone;
    
    @OneToOne
    private Address homeAddress;
}
