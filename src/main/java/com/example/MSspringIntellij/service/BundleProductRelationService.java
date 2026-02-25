package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.BundleProductRelation;
import com.example.MSspringIntellij.repository.BundleProductRelationRepository;

@Service
public class BundleProductRelationService {

    private final BundleProductRelationRepository repo;

    @Autowired
    public BundleProductRelationService(BundleProductRelationRepository repo) {
        this.repo = repo;
    }

    public List<BundleProductRelation> findAll() {
        return repo.findAll();
    }

    public Optional<BundleProductRelation> findById(Integer id) {
        return repo.findById(id);
    }

    public BundleProductRelation save(BundleProductRelation bpr) {
        return repo.save(bpr);
    }

    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
