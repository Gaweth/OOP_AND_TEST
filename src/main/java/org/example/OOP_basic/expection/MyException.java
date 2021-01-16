package org.example.OOP_basic.expection;

public class MyException extends IllegalArgumentException {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
