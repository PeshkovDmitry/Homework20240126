package model;

import exceptions.NoBuyerException;
import exceptions.NoProductException;
import exceptions.NotPositiveCountException;

public class Market {

    private static int ordersCount = 0;

    public static int getOrdersCount(){
        return ordersCount;
    }

    public static Order buy(String buyerNickname, String productTitle, int count, Buyer[] buyers, Product[] products) throws NotPositiveCountException, NoBuyerException, NoProductException {
        Buyer buyer = null;
        Product product = null;
        if (count < 1 ) {
            throw new NotPositiveCountException(
                    String.format("Количество товаров должно быть положительным (указано %d)", count)
            );
        }
        for (int i = 0; i < buyers.length; i++) {
            if (buyers[i].getNickname().equals(buyerNickname)) {
                buyer = buyers[i];
            }
        }
        if (buyer == null) {
            throw new NoBuyerException(
                    String.format("Покупатель с ником %s не найден", buyerNickname)
            );
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i].getTitle().equals(productTitle)) {
                product = products[i];
            }
        }
        if (product == null) {
            throw new NoProductException(
                    String.format("Товар %s не найден", productTitle)
            );
        }
        ordersCount++;
        Order order = new Order(buyer, product);

        return order;
    }
}
