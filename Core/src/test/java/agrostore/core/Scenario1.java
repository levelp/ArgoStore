package agrostore.core;

import argostore.core.Admin;
import argostore.core.Client;
import argostore.core.Order;
import argostore.core.Provider;
import argostore.core.products.Product;
import argostore.core.products.Tractor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Используем чистый "Test Driven Development"
 * Кент Бек:
 * Экстремальное программирование: разработка через тестирование
 */
public class Scenario1 extends Assert {
    @Test
    public void test1() {
        // Поставщики и есть клиенты
        Provider provider = new Provider();
        Client a = new Client();
        Client b = new Client();
        // И есть администратор
        Admin admin = new Admin();

        // TODO: Является ли поставщик пользователем системы?
        //assertTrue(provider instanceof User);

        // Клиент создаёт некоторый заказ
        Order order = a.createOrder();
        assertEquals(0, order.totalSum());
        assertEquals(a, order.getClient());
        Tractor tractor = new Tractor();
        tractor.setPrice(10000);
        order.addGood(tractor);

        assertEquals(10000, order.totalSum());

        // Другой клиент тоже создаёт заказ
        Order order2 = b.createOrder();
        order2.addGood(new Product());
    }


}
