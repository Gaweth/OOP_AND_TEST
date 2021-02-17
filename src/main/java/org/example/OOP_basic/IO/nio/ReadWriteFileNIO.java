package org.example.OOP_basic.IO.nio;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class ReadWriteFileNIO {
    public static void main(String[] args) {
        ReadWriteFileNIO readWriteFileNIO = new ReadWriteFileNIO();
        String filename = "NioFile.txt";

        try {
            readWriteFileNIO.simpleWriteTofile(filename);
            readWriteFileNIO.simpleReadFromFile(filename);
        } catch (IOException e){
            System.out.println("wystapil blad");
        }
    }


    public void simpleWriteTofile(String filename) throws IOException {
        System.out.println("poczatke zapisu do pliku");
        Files.writeString(Paths.get(filename), "FirstLine");
        Files.writeString(Paths.get(filename), "\nSecondLine", StandardOpenOption.APPEND);
        Files.writeString(Paths.get(filename), "\nThirdLine", StandardOpenOption.APPEND);
        System.out.println("koniec zapisu do pliku");
    }
    public void simpleReadFromFile(String filename) throws IOException {
        List<String> filecontent;
        filecontent = Files.readAllLines(Paths.get(filename));
        filecontent.forEach(System.out::println);
        System.out.println("koniec zapisu do pliku");

    }

    }
