class PaymentAdapter implements NewPaymentGateway {
    private OldPaymentGateway oldGateway;

    public PaymentAdapter(OldPaymentGateway oldGateway) {
        this.oldGateway = oldGateway;
    }

    public void processPayment(String paymentDetails) {
        oldGateway.payWithCard(paymentDetails); // Adapt the call
    }
}
