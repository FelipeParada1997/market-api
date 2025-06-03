package com.felipe.Market_api.domain.model;

public class Category {
    private Integer categoryId;
    private String name;
    private Boolean active;
    private Boolean isDefault;

    public Category() {
    }

    public Category(Integer categoryId, String name, Boolean active, Boolean isDefault) {
        this.categoryId = categoryId;
        this.name = name;
        this.active = active;
        this.isDefault = isDefault;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}

