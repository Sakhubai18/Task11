public class User {
    private String userId;
    private int pin;
    private double balance;
    private StringBuilder transactionHistory;
    
    public User(String userId, int pin) {
        this.userId = userId;
        this.pin = pin;
        balance = 0.0;
        transactionHistory = new StringBuilder();
    }
    
    public boolean authenticate(int pin) {
        return this.pin == pin;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void updateBalance(double amount) {
        balance += amount;
    }
    
    public void addToTransactionHistory(String transaction) {
        transactionHistory.append(transaction).append("\n");
    }
    
    public String getTransactionHistory() {
        return transactionHistory.toString();
    }
}