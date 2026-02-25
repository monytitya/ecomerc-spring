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
@Table(name = "coupons")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_id")
    private Integer couponId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "coupon_title")
    private String couponTitle;

    @Column(name = "coupon_price")
    private String couponPrice;

    @Column(name = "coupon_code")
    private String couponCode;

    @Column(name = "coupon_limit")
    private Integer couponLimit;

    @Column(name = "coupon_used")
    private Integer couponUsed;
}
