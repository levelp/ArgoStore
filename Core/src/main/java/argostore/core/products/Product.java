package argostore.core.products;

/**
 * Товар в заказе
 */
public class Product {
    /**
     * Цена за единицу в центах
     */
    private long price;

    /**
     * Количество единиц товара
     */
    private long amount = 1;

    public long getSum() {
        return price * amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
