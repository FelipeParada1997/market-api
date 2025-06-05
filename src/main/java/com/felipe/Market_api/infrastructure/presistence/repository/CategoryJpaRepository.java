package com.felipe.Market_api.infrastructure.presistence.repository;

import com.felipe.Market_api.infrastructure.presistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Integer> {

    List<CategoryEntity> findByActiveTrue();
    List<CategoryEntity> findByActiveFalse();
    List<CategoryEntity> findByNameContainingIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);
    List<CategoryEntity> findAllByOrderByNameAsc();
    @EntityGraph(attributePaths = {"products"})
    List<CategoryEntity> findAll();
}
