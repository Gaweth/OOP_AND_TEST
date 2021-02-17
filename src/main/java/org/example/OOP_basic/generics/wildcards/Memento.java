package org.example.OOP_basic.generics.wildcards;

public class Memento {
    private Note note;

    public Memento(Note note) {
        this.note = note;
    }

    public String getInfo() {
        return note.getNote();
    }
}
