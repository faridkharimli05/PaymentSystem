public class Main {
    public static void main(String[] args) {

        PaymentManager manager = new PaymentManager();

        Payment online = new OnlinePayment(80.0, Currency.AZN, "farid@example.com");
        Payment card = new CreditCardPayment(100.0, Currency.USD, "1234567812345678");
        Payment cash = new CashPayment(60.0, Currency.EUR);

        manager.addPayment(online);
        manager.addPayment(card);
        manager.addPayment(cash);

        System.out.println("\n🔎 Show only ONLINE payments:");
        manager.showPaymentsByType("OnlinePayment");

        System.out.println("\n🧾 Search by receipt ID:");
        Payment found = manager.findById(card.getReceiptId());
        if (found != null) {
            found.processPayment();
        }

        System.out.println("\n💵 Total amount (in mixed currencies): " + manager.calculateTotal());
    }
}
