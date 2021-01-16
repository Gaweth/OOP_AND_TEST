package org.example.OOP_basic.expection;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExceptionSamples {
    public void sleepThread() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void sleepThreadAndReadFile() throws InterruptedException, FileNotFoundException {
        Thread.sleep(5000);
        new FileReader("anyfile.ccc");
    }

    public void sleepAndReadFileOneException() throws Exception
    {
        Thread.sleep(5000);
        new FileReader("aaaa.ccc");
    }
    public void sleepEx2() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void readFileEx2() throws FileNotFoundException {
        new FileReader("adasd");
    }

    public void sleepAndReadFileEx2() throws  Exception{
        sleepEx2();
        readFileEx2();
    }

    public static void main(String[] args) {
        ThrowExceptionSamples samples = new ThrowExceptionSamples();
        try {
            samples.sleepAndReadFileEx2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
