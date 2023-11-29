package org.example;

public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляри продуктів
        Product laptop = new Product(1, "Laptop", 999.99);
        Product smartphone = new Product(2, "Smartphone", 499.99);

        // Створюємо екземпляр кошика
        Cart cart = new Cart();

        // Створюємо екземпляр системи електронної комерції
        ECommerceSystem eCommerceSystem = new ECommerceSystem();

        // Перевіряємо додавання продуктів до кошика
        eCommerceSystem.addToCart(cart, laptop);
        System.out.println("Added to Cart: " + laptop.getName());
        eCommerceSystem.addToCart(cart, smartphone);
        System.out.println("Added to Cart: " + smartphone.getName());

        System.out.println("Products in Cart:");
        for (Product product : cart.getProducts()) {
            System.out.println("- " + product.getName());
        }

        // Перевіряємо видалення продукта з кошика
        eCommerceSystem.removeFromCart(cart, laptop);
        System.out.println("Removed from Cart: " + laptop.getName());

        System.out.println("Products in Cart after removal:");
        for (Product product : cart.getProducts()) {
            System.out.println("- " + product.getName());
        }

        // Перевіряємо розміщення замовлення
        Order order = eCommerceSystem.placeOrder(cart);
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Order Products:");
        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName());
        }

        // Перевіряємо отримання статусу замовлення
        String orderStatus = eCommerceSystem.getOrderStatus(order);
        System.out.println("Order Status from ECommerceSystem: " + orderStatus);
    }
}

