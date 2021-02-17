package org.example.OOP_basic.log4jDemo;


import org.apache.log4j.Logger;

public class Main {

    final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.error("this is error message");
        LOGGER.warn("this is warning");
        LOGGER.fatal("this is fatal error message");
        LOGGER.debug("this is debug");
        LOGGER.info("this is error message");

        if(LOGGER.isInfoEnabled())
        {
            LOGGER.info("another info msg");
        }

        if(LOGGER.isDebugEnabled())
        {
            LOGGER.debug("and agarin debug msg");
        }
        Main main = new Main();
        try {
            main.divide(3,4);
        } catch (ArithmeticException ex)
        {
            LOGGER.error("some error caught : " + ex.getMessage());

        }

    }

    private void divide(int a, int b)
    {
        LOGGER.info("Trying to divade " + a + " by " + b);
        int i = a/b;
    }
}
