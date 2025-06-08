package com.felipe.Market_api.infrastructure.persistence.mapper;

import com.felipe.Market_api.domain.model.Category;
import com.felipe.Market_api.infrastructure.persistence.entity.CategoryEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CategoryMapper {

    public Category toCategory(CategoryEntity categoryEntity) {
        if (categoryEntity == null) return null;

        return Category.builder()
                .id(categoryEntity.getId())
                .name(categoryEntity.getName())
                .active(categoryEntity.isActive())
                .createdAt(categoryEntity.getCreatedAt())
                .updatedAt(categoryEntity.getUpdatedAt())
                .isDefault(categoryEntity.getIsDefault())
                .createdBy(null)
                .updatedBy(null)
                .build();
    }

    public CategoryEntity toCategoryEntity(Category category) {
        if (category == null) return null;

        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(category.getCategoryId());
        categoryEntity.setName(category.getName());
        categoryEntity.setActive(category.isActive());
        categoryEntity.setCreatedAt(LocalDateTime.now());
        categoryEntity.setUpdatedAt(LocalDateTime.now());
        categoryEntity.setCreatedBy(category.getCreatedBy());
        categoryEntity.setUpdatedBy(category.getUpdatedBy());
        return categoryEntity;
    }
}
