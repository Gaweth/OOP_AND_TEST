package org.example.OOP_basic.multitrading.basic;

import static org.example.OOP_basic.multitrading.ThreadColor.*;

public class MainThread {
    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "main theme in action");


        OtherThread otherThread = new OtherThread();
        otherThread.setName("==== nowy zajefajny wataek====");
        otherThread.start();
        //otherThread.run();

        Thread runnableSample = new Thread(new RunableSample());
        runnableSample.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "anonymous class");
            }
        }.start();

        //  otherThread.interrupt();

        //nadpiszemy (jednorazowo kod RunnableSample
        runnableSample = new Thread(new RunableSample()) {
            @Override
            public void run() {
                System.out.println(ANSI_RED+"overwritten method");
                try {
                    otherThread.join(6000);
                    System.out.println(ANSI_RED + "overrwritten runablesample is finished");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED+"Interrupted overwritten");
                }
            }
        };
            runnableSample.start();


        System.out.println(ANSI_PURPLE +"End of thread");

}
}
