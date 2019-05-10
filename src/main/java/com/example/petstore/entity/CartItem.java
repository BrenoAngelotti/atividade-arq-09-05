/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petstore.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author jean
 */
@Data
@Entity
@Builder
public class CartItem implements Serializable{
    @OneToOne
    private Item item;
    private int quantity;
    private float subTotal;
}
