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

import com.example.MSspringIntellij.model.Store;
import com.example.MSspringIntellij.service.StoreService;

@RestController
@RequestMapping("/api/stores")
public class StoreController {

    private final StoreService service;

    @Autowired
    public StoreController(StoreService service) {
        this.service = service;
    }

    @GetMapping
    public List<Store> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Store> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Store> create(@RequestBody Store obj) { return ResponseEntity.ok(service.save(obj)); }

    @PutMapping("/{id}")
    public ResponseEntity<Store> update(@PathVariable Integer id, @RequestBody Store obj) {
        return service.findById(id)
                .map(existing -> {
                    obj.setStoreId(id);
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
