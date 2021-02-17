package org.example.OOP_basic.IO.basic;

import java.io.*;
import java.util.Scanner;

public class ReaderWriteFile {
    public static void main(String[] args) {
        String firstFile = "FirstFile.txt";
        String secondFile = "secondFile.txt";
        ReaderWriteFile readerWriteFile = new ReaderWriteFile();
        readerWriteFile.simpleWriteToFile(firstFile, true);
        readerWriteFile.simpleReadFromFile(firstFile);


     //  readerWriteFile.writeFileWithBuffer(secondFile);
    }


    public void simpleWriteToFile(String filename,boolean append) {
        //try-with-resoruces
        //wprowadzenie w javie?
        try {
            try (FileWriter writer = new FileWriter(filename, append)) {
                System.out.println("zapisujemy do pliku: " + filename);


                writer.write("linia pierwsza\n");
                writer.write("linia druga\n");
                writer.write("linia trzecia\n");
            }
        } catch (IOException e) {
            System.out.println("Blad przy zapisywaniu pliku");
        }
        System.out.println("koniec zapisisy do pliku");
    }
    public void simpleReadFromFile (String filename)
    {
        try {
            FileReader fileReader = new FileReader(filename);
                Scanner scanner = new Scanner(fileReader);
                scanner.useDelimiter("\n");
                System.out.println("reading from file" + filename);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
                scanner.close();
                fileReader.close();
            }
        catch (FileNotFoundException e)
            {
                e.printStackTrace();
                } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("koniec odczytu pliku");

            }

            public void writeFileWithBuffer(String filename, boolean append) {
                try {
                    System.out.println("poczatek zapisu do pliku");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filename, append));
                    writer.write("buffered FistLine\n");
                    writer.write("buffered SecondLine\n");
                    writer.write("buffered ThridLine\n");
                    writer.close();
                } catch (IOException e) {
                    System.out.println("blad zapisy pliku");
                }
            }
                public void readWithBuffer(String filename) {
                    String input;
                    System.out.println("zaczynami odczyt z pliku z buforem");
                    try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
                        while ((input = reader.readLine()) !=null) {
                            System.out.println(input);
                        }
                            } catch (FileNotFoundException ex) {
                        System.out.println("pliku nie znaleziono");
                            } catch (IOException ex){

                        System.out.println("inny blad niz IO");
                        }

                            System.out.println("plik nie znalezione");
                        }
                    }




