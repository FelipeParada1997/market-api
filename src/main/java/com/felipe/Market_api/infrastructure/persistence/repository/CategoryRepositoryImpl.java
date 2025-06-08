package com.felipe.Market_api.infrastructure.persistence.repository;

import com.felipe.Market_api.domain.model.Category;
import com.felipe.Market_api.domain.repository.CategoryRespository;
import com.felipe.Market_api.infrastructure.persistence.entity.CategoryEntity;
import com.felipe.Market_api.infrastructure.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * Implementación de {@link CategoryRespository} que maneja la persistencia de categorías
 * utilizando JPA.
 */
public class CategoryRepositoryImpl implements CategoryRespository {

    @Autowired
    private CategoryJpaRepository categoryJpaRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * Obtiene todas las categorías con sus productos relacionados.
     * @return Lista de categorías con sus productos.
     */
    @Override
    public List<Category> findAllCategoryWithProducts() {
        return null;
    }

    public List<Category> findAllCategories() {
        return categoryJpaRepository.findAll().stream()
                .map(categoryMapper::toCategory)
                .toList();
    }

    /**
     * Cambia el estado de una categoría entre activo e inactivo.
     * @param id ID de la categoría a modificar
     */
    @Override
    public void toggleCategoryStatus(Integer id) {
    }

    /**
     * Obtiene una categoría existente con todos sus productos.
     * @return Lista de los productos con esa categoria.
     */
    @Override
    public Optional<Category> getByCategoryAndProducts(Integer id) {
        return null;
    }

    /**
     * Busca una categoría por su ID.
     * @param categoryId ID de la categoría a buscar
     * @return La categoría encontrada o null si no existe
     */
    @Override
    public Category getCategoryById(Integer categoryId) {
        return null;
    }

    /**
     * Guarda una nueva categoría.
     * @param category Categoría a guardar
     * @return La categoría guardada con su ID asignado
     */
    @Override
    public CategoryEntity saveCategory(Category category) {
        CategoryEntity categoryEntity = categoryMapper.toCategoryEntity(category);
        return categoryJpaRepository.save(categoryEntity);
    }

    /**
     * Elimina una categoría por su ID.
     * @param categoryId ID de la categoría a eliminar
     */
    @Override
    public void deleteCategory(Integer categoryId) {
        categoryJpaRepository.deleteById(categoryId);
    }

    /**
     * Obtiene todas las categorías activas.
     * @return Lista de categorías activas
     */
    @Override
    public List<Category> getActiveCategories() {
        return List.of();
    }

    /**
     * Obtiene todas las categorías inactivas.
     * @return Lista de categorías inactivas
     */
    @Override
    public List<Category> getInactiveCategories() {
        return List.of();
    }

    /**
     * Busca categorías por nombre.
     * @param name Nombre o parte del nombre a buscar
     * @return Lista de categorías que coinciden con el nombre
     */
    @Override
    public List<Category> getCategoriesByName(String name) {
        return List.of();
    }

    /**
     * Verifica si existe una categoría con el nombre especificado.
     * @param name Nombre a verificar
     * @return true si existe, false si no
     */
    @Override
    public Boolean existsByName(String name) {
        return null;
    }

    /**
     * Actualiza el nombre de una categoría.
     * @param id ID de la categoría a actualizar
     * @param newName Nuevo nombre para la categoría
     * @return La categoría actualizada
     */
    @Override
    public Category updateCategoryName(Integer id, String newName) {
        return null;
    }

    /**
     * Obtiene todas las categorías ordenadas alfabéticamente por nombre.
     * @return Lista de categorías ordenadas por nombre
     */
    @Override
    public List<Category> getCategoriesSortedByName() {
        return List.of();
    }

    /**
     * Cuenta el número total de categorías.
     * @return Número total de categorías
     */
    @Override
    public Long countCategories() {
        return 0L;
    }
}
