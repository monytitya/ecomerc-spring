package com.example.MSspringIntellij.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "about_us")
public class AboutUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "about_id")
    private Integer aboutId;

    @Lob
    @Column(name = "about_heading")
    private String aboutHeading;

    @Lob
    @Column(name = "about_short_desc")
    private String aboutShortDesc;

    @Lob
    @Column(name = "about_desc")
    private String aboutDesc;

    public void setAboutId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
