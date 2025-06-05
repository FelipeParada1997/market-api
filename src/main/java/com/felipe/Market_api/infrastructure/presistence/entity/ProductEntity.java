package com.felipe.Market_api.infrastructure.presistence.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "productos")
@AttributeOverride(name = "id", column = @Column(name = "id_producto"))
public class ProductEntity extends BaseEntity {

    @Column(name = "id_categoria")
    private Integer categoryId;

    @Column(name = "nombre")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private CategoryEntity category;

    @Column(name = "codigo_barras")
    private String barCode;

    @Column(name = "precio_venta")
    private Double price;

    @Column(name = "cantidad_stock")
    private Integer stock;

    @Column(name = "estado")
    private Boolean active;


    // Getters y setters...


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}




