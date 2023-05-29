class ATMInterface {
    private User currentUser;
    private Account currentAccount;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter user PIN: ");
        String userPin = scanner.nextLine();

        // Validate user credentials
        if (validateUser(userId, userPin)) {
            System.out.println("Login successful!");
            showMenu();
        } else {
            System.out.println("Invalid user ID or PIN. Exiting...");
        }
    }

    private boolean validateUser(String userId, String userPin) {
        // Perform your validation logic here (e.g., checking against a database)
        // For this example, let's assume a fixed user ID and PIN
        return userId.equals("12345") && userPin.equals("1234");
    }

    private void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewTransactionHistory();
                    break;
                case 2:
                    performWithdrawal();
                    break;
                case 3:
                    performDeposit();
                    break;
                case 4:
                    performTransfer();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void viewTransactionHistory() {
        System.out.println("\nTransaction History:");
        List<Transaction> transactions
