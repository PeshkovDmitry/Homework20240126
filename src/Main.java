import exceptions.NoBuyerException;
import exceptions.NoProductException;
import exceptions.NotPositiveCountException;
import model.Buyer;
import model.Market;
import model.Order;
import model.Product;

public class Main {
    public static void main(String[] args) {
        Buyer[] buyers = new Buyer[] {
                new Buyer(
                        "Vanya",
                        "Иван",
                        "Иванов",
                        "123",
                        Buyer.Gender.MALE,
                        100f),
                new Buyer(
                        "Petka",
                        "Петр",
                        "Петров",
                        "456",
                        Buyer.Gender.MALE,
                        200f),
                new Buyer(
                        "Nyurka",
                        "Анна",
                        "Смирнова",
                        "789",
                        Buyer.Gender.FEMALE,
                        300f),
        };
        Product[] products = new Product[] {
                new Product("Хлеб",1f),
                new Product("Молоко",2f),
                new Product("Молоко",2f),
                new Product("Макароны",1.5f),
                new Product("Мясо",5f)
        };
        Order[] orders = new Order[10];

        try {
            orders[Market.getOrdersCount()]
                    = Market.buy("Vanya","Хлеб", 1, buyers, products);
            orders[Market.getOrdersCount()]
                    = Market.buy("Nyurka","Коньяк", 2, buyers, products);
            orders[Market.getOrdersCount()]
                    = Market.buy("Petka","Хлеб", -1,buyers, products);
            orders[Market.getOrdersCount()]
                    = Market.buy("Andrey","Мясо", 2, buyers, products);
        } catch (NotPositiveCountException | NoBuyerException | NoProductException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < Market.getOrdersCount(); i++) {
            System.out.println(orders[i]);
        }
    }
}