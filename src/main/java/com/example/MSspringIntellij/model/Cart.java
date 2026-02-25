package com.example.MSspringIntellij.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @Column(name = "p_id")
    private Integer pId;

    @Column(name = "ip_add")
    private String ipAdd;

    private Integer qty;

    @Column(name = "p_price")
    private String pPrice;

    @Lob
    private String size;
}
