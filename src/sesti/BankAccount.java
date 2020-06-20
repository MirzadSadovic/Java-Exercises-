/*
 Create a new class for a bank account
 Create fields for the account number, balance, customer name, email and phone number.
 Create getters and setters for each field
 Create two additional methods
 1. To allow the customer to deposit funds (this should increment the balance field).
 2. To allow the customer to withdraw funds. This should deduct from the balance field,
 but not allow the withdrawal to complete if their are insufficient funds.
 You will want to create various code in the Main class (the one created by IntelliJ) to confirm your code is working.
 Add some System.out.println's in the two methods above as well.
 */
package sesti;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double money) {
        this.balance = balance + money;
        System.out.println("Balance after deposit is " + balance);
    }

    public void withdrawlFunds(double money) {
        if (balance - money < 0) {
            System.out.println("Insufficient funds, balance is = " + balance);
        } else {
            this.balance = balance - money;
            System.out.println("Now Balance is " + balance);
        }

    }
}
