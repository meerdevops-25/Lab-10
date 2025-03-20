public class AdapterPattern {
    /**
     * @author Abdul Moiz Meer
     */
    public static void main(String[] args) {
        OldPaymentGateway oldGateway = new OldPaymentGateway();
        NewPaymentGateway adapter = new PaymentAdapter(oldGateway);

        adapter.processPayment("9876-5432-1234-5678");
    }
}
