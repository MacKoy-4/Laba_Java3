package org.example;

import java.util.ArrayList;
import java.util.List;

public class ECommerceSystem {
    private List<Order> orders;

    public ECommerceSystem() {
        this.orders = new ArrayList<>();
    }

    public void addToCart(Cart cart, Product product) {
        cart.addProduct(product);
    }

    public void removeFromCart(Cart cart, Product product) {
        cart.removeProduct(product);
    }

    public Order placeOrder(Cart cart) {
        Order order = new Order();
        order.setOrderId(generateOrderId());
        order.setProducts(cart.getProducts());
        order.setStatus("Processing");
        orders.add(order);
        return order;
    }

    public String getOrderStatus(Order order) {
        return order.getStatus();
    }

    private int generateOrderId() {
        // Логіка для генерації унікального ідентифікатора замовлення
        return orders.size() + 1;
    }
}
