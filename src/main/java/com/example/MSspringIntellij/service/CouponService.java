package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.Coupon;
import com.example.MSspringIntellij.repository.CouponRepository;

@Service
public class CouponService {

    private final CouponRepository couponRepository;

    @Autowired
    public CouponService(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    public List<Coupon> findAll() {
        return couponRepository.findAll();
    }

    public Optional<Coupon> findById(Integer id) {
        return couponRepository.findById(id);
    }

    public Coupon save(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public void deleteById(Integer id) {
        couponRepository.deleteById(id);
    }
}
