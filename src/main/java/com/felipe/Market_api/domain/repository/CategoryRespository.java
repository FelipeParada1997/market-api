package com.felipe.Market_api.domain.repository;

import com.felipe.Market_api.domain.model.Category;
import com.felipe.Market_api.infrastructure.persistence.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz que define las operaciones de persistencia para la entidad Category.
 * Define el contrato para manejar el acceso a datos de las categorías.
 */
public interface CategoryRespository {

    /**
     * Recupera todas las categorías almacenadas.
     * @return Lista con todas las categorías existentes
     */
    Optional<Category> getByCategoryAndProducts(Integer id);

    /**
     * Busca una categoría específica por su ID.
     * @param categoryId el ID de la categoría a buscar
     * @return la categoría encontrada o null si no existe
     */
    Category getCategoryById(Integer categoryId);

    /**
     * Guarda una nueva categoría o actualiza una existente.
     * @param category la categoría a guardar
     * @return la categoría guardada con su ID asignado
     */
    CategoryEntity saveCategory(Category category);

    /**
     * Elimina una categoría por su ID.
     * @param categoryId el ID de la categoría a eliminar
     */
    void deleteCategory(Integer categoryId);

    /**
     * Obtiene todas las categorías que están activas.
     * @return lista de categorías activas
     */
    List<Category> getActiveCategories();

    /**
     * Obtiene todas las categorías que están inactivas.
     * @return lista de categorías inactivas
     */
    List<Category> getInactiveCategories();

    /**
     * Busca categorías que contengan el nombre especificado.
     * @param name nombre o parte del nombre a buscar
     * @return lista de categorías que coinciden con el criterio de búsqueda
     */
    List<Category> getCategoriesByName(String name);

    /**
     * Verifica si existe una categoría con el nombre exacto especificado.
     * @param name el nombre de la categoría a verificar
     * @return true si existe una categoría con ese nombre, false en caso contrario
     */
    Boolean existsByName(String name);

    /**
     * Actualiza el nombre de una categoría existente.
     * @param id ID de la categoría a actualizar
     * @param newName nuevo nombre para la categoría
     * @return la categoría actualizada
     */
    Category updateCategoryName(Integer id, String newName);

    /**
     * Obtiene todas las categorías ordenadas alfabéticamente por nombre.
     * @return lista de categorías ordenadas por nombre
     */
    List<Category> getCategoriesSortedByName();

    /**
     * Cuenta el número total de categorías existentes.
     * @return cantidad total de categorías
     */
    Long countCategories();

    /**
     * Recupera todas las categorías incluyendo sus productos relacionados.
     * @return lista de categorías con sus productos
     */
    List<Category> findAllCategoryWithProducts();

    /**
     * Cambia el estado de una categoría entre activo e inactivo.
     * @param id ID de la categoría a modificar
     */
    void toggleCategoryStatus(Integer id);

    List<Category> findAllCategories();
}
