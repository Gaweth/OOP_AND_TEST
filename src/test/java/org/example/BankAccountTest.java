package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    public void setup(){
        bankAccount = new BankAccount("ja", "kub", 2000, 1);
    }

    @Test
    public  void testDeposit100(){
        double expected = 200;

        double balance = bankAccount.deposit(200,false);
        assertEquals(expected, balance ,"expected value 200while "+ balance + "waws given");

    }
    @Test
    public  void testWithdraw(){
        double expected = 50;

        double balance = bankAccount.withdraw(100,false);
       assertEquals(expected, balance ,"expected value 200while "+ balance + "was given");

    }
    @Test
    public void testDeposit600NotInBranchThrowsException() {
        double expected = 700.0;
        try{
            double balance = bankAccount.deposit(600.0, false);
            fail("IllegalArgumentException expected but not thrown");
        } catch (IllegalArgumentException e) {
           // assertThrows(IllegalArgumentException.class, () -> {});
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }
    @Test
    public void testDeposit600NotInBranchWithAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(600.0, false));
    }
    }
