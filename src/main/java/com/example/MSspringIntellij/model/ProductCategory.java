package com.example.MSspringIntellij.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_categories")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_cat_id")
    private Integer pCatId;

    @Column(name = "p_cat_title")
    private String pCatTitle;

    @Column(name = "p_cat_top")
    private String pCatTop;

    @Column(name = "p_cat_image")
    private String pCatImage;
}
