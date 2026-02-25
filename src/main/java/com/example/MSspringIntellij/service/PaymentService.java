package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.Payment;
import com.example.MSspringIntellij.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository repository;

    @Autowired
    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public List<Payment> findAll() {
        return repository.findAll();
    }

    public Optional<Payment> findById(Integer id) {
        return repository.findById(id);
    }

    public Payment save(Payment p) {
        return repository.save(p);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
