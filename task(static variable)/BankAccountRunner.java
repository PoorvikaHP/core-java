class BankAccountRunner {
    public static void main(String[] args) {
        System.out.println("Account Holder: " + BankAccount.accountHolder);
        System.out.println("Account Number: " + BankAccount.accountNumber);
        System.out.println("Balance: " + BankAccount.balance);
        System.out.println("Active: " + BankAccount.isActive);
        System.out.println("Account Type: " + BankAccount.accountType);
    }
}