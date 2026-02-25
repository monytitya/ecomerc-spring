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
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_pass")
    private String customerPass;

    @Lob
    @Column(name = "customer_country")
    private String customerCountry;

    @Lob
    @Column(name = "customer_city")
    private String customerCity;

    @Column(name = "customer_contact")
    private String customerContact;

    @Lob
    @Column(name = "customer_address")
    private String customerAddress;

    @Lob
    @Column(name = "customer_image")
    private String customerImage;

    @Column(name = "customer_ip")
    private String customerIp;

    @Lob
    @Column(name = "customer_confirm_code")
    private String customerConfirmCode;
}
