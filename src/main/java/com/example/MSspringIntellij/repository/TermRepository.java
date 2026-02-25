package com.example.MSspringIntellij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MSspringIntellij.model.Term;

@Repository
public interface TermRepository extends JpaRepository<Term, Integer> {
}
