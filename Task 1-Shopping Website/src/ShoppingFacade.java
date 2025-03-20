class ShoppingFacade {
    private ProductCatalog catalog = new ProductCatalog();
    private PaymentProcessor payment = new PaymentProcessor();
    private OrderManager orderManager = new OrderManager();

    public void placeOrder(String product, String paymentDetails) {
        catalog.checkProductAvailability(product);
        orderManager.createOrder(product);
        payment.processPayment(paymentDetails);
        System.out.println("Order placed successfully!");
    }
}
