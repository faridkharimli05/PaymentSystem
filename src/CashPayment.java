public class CashPayment extends Payment {
    public CashPayment(double amount, Currency currency) {
        super(amount, currency);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cash payment of " + amount + " " + currency);
        generateReceipt();
    }

    private void generateReceipt() {
        System.out.println("✅ Cash received successfully!");
        System.out.println("------------------------------");
        System.out.println("Receipt ID: " + receiptId);
        System.out.println("Date: " + getFormattedDate());
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Payment Method: Cash");
        System.out.println("Thank you for your purchase!");
        System.out.println("------------------------------\n");
    }
}
