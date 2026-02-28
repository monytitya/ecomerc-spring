package com.example.MSspringIntellij.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.MSspringIntellij.model.Wishlist;
import com.example.MSspringIntellij.service.WishlistService;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {

    private final WishlistService service;

    public WishlistController(WishlistService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Wishlist>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Wishlist> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Wishlist> create(@RequestBody Wishlist wishlist) {
        Wishlist saved = service.save(wishlist);
        return ResponseEntity.status(201).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Wishlist> update(@PathVariable Integer id,
            @RequestBody Wishlist wishlist) {
        return service.findById(id)
                .map(existing -> {
                    wishlist.setWishlistId(id);
                    Wishlist updated = service.save(wishlist);
                    return ResponseEntity.ok(updated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        Optional<Wishlist> wishlist = service.findById(id);
        if (wishlist.isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}