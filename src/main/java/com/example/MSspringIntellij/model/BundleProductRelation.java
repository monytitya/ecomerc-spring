package com.example.MSspringIntellij.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bundle_product_relation")
public class BundleProductRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rel_id")
    private Integer relId;

    @Column(name = "rel_title")
    private String relTitle;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "bundle_id")
    private Integer bundleId;

    public void setRelId1(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setRelId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
