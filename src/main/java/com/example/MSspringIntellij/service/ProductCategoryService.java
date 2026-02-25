package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.ProductCategory;
import com.example.MSspringIntellij.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {

    private final ProductCategoryRepository repository;

    @Autowired
    public ProductCategoryService(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    public Optional<ProductCategory> findById(Integer id) {
        return repository.findById(id);
    }

    public ProductCategory save(ProductCategory pc) {
        return repository.save(pc);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
