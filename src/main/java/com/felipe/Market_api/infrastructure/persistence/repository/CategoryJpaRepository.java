package com.felipe.Market_api.infrastructure.persistence.repository;

import com.felipe.Market_api.domain.model.Category;
import com.felipe.Market_api.infrastructure.persistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio JPA para la entidad {@link CategoryEntity}.
 * Proporciona operaciones de acceso a datos para las categorías en la base de datos.
 */
public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Integer> {

    /**Encuentra todas las categorías que están activas.
     * */
    List<CategoryEntity> findByActiveTrue();

    /**
     * Encuentra todas las categorías que están inactivas.
     */
    List<CategoryEntity> findByActiveFalse();

    /**
     * Busca categorías que contengan el nombre especificado, ignorando mayúsculas y minúsculas.
     */
    List<CategoryEntity> findByNameContainingIgnoreCase(String name);

    /**
     * Verifica si existe una categoría con el nombre exacto especificado, ignorando mayúsculas y minúsculas.
    boolean existsByNameIgnoreCase(String name);
    */
    boolean existsByName(String name);

     /**
     * Obtiene todas las categorías ordenadas alfabéticamente por nombre.
     */
    List<CategoryEntity> findAllByOrderByNameAsc();

    /** Obtiene una categoría existente con todos sus productos.
     * Utiliza {@link EntityGraph} para optimizar la carga de relaciones.
     */
    @EntityGraph(attributePaths = {"products"})
    Optional<CategoryEntity> findById(Integer id);

    /**
     * Obtiene todas las categorías con sus productos relacionados.
     * Utiliza {@link EntityGraph} para evitar el problema N+1.
     */

    List<CategoryEntity> findAll();
}
