import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Payment {
    protected double amount;
    protected Currency currency;
    protected LocalDateTime dateTime;
    protected String receiptId;

    public Payment(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
        this.dateTime = LocalDateTime.now();
        this.receiptId = UUID.randomUUID().toString();
    }

    public String getReceiptId() {
        return receiptId;
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return dateTime.format(formatter);
    }

    public void processPayment() {
        System.out.println("Processing payment of " + amount + " " + currency + " | Receipt: " + receiptId);
    }
}
