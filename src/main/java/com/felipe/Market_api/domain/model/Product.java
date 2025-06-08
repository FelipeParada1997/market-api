package com.felipe.Market_api.domain.model;

import java.util.List;

public final class Product {

    private final Long productId;
    private final String name;
    private final String description;
    private final Double price;
    private final Integer stock;
    private final Boolean active;
    private final Category category;

    private Product(Builder builder){
        this.productId = builder.productId;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.stock = builder.stock;
        this.active = builder.active != null ? builder.active : true; // Default to true if not set
        this.category = builder.category;
    }

    public static Category.Builder builder() {
        return new Category.Builder();
    }

    public static class Builder {
        private Long productId;
        private String name;
        private String description;
        private Double price;
        private Integer stock;
        private Boolean active;
        private Category category;

        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Builder stock(Integer stock) {
            this.stock = stock;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }
    }

    // Getters and Setters
    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Boolean isActive() {
        return active;
    }

    public Category getCategory() {
        return category;
    }

}
