package org.example.OOP_basic.multitrading.counter;

import static org.example.OOP_basic.multitrading.ThreadColor.*;

public class Counter {
    private int i;

    void performCountdown(){
        String color;
        switch (Thread.currentThread().getName())
        {
            case "Thread1":
                color = ANSI_CYAN;
                break;
            case "Thread2":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_GREEN;
        }
      //  synchronized (this){
        doRealCountdown(color);
    //}
    }

   // private synchronized void  doRealCountdown(String color) {
    private void  doRealCountdown(String color) {

        for (int i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName()+" i="+i);
        }
    }
}
