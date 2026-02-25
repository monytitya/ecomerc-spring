package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.EnquiryType;
import com.example.MSspringIntellij.repository.EnquiryTypeRepository;

@Service
public class EnquiryTypeService {

    private final EnquiryTypeRepository repository;

    @Autowired
    public EnquiryTypeService(EnquiryTypeRepository repository) {
        this.repository = repository;
    }

    public List<EnquiryType> findAll() {
        return repository.findAll();
    }

    public Optional<EnquiryType> findById(Integer id) {
        return repository.findById(id);
    }

    public EnquiryType save(EnquiryType e) {
        return repository.save(e);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
