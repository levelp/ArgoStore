package argostore.core;

/**
 * Клиент
 */
public class Client extends User {

    public Order createOrder() {
        Order order = new Order();
        order.client = this;
        return order;
    }
}
