package com.felipe.Market_api.infrastructure.persistence.entity;

import com.felipe.Market_api.infrastructure.presistence.entity.CategoryEntity;
import com.felipe.Market_api.infrastructure.presistence.entity.ProductEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class EntityRelationshipTest {

    @Test
    public void testProductEntityWithCategoryId() {
        ProductEntity product = new ProductEntity();
        product.setProductId(1);
        product.setName("Test Product");
        product.setBarCode("123456789");
        product.setPrice(10.5);
        product.setStock(100);
        product.setActive(true);

        // Simular manejo manual del id_categoria
        product.setCategoryId(2);

        assertEquals(2, product.getCategoryId());
        assertNull(product.getCategory());
    }

    @Test
    public void testCategoryEntity() {
        CategoryEntity category = new CategoryEntity();
        category.setCategoryId(1);
        category.setName("Test Category");
        category.setActive(true);

        assertEquals(1, category.getCategoryId());
        assertEquals("Test Category", category.getName());
        assertTrue(category.getActive());
    }

    @Test
    public void testCategoryProductRelationship() {
        CategoryEntity category = new CategoryEntity();
        category.setCategoryId(1);
        category.setName("Test Category");
        category.setActive(true);

        ProductEntity product = new ProductEntity();
        product.setProductId(1);
        product.setName("Test Product");
        product.setCategory(category);

        List<ProductEntity> products = new ArrayList<>();
        products.add(product);
        category.setProducts(products);

        // Verificar la relación bidireccional
        assertNotNull(product.getCategory());
        assertEquals("Test Category", product.getCategory().getName());
        assertEquals(1, category.getProducts().size());
        assertEquals("Test Product", category.getProducts().get(0).getName());
    }
}
