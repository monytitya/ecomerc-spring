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
@Table(name = "manufacturers")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufacturer_id")
    private Integer manufacturerId;

    @Lob
    @Column(name = "manufacturer_title")
    private String manufacturerTitle;

    @Lob
    @Column(name = "manufacturer_top")
    private String manufacturerTop;

    @Lob
    @Column(name = "manufacturer_image")
    private String manufacturerImage;
}
