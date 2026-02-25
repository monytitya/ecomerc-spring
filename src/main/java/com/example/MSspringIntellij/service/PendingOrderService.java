package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.PendingOrder;
import com.example.MSspringIntellij.repository.PendingOrderRepository;

@Service
public class PendingOrderService {

    private final PendingOrderRepository repository;

    @Autowired
    public PendingOrderService(PendingOrderRepository repository) {
        this.repository = repository;
    }

    public List<PendingOrder> findAll() {
        return repository.findAll();
    }

    public Optional<PendingOrder> findById(Integer id) {
        return repository.findById(id);
    }

    public PendingOrder save(PendingOrder p) {
        return repository.save(p);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
