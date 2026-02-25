package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.Manufacturer;
import com.example.MSspringIntellij.repository.ManufacturerRepository;

@Service
public class ManufacturerService {

    private final ManufacturerRepository repository;

    @Autowired
    public ManufacturerService(ManufacturerRepository repository) {
        this.repository = repository;
    }

    public List<Manufacturer> findAll() {
        return repository.findAll();
    }

    public Optional<Manufacturer> findById(Integer id) {
        return repository.findById(id);
    }

    public Manufacturer save(Manufacturer m) {
        return repository.save(m);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
