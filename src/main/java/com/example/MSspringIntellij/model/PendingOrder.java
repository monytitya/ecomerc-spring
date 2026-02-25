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
@Table(name = "pending_orders")
public class PendingOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "invoice_no")
    private Integer invoiceNo;

    @Lob
    @Column(name = "product_id")
    private String productId;

    private Integer qty;

    @Lob
    private String size;

    @Lob
    @Column(name = "order_status")
    private String orderStatus;
}
