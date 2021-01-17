package org.example.OOP_basic.multitrading.basic;

import static org.example.OOP_basic.multitrading.ThreadColor.ANSI_BLUE;

public class OtherThread extends Thread {

    @Override
    public void run() {
        // tu nalzey dac kod do wywolania w osobnym watku
        System.out.println(ANSI_BLUE + "Other thred in action ");
        System.out.println(ANSI_BLUE + currentThread().getName());

        try {
            sleep(4000);
            System.out.println(ANSI_BLUE + "enough sleeping back to work");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE +"i couldnt sleep enough, interupted");

        }

    }
}
