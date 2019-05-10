/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.petstore.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author jean
 */
@Data
@Entity
@Builder
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    @OneToMany
    private Category category;
    @ManyToOne
    private List<Item> items;
}
