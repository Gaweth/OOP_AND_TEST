package org.example.OOP_basic.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class MemoriesSaver<T extends Memento> {

    List<T> internalMemories = new ArrayList<>();

    public void printAllMemories(List<T> memories) {
        System.out.println("Reviewing memories: ");
        memories.forEach(x -> System.out.println(x.getInfo()));
    }

    public void addAllMemories(List<T> memories) {
        internalMemories.addAll(memories);
    }

    public void printInternalMemories() {
        System.out.println("Printing internal memories: ");
        printAllMemories(internalMemories);
    }

    //? oznacza Memento lub dowolna klase dziedziczaca z memento
    public void printWildcardAllMemories(List<? extends Memento> memories) {
        System.out.println("Rewiewing all possible memories");
        memories.forEach(x -> System.out.println(x.getInfo()));
    }
}
