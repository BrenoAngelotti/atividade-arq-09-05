/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petstore.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author jean
 */
@Data
@Entity
@Builder
public class Order {
    @Id
    @GeneratedValue
    private long id;
    private Date orderDate;
    private CreditCard creditCard;
    private CreditCardType creditCardType;
    private String creditCardNumber;
    private List<OrderLine> orderLines;
    private float total;
    private Customer customer;
    private Address deliveryAddress;
    private String creditCardExpiryDate;
}
