package org.example.OOP_basic.multitrading.notifier;

public class NotificationTest {
    public static void main(String[] args) {
        Message message= new Message();

        (new Thread(new Writer(message))).start(); //abonimowe wywolanie watku

        //jawne wywolanie watku
        Thread readerThread= new Thread(new Reader(message));
        readerThread.start();
        /**
         * na klasie Writer
         * 1/jawne wywołanis watky
         * Thread readerThread new Thread(new Reader(message));
         * readerThread.start();
         * * cykl zycia :
         * * 1. Writer próbuje wykonać metode message.write()
         * - jeśli w message nie ma innei wiadomości, EZekatacei na obsłużegie to zapisuie i powiadania innych że skończy?
         * - jeśli w message jest inna wiadomość to czeka aż ta poRcZedata wiadomość zostanie obskutena i wtedx zapisute i pondadania ianxsh
         * * 2. Reader Próbuje wykonać message.read() - isbul. w message nie ma wiadomości do gg czyta
         *
         */


    }
}