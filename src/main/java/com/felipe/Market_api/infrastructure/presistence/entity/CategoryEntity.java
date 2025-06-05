package com.felipe.Market_api.infrastructure.presistence.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorias")
@AttributeOverride(name = "id", column = @Column(name = "id_categoria"))
public class CategoryEntity extends BaseEntity {

    @Column(name = "descripcion", unique = true, nullable = false)
    private String name;

    @Column(name = "estado", nullable = false)
    private Boolean active;

    @Column(name = "is_default")
    private Boolean isDefault = false;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<ProductEntity> products = new ArrayList<>();

    // Getters and Setters



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }
}