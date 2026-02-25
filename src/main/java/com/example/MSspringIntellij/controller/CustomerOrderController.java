package com.example.MSspringIntellij.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MSspringIntellij.model.CustomerOrder;
import com.example.MSspringIntellij.service.CustomerOrderService;

@RestController
@RequestMapping("/api/customer-orders")
public class CustomerOrderController {

    private final CustomerOrderService service;

    @Autowired
    public CustomerOrderController(CustomerOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomerOrder> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerOrder> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CustomerOrder> create(@RequestBody CustomerOrder obj) {
        return ResponseEntity.ok(service.save(obj));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerOrder> update(@PathVariable Integer id, @RequestBody CustomerOrder obj) {
        return service.findById(id)
                .map(existing -> {
                    obj.setOrderId(id);
                    return ResponseEntity.ok(service.save(obj));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (service.findById(id).isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
