package org.example.OOP_basic.multitrading.basic;

import static org.example.OOP_basic.multitrading.ThreadColor.ANSI_RED;

public class RunableSample implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Runnable sample worksing as well");
    }
}
