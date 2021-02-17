package org.example.OOP_basic.multitrading.notifier;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;
    private String[] messageTowrite = { " linia 1","linia 2","Linia 3", "Linia 4"};

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < messageTowrite.length; i++)
        {
            message.write(messageTowrite[i]);
            try {
                Thread.sleep(random.nextInt(4000));
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            message.write("OEF");
        }
    }
}
