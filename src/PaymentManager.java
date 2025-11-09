import java.util.ArrayList;

public class PaymentManager {
    private ArrayList<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
        System.out.println("💰 New payment added to the list.");
    }

    public void showAllPayments() {
        if (payments.isEmpty()) {
            System.out.println("No payments found!");
            return;
        }
        System.out.println("📋 List of all payments:");
        for (Payment p : payments) {
            p.processPayment();
        }
    }

    public void showPaymentsByType(String type) {
        System.out.println("📂 Payments of type: " + type);
        for (Payment p : payments) {
            if (p.getClass().getSimpleName().equalsIgnoreCase(type)) {
                p.processPayment();
            }
        }
    }

    public Payment findById(String receiptId) {
        for (Payment p : payments) {
            if (p.getReceiptId().equals(receiptId)) {
                return p;
            }
        }
        System.out.println("❌ No payment found with receipt ID: " + receiptId);
        return null;
    }

    public double calculateTotal() {
        double total = 0;
        for (Payment p : payments) {
            total += p.amount;
        }
        return total;
    }
}
