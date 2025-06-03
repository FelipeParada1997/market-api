package com.felipe.Market_api.infrastructure.persistence.entity;

import com.felipe.Market_api.infrastructure.presistence.entity.CategoryEntity;
import com.felipe.Market_api.infrastructure.presistence.entity.ProductEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class EntityRelationshipTest {



    @Test
    public void testProductEntity() {
        ProductEntity product = new ProductEntity();
        product.setProductId(1);
        product.setName("Test Product");
        product.setBarCode("123456789");
        product.setPrice(10.5);
        product.setStock(100);
        product.setActive(true);
        product.setCategoryId(2);

        System.out.println("ProductEntity: " +
                "id=" + product.getProductId() +
                ", name=" + product.getName() +
                ", barCode=" + product.getBarCode() +
                ", price=" + product.getPrice() +
                ", stock=" + product.getStock() +
                ", active=" + product.getActive() +
                ", categoryId=" + product.getCategoryId());

        assertEquals(1, product.getProductId());
        assertEquals("Test Product", product.getName());
        assertEquals("123456789", product.getBarCode());
        assertEquals(10.5, product.getPrice());
        assertEquals(100, product.getStock());
        assertTrue(product.getActive());
        assertEquals(2, product.getCategoryId());
    }

    @Test
    public void testCategoryEntity() {
        CategoryEntity category = new CategoryEntity();
        category.setCategoryId(1);
        category.setName("Test Category");
        category.setActive(true);
        category.setIsDefault(false);

        System.out.println("CategoryEntity: " +
                "id=" + category.getCategoryId() +
                ", name=" + category.getName() +
                ", active=" + category.getActive() +
                ", isDefault=" + category.getIsDefault());

        assertEquals(1, category.getCategoryId());
        assertEquals("Test Category", category.getName());
        assertTrue(category.getActive());
        assertFalse(category.getIsDefault());
    }

    @Test
    public void testDefaultCategory() {
        CategoryEntity category = new CategoryEntity();
        category.setName("Product");
        category.setActive(true);
        category.setIsDefault(true);

        System.out.println("Default CategoryEntity: " +
                "name=" + category.getName() +
                ", active=" + category.getActive() +
                ", isDefault=" + category.getIsDefault());

        assertEquals("Product", category.getName());
        assertTrue(category.getActive());
        assertTrue(category.getIsDefault());
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
        product.setCategoryId(category.getCategoryId());

        List<ProductEntity> products = new ArrayList<>();
        products.add(product);
        category.setProducts(products);

        System.out.println("Category-Product Relationship: " +
                "categoryId=" + category.getCategoryId() +
                ", productCount=" + category.getProducts().size() +
                ", firstProductName=" + category.getProducts().get(0).getName());

        assertEquals(1, category.getProducts().size());
        assertEquals("Test Product", category.getProducts().get(0).getName());
        assertEquals(category.getCategoryId(), product.getCategoryId());
    }
}
