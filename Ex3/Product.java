package org.FastTrackIt.HomeWork07.Ex3;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }


    public boolean hasStock() {
        if (this.quantity != 0) {
            return true;
        }
        return false;
    }

    public boolean isCategory(String category) {
        if (this.category.equals(category)) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Product :" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stoc=" + hasStock() +
                ", quantity=" + quantity +
                ", category='" + category + '\'';
    }
}
