package com.example.MSspringIntellij.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MSspringIntellij.model.EnquiryType;
import com.example.MSspringIntellij.service.EnquiryTypeService;

@RestController
@RequestMapping("/api/enquiry-types")
public class EnquiryTypeController {

    private final EnquiryTypeService service;

    @Autowired
    public EnquiryTypeController(EnquiryTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<EnquiryType> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<EnquiryType> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EnquiryType> create(@RequestBody EnquiryType obj) { return ResponseEntity.ok(service.save(obj)); }

    @PutMapping("/{id}")
    public ResponseEntity<EnquiryType> update(@PathVariable Integer id, @RequestBody EnquiryType obj) {
        return service.findById(id)
                .map(existing -> {
                    obj.setEnquiryId(id);
                    return ResponseEntity.ok(service.save(obj));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (service.findById(id).isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
