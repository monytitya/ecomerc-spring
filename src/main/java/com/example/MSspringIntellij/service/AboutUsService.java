package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.AboutUs;
import com.example.MSspringIntellij.repository.AboutUsRepository;

@Service
public class AboutUsService {

    private final AboutUsRepository aboutUsRepository;

    @Autowired
    public AboutUsService(AboutUsRepository aboutUsRepository) {
        this.aboutUsRepository = aboutUsRepository;
    }

    public List<AboutUs> findAll() {
        return aboutUsRepository.findAll();
    }

    public Optional<AboutUs> findById(Integer id) {
        return aboutUsRepository.findById(id);
    }

    public AboutUs save(AboutUs entity) {
        return aboutUsRepository.save(entity);
    }

    public void deleteById(Integer id) {
        aboutUsRepository.deleteById(id);
    }
}
