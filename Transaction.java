import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private LocalDateTime timestamp;
    private String type;
    private double amount;
    
    public Transaction(String type, double amount) {
        this.timestamp = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
    }
    
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    public String getType() {
        return type;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        return "[" + formattedTimestamp + "] " + type + ": " + amount;
    }
}