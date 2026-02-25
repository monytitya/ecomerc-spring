package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.Store;
import com.example.MSspringIntellij.repository.StoreRepository;

@Service
public class StoreService {

    private final StoreRepository repository;

    @Autowired
    public StoreService(StoreRepository repository) {
        this.repository = repository;
    }

    public List<Store> findAll() {
        return repository.findAll();
    }

    public Optional<Store> findById(Integer id) {
        return repository.findById(id);
    }

    public Store save(Store s) {
        return repository.save(s);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
