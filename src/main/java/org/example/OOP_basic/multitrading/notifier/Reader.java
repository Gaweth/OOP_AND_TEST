package org.example.OOP_basic.multitrading.notifier;

import java.util.Random;

import static org.example.OOP_basic.multitrading.ThreadColor.ANSI_PURPLE;

public class Reader implements Runnable{

    private Message message;

    public Reader(Message message)
    {
        this.message=message;
    }

    @Override
    public void run() {
        Random random=new Random();
        for (String latestMessage = message.read(); latestMessage != "EOF"; latestMessage=message.read()){
            System.out.println(ANSI_PURPLE + "odczytano wiadomosc");
            System.out.println(ANSI_PURPLE+ latestMessage);

            try {
                Thread.sleep(random.nextInt(4000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
