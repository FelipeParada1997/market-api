package com.felipe.Market_api.infrastructure.presistence.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorias")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer categoryId;

    @Column(name = "descripcion", unique = true, nullable = false)
    private String name;

    @Column(name = "estado", nullable = false)
    private Boolean active;

    @Column(name = "is_default")
    private Boolean isDefault = false;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<ProductEntity> products = new ArrayList<>();

    public Integer getCategoryId() {

