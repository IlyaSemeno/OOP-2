package org.example.classes;

public class Illness {
    String name;
    public Illness(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
