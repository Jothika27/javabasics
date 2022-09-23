package com.stream.hashing;

public class Product {
    private String brand;
    private String name;
    private String category;
    private int id;
    private float price;
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [brand=" + brand + ", category=" + category + ", id=" + id + ", name=" + name + ", price="
                + price + "]";
    }
 
}
