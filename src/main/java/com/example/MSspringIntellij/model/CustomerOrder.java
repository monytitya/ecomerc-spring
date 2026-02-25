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
@Table(name = "customer_orders")
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "due_amount")
    private Integer dueAmount;

    @Column(name = "invoice_no")
    private Integer invoiceNo;

    private Integer qty;

    @Lob
    private String size;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Lob
    @Column(name = "order_status")
    private String orderStatus;
}
