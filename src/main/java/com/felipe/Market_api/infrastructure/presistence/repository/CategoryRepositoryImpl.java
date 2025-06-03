package com.felipe.Market_api.infrastructure.presistence.repository;

import com.felipe.Market_api.domain.model.Category;
import com.felipe.Market_api.domain.repository.CategoryRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRespository {

    @Autowired
    private CategoryJpaRepository categoryJpaRepository;

    //metods from CategoryRespository interface

    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public Category getCategoryById(Integer categoryId) {
        return null;
    }

    @Override
    public Category saveCategory(Category category) {
        return null;
    }

    @Override
    public void deleteCategory(Integer categoryId) {

    }

    @Override
    public List<Category> getActiveCategories() {
        return List.of();
    }

    @Override
    public List<Category> getInactiveCategories() {
        return List.of();
    }

    @Override
    public List<Category> getCategoriesByName(String name) {
        return List.of();
    }

    @Override
    public Boolean existsByName(String name) {
        return null;
    }

    @Override
    public Category updateCategoryName(Integer id, String newName) {
        return null;
    }

    @Override
    public List<Category> getCategoriesSortedByName() {
        return List.of();
    }

    @Override
    public Long countCategories() {
        return 0L;
    }
}
