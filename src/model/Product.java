package model;

public class Product {

    private String title;

    private float price;

    public Product(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }
}
