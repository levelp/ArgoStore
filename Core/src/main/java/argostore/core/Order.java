package argostore.core;

import argostore.core.products.Product;

/**
 * Заказ
 */
public class Order {
    Client client;

    /**
     * Общая сумма заказа
     */
    long sum = 0;

    public Client getClient() {
        return client;
    }

    /**
     * Добавить товар в заказ
     *
     * @param product товар
     */
    public void addGood(Product product) {
        sum += product.getSum();
    }

    /**
     * @return Общая сумма заказа
     */
    public long totalSum() {
        return sum;
    }
}
