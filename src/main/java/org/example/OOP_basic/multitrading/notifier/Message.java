package org.example.OOP_basic.multitrading.notifier;

import static org.example.OOP_basic.multitrading.ThreadColor.*;

public class Message {
    private String messageContent;
    private boolean messageEmpty = true;

    public synchronized String read()
    {
        while(messageEmpty)
        {
            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println(ANSI_GREEN+"blad odczytu");
            }
        }
        System.out.println(ANSI_GREEN + "odczytujemy wiadmosc");
        System.out.println(ANSI_GREEN+messageContent);
        messageEmpty=true;
        notifyAll();
        return messageContent;
    }

    public synchronized void write(String newMessage)
    {

        while(!messageEmpty)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(ANSI_BLUE+"blad zapisu wiadomosci");
            }


        }
        System.out.println(ANSI_BLUE + "nowa wiadomosc zapisana");
        System.out.println(ANSI_BLUE + newMessage);
        messageEmpty = false;
        messageContent = newMessage;
        notifyAll();
    }
}
