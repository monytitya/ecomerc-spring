package com.example.MSspringIntellij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MSspringIntellij.model.AboutUs;

@Repository
public interface AboutUsRepository extends JpaRepository<AboutUs, Integer> {
}
