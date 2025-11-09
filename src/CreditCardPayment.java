public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, Currency currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        if (validateCardNumber()) {
            System.out.println("Processing credit card payment of " + amount + " " + currency + " with card: " + maskCardNumber());
            generateReceipt();
        } else {
            System.out.println("❌ Invalid card number. Payment failed!");
        }
    }

    private boolean validateCardNumber() {
        return cardNumber.length() == 16 && cardNumber.matches("[0-9]+");
    }

    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(12);
    }

    private void generateReceipt() {
        System.out.println("✅ Payment successful!");
        System.out.println("💳 Card: " + maskCardNumber());
        System.out.println("------------------------------");
        System.out.println("Receipt ID: " + receiptId);
        System.out.println("Date: " + getFormattedDate());
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Payment Method: Credit Card");
        System.out.println("Thank you for your purchase!");
        System.out.println("------------------------------\n");
    }
}
