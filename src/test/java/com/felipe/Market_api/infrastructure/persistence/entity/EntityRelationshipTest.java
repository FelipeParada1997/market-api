package com.felipe.Market_api.infrastructure.persistence.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Pruebas unitarias para verificar las relaciones entre entidades
 */
public class EntityRelationshipTest {

    private CategoryEntity category;
    private ProductEntity product;

    @BeforeEach
    void setUp() {
        category = new CategoryEntity();
        category.setId(1);
        category.setName("Test Category");
        category.setActive(true);

        product = new ProductEntity();
        product.setProductId(1);
        product.setName("Test Product");
        product.setBarCode("123456789");
        product.setPrice(10.5);
        product.setStock(100);
        product.setActive(true);
        product.setCategoryId(category.getId());
    }

    @Test
    public void testProductEntity() {
        assertNotNull(product);
        assertEquals(1, product.getProductId());
        assertEquals("Test Product", product.getName());
        assertEquals("123456789", product.getBarCode());
        assertEquals(10.5, product.getPrice());
        assertEquals(100, product.getStock());
        assertTrue(product.isActive());
        assertEquals(category.getId(), product.getCategoryId());
    }

    @Test
    public void testCategoryEntity() {
        List<ProductEntity> products = new ArrayList<>();
        products.add(product);
        category.setProducts(products);

        assertNotNull(category);
        assertEquals(1, category.getId());
        assertEquals("Test Category", category.getName());
        assertTrue(category.isActive());
        assertNotNull(category.getProducts());
        assertEquals(1, category.getProducts().size());
        assertEquals(product, category.getProducts().get(0));
    }
}
