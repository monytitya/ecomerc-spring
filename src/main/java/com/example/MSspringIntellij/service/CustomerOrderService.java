package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.CustomerOrder;
import com.example.MSspringIntellij.repository.CustomerOrderRepository;

@Service
public class CustomerOrderService {

    private final CustomerOrderRepository repository;

    @Autowired
    public CustomerOrderService(CustomerOrderRepository repository) {
        this.repository = repository;
    }

    public List<CustomerOrder> findAll() {
        return repository.findAll();
    }

    public Optional<CustomerOrder> findById(Integer id) {
        return repository.findById(id);
    }

    public CustomerOrder save(CustomerOrder order) {
        return repository.save(order);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
