package com.example.MSspringIntellij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MSspringIntellij.model.EnquiryType;

@Repository
public interface EnquiryTypeRepository extends JpaRepository<EnquiryType, Integer> {
}
