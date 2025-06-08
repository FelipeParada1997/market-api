package com.felipe.Market_api.infrastructure.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * Clase base abstracta que proporciona atributos comunes para todas las entidades.
 * Implementa la funcionalidad de auditoría básica con timestamps de creación y actualización.
 */
@MappedSuperclass
public abstract class BaseEntity {

    /**
     * Constructor protegido para uso de JPA.
     */
    protected BaseEntity() {
        // Constructor para JPA
    }

    /**
     * Identificador único de la entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Fecha y hora de creación del registro.
     * Este campo se genera automáticamente y no es actualizable.
     */
    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    /**
     * Fecha y hora de la última actualización del registro.
     * Este campo se actualiza automáticamente en cada modificación.
     */
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    /**
     * Identificador del usuario que creó el registro.
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * Identificador del usuario que actualizó el registro.
     */
    @Column(name = "updated_by")
    private String updatedBy;

    // Getters y Setters

    /**
     * Obtiene el identificador del usuario que creó el registro.
     *
     * @return El identificador del usuario que creó el registro.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Establece el identificador del usuario que creó el registro.
     *
     * @param createdBy El identificador del usuario que creó el registro.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Obtiene el identificador del usuario que actualizó el registro.
     *
     * @return El identificador del usuario que actualizó el registro.
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Establece el identificador del usuario que actualizó el registro.
     *
     * @param updatedBy El identificador del usuario que actualizó el registro.
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * Obtiene el identificador único de la entidad.
     *
     * @return El identificador único de la entidad.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establece el identificador único de la entidad.
     *
     * @param id El identificador único de la entidad.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha y hora de creación del registro.
     *
     * @return La fecha y hora de creación del registro.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Obtiene la fecha y hora de la última actualización del registro.
     *
     * @return La fecha y hora de la última actualización del registro.
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
