package com.example.MSspringIntellij.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MSspringIntellij.model.ContactUs;
import com.example.MSspringIntellij.repository.ContactUsRepository;

@Service
public class ContactUsService {

    private final ContactUsRepository contactUsRepository;

    @Autowired
    public ContactUsService(ContactUsRepository contactUsRepository) {
        this.contactUsRepository = contactUsRepository;
    }

    public List<ContactUs> findAll() {
        return contactUsRepository.findAll();
    }

    public Optional<ContactUs> findById(Integer id) {
        return contactUsRepository.findById(id);
    }

    public ContactUs save(ContactUs contact) {
        return contactUsRepository.save(contact);
    }

    public void deleteById(Integer id) {
        contactUsRepository.deleteById(id);
    }
}
