package com.example.MSspringIntellij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MSspringIntellij.model.BundleProductRelation;

@Repository
public interface BundleProductRelationRepository extends JpaRepository<BundleProductRelation, Integer> {
}
