package com.example.MSspringIntellij.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "p_cat_id")
    private Integer pCatId;

    @Column(name = "cat_id")
    private Integer catId;

    @Column(name = "manufacturer_id")
    private Integer manufacturerId;

    private LocalDateTime date;

    @Column(name = "product_title")
    private String productTitle;

    @Column(name = "product_url")
    private String productUrl;

    @Column(name = "product_img1")
    private String productImg1;

    @Column(name = "product_img2")
    private String productImg2;

    @Column(name = "product_img3")
    private String productImg3;

    @Column(name = "product_price")
    private Integer productPrice;

    @Column(name = "product_psp_price")
    private Integer productPspPrice;

    @Lob
    @Column(name = "product_desc")
    private String productDesc;

    @Lob
    @Column(name = "product_features")
    private String productFeatures;

    @Lob
    @Column(name = "product_video")
    private String productVideo;

    @Column(name = "product_keywords")
    private String productKeywords;

    @Column(name = "product_label")
    private String productLabel;

    private String status;
}
