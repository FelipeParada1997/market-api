package com.felipe.Market_api.infrastructure.presistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import static com.felipe.Market_api.shared.Constants.Entity.DEFAULT_ACTIVE_STATUS;

/**
 * Entidad que representa un producto en la base de datos.
 * Esta clase extiende de {@link BaseEntity} para heredar los campos de auditoría.
 */
@Entity
@Table(name = "productos", indexes = {
        @Index(name = "idx_producto_codigo", columnList = "codigo_producto")
})
@AttributeOverride(name = "id", column = @Column(name = "id_producto"))
public class ProductEntity extends BaseEntity {

    /**
     * Identificador de la categoría a la que pertenece el producto.
     */
    @Column(name = "id_categoria")
    private Integer categoryId;

    /**
     * Nombre del producto.
     * Limitado a 100 caracteres.
     */
    @Column(name = "nombre", length = 100)
    @Size(max = 100)
    private String name;

    /**
     * Referencia a la entidad CategoryEntity.
     * Relación muchos a uno cargada de manera perezosa (lazy).
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    @NotNull(message = "La categoría es obligatoria")
    private CategoryEntity category;

    /**
     * Código único del producto.
     */
    @Column(name = "codigo_producto", unique = true)
    @NotBlank(message = "El código del producto es obligatorio")
    private String productCode;

    /**
     * Precio de venta del producto.
     */
    @Column(name = "precio_venta", nullable = false)
    @Min(value = 0, message = "El precio no puede ser negativo")
    private Double price;

    /**
     * Cantidad disponible en inventario.
     */
    @Column(name = "cantidad_stock", nullable = false)
    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stock;

    /**
     * Estado del producto (activo/inactivo).
     */
    @Column(name = "estado")
    private Boolean active = DEFAULT_ACTIVE_STATUS;

    // Getters y Setters

    /**
     * Obtiene el identificador de la categoría.
     *
     * @return el identificador de la categoría
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * Establece el identificador de la categoría.
     *
     * @param categoryId el identificador de la categoría
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre del producto
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param name el nombre del producto
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return la categoría del producto
     */
    public CategoryEntity getCategory() {
        return category;
    }

    /**
     * Establece la categoría del producto.
     *
     * @param category la categoría del producto
     */
    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    /**
     * Obtiene el código único del producto.
     *
     * @return el código del producto
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Establece el código único del producto.
     *
     * @param productCode el código del producto
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * Obtiene el precio de venta del producto.
     *
     * @return el precio del producto
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Establece el precio de venta del producto.
     *
     * @param price el precio del producto
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Obtiene la cantidad disponible en inventario.
     *
     * @return la cantidad en stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * Establece la cantidad disponible en inventario.
     *
     * @param stock la cantidad en stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * Obtiene el estado del producto.
     *
     * @return true si está activo, false si no
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Establece el estado del producto.
     *
     * @param active true para activar, false para desactivar
     */
    public void setActive(Boolean active) {
        this.active = active;
    }
}