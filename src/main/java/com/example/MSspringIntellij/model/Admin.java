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
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Integer adminId;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "admin_pass")
    private String adminPass;

    @Lob
    @Column(name = "admin_image")
    private String adminImage;

    @Column(name = "admin_contact")
    private String adminContact;

    @Lob
    @Column(name = "admin_country")
    private String adminCountry;

    @Column(name = "admin_job")
    private String adminJob;

    @Lob
    @Column(name = "admin_about")
    private String adminAbout;
}
