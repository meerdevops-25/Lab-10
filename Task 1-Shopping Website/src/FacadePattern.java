public class FacadePattern {
    /**
     * @author Abdul Moiz Meer
     */
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.placeOrder("IPhone", "Debit Card");
    }
}
