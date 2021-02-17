package org.example.OOP_basic.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Image image1 = new Image("Obrazer1");
        Image image2 = new Image("Zdjecie2");

        Memento memento1 = new Memento(new Note("pamiatka z wakacji"));
        Memento memento2 = new Memento(new Note("pamiatka z ferii zimowych"));

        Picture picture1 = new Picture(new Note("fotka znad morza"), image1);
        Picture picture2 = new Picture(new Note("fotka z gor"), image2);

        List<Memento> memories = new ArrayList<>();
        memories.add(memento1);
        memories.add(memento2);
        memories.add(picture1);
        memories.add(picture2);

        MemoriesSaver<Memento> album = new MemoriesSaver<>();
        album.printAllMemories(memories);

        System.out.println("++++++++++++++");
        album.addAllMemories(memories);
        album.printInternalMemories();
        System.out.println("++++++++++++++");
        List<Picture> picturesOnly = new ArrayList<>();
        picturesOnly.add(picture1);
        picturesOnly.add(picture2);
        /**
         * wywolanie printAllmemories dla pictureOnly nie zadziala
         * bo JVM spodziewa sie listy List<Memento>
         * a dostaje List<Picture> i mimo ze Picture jest
         * klasa pochodna od Memento nie umie to oblsuzyc bo
         * List<Picture> nie jest klasa pochodna od List<Memento>
         *
         * czyli nawet jak klasa B rozszerza klase A to
         * Kolekcja(B) nie rozszerza kolekcja(A)
         *
         * i do tego wlasnie potrzbny jest operator wildcard czyli ? (pytanij -> typ nieokreslony)
         *
         */
      //  album.printAllMemories(picturesOnly);

        System.out.println("++++++++++++++");

        System.out.println("drukujemy wszystkie pamiatki");
       album.printWildcardAllMemories(picturesOnly);

        System.out.println("++++++++++++++");

        System.out.println("drukujemy wszystkie pamietki");
        album.printWildcardAllMemories(memories);
    }
}
