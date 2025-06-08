package com.felipe.Market_api.domain.model;
import com.felipe.Market_api.infrastructure.persistence.entity.ProductEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una categoría en el dominio de negocio.
 */
public final class Category {
    private final Integer categoryId;
    private final String name;
    private final boolean active;
    private final boolean isDefault;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    private final String createdBy;
    private final String updatedBy;
    private final List<Product> products; // Lista de productos asociados a la categoría


    private Category(Builder builder) {
        this.categoryId = builder.id;         // Asigna el id desde el builder
        this.name = builder.name;             // Asigna el nombre desde el builder
        this.active = builder.active;         // Asigna el estado activo desde el builder
        this.createdAt = builder.createdAt;   // Asigna la fecha de creación desde el builder
        this.updatedAt = builder.updatedAt;   // Asigna la fecha de actualización desde el builder
        this.isDefault = builder.isDefault;               // Asigna el valor por defecto como false
        this.createdBy = builder.createdBy;                // Asigna el creador como null (puede ser modificado)
        this.updatedBy = builder.updatedBy;                // Asigna el actualizador como null (puede ser modificado)
        this.products = builder.products; // Asigna la lista de productos desde el builder
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Clase Builder para construir instancias de Category de manera fluida.
     * Permite establecer los campos opcionales y obligatorios de la categoría.
     */
    public static class Builder {
        // Campos que se irán configurando
        private Integer id;
        private String name;
        private boolean active;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private boolean isDefault = false; // Valor por defecto para isDefault
        private String createdBy = null;   // Creador por defecto es null
        private String updatedBy = null;   // Actualizador por defecto es null
        private List<Product> products = new ArrayList<>(); // Lista de productos asociados

        // Métodos para establecer cada campo, retornan el builder para encadenar llamadas
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder isDefault(boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder createdBy(String createdBy)
        { this.createdBy = createdBy;
            return this;
        }

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        // Método que construye la instancia final de Category usando los valores configurados
        public Category build() {
            return new Category(this);
        }

        public Builder products(List<Product> products) {
            this.products = products;
            return this;
        }
    }



    // Getters y Setters básicos
    public Integer getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }


    public boolean isActive() {
        return active;
    }


    public boolean isDefault() {
        return isDefault;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


    public String getCreatedBy() {
        return createdBy;
    }


    public String getUpdatedBy() {
        return updatedBy;
    }

    public List<Product> getProducts() {
        return products;
    }

}