package com.felipe.Market_api.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static com.felipe.Market_api.shared.Constants.Entity.DEFAULT_ACTIVE_STATUS;
import static com.felipe.Market_api.shared.Constants.Entity.DEFAULT_IS_DEFAULT;

/**
 * Entidad que representa una categoría en la base de datos.
 * Esta clase extiende de {@link BaseEntity} para heredar los campos de auditoría.
 */
@Entity
@Table(name = "categorias")
@AttributeOverride(name = "id", column = @Column(name = "id_categoria"))
public class CategoryEntity extends BaseEntity {

    /**
     * Nombre o descripción de la categoría.
     * Este campo es único y obligatorio.
     */
    @Column(name = "descripcion", unique = true, nullable = false)
    private String name;

    /**
     * Estado de la categoría.
     * Indica si la categoría está activa o no.
     */
    @Column(name = "estado", nullable = false)
    private Boolean active = DEFAULT_ACTIVE_STATUS;

    /**
     * Indica si esta es una categoría por defecto del sistema.
     */
    @Column(name = "is_default")
    private Boolean isDefault = DEFAULT_IS_DEFAULT;

    /**
     * Lista de productos asociados a esta categoría.
     * La relación es uno a muchos y se carga de manera perezosa (lazy).
     */
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<ProductEntity> products = new ArrayList<>();

    /**
     * Obtiene el nombre de la categoría.
     *
     * @return el nombre de la categoría
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la categoría.
     *
     * @param name el nuevo nombre de la categoría
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Verifica si la categoría está activa.
     *
     * @return true si la categoría está activa, false en caso contrario
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Establece el estado de la categoría.
     *
     * @param active el nuevo estado de la categoría
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Obtiene la lista de productos asociados a esta categoría.
     *
     * @return lista de productos de la categoría
     */
    public List<ProductEntity> getProducts() {
        return products;
    }

    /**
     * Establece la lista de productos de la categoría.
     *
     * @param products nueva lista de productos
     */
    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    /**
     * Verifica si esta es una categoría por defecto.
     *
     * @return true si es una categoría por defecto, false en caso contrario
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Establece si esta es una categoría por defecto.
     *
     * @param isDefault el nuevo valor para indicar si es una categoría por defecto
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}

