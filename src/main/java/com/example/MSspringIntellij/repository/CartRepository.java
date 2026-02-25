package com.example.MSspringIntellij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MSspringIntellij.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
}
