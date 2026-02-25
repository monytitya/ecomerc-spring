package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.Wishlist;
import com.example.MSspringIntellij.repository.WishlistRepository;

@Service
public class WishlistService {

    private final WishlistRepository repository;

    @Autowired
    public WishlistService(WishlistRepository repository) {
        this.repository = repository;
    }

    public List<Wishlist> findAll() { return repository.findAll(); }
    public Optional<Wishlist> findById(Integer id) { return repository.findById(id); }
    public Wishlist save(Wishlist w) { return repository.save(w); }
    public void deleteById(Integer id) { repository.deleteById(id); }
}
