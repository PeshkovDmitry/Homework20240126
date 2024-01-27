package model;

public class Order {

    private Buyer buyer;

    private Product product;

    public Order(Buyer buyer, Product product) {
        this.buyer = buyer;
        this.product = product;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Заказ: " +
                "покупатель " + buyer.getNickname() +
                ", товар " + product.getTitle();
    }
}
