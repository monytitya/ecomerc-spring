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
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer paymentId;

    @Column(name = "invoice_no")
    private Integer invoiceNo;

    private Integer amount;

    @Lob
    @Column(name = "payment_mode")
    private String paymentMode;

    @Column(name = "ref_no")
    private Integer refNo;

    private Integer code;

    @Lob
    @Column(name = "payment_date")
    private String paymentDate;
}
