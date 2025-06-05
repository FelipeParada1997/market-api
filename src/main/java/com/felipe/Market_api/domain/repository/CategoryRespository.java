package com.felipe.Market_api.domain.repository;

import com.felipe.Market_api.domain.model.Category;


import java.util.List;

public interface CategoryRespository {

    List<Category> getAllCategories();
    Category getCategoryById(Integer categoryId);
    Category saveCategory(Category category);
    void deleteCategory(Integer categoryId);
    List<Category> getActiveCategories();
    List<Category> getInactiveCategories();
    List<Category> getCategoriesByName(String name);
    Boolean existsByName(String name);
    Category updateCategoryName(Integer id, String newName);
    List<Category> getCategoriesSortedByName();
    Long countCategories();
    List<Category> findAllWithProducts();
    void toggleCategoryStatus(Integer id);
}
