package com.example.MSspringIntellij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MSspringIntellij.model.PendingOrder;

@Repository
public interface PendingOrderRepository extends JpaRepository<PendingOrder, Integer> {
}
