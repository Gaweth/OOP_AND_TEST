package org.example;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKINGS = 1;
    public static final int SAVINGS = 2;

    public int accountType;

    public BankAccount() {
        System.out.println("konstryukor bezparametrowy");
    }

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this();
        System.out.println("konstruktor z parametrami");
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double deposit(double amount, boolean branch) {
        if (amount > 500.0 && !branch) {
            throw new IllegalArgumentException();
        }
        balance+= amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch){
        if(amount>500.0 && !branch)
        {
            throw new IllegalArgumentException();
        }

        balance -= amount;
        return balance;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastNameName(){
        return lastName;
    }
    public double getBalance(){
        return balance;
    }
    public boolean savings(){
        return accountType == SAVINGS;

    }
}