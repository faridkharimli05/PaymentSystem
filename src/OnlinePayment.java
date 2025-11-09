public class OnlinePayment extends Payment {
    private String email;

    public OnlinePayment(double amount, Currency currency, String email) {
        super(amount, currency);
        this.email = email;
    }

    @Override
    public void processPayment() {
        if (validateEmail()) {
            System.out.println("Processing online payment of " + amount + " " + currency + " via account: " + email);
            generateReceipt();
        } else {
            System.out.println("❌ Invalid email address. Payment failed!");
        }
    }

    private boolean validateEmail() {
        return email.contains("@") && email.contains(".");
    }

    private void generateReceipt() {
        System.out.println("✅ Payment successful!");
        System.out.println("📧 Receipt sent to: " + email);
        System.out.println("------------------------------");
        System.out.println("Receipt ID: " + receiptId);
        System.out.println("Date: " + getFormattedDate());
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Payment Method: Online");
        System.out.println("Thank you for your purchase!");
        System.out.println("------------------------------\n");
    }
}
