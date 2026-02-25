package com.example.MSspringIntellij.model;

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
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Integer storeId;

    @Column(name = "store_title")
    private String storeTitle;

    @Column(name = "store_image")
    private String storeImage;

    @Lob
    @Column(name = "store_desc")
    private String storeDesc;

    @Column(name = "store_button")
    private String storeButton;

    @Column(name = "store_url")
    private String storeUrl;
}
