package com.felipe.Market_api.infrastructure.presistence.repository;

import com.felipe.Market_api.infrastructure.presistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Integer> {

}
