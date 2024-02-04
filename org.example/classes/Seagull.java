package org.example.classes;

import org.example.interfaces.Flyable;

import java.time.LocalDate;

public class Seagull extends Animal implements Flyable {
    private int wingQuantity;

    public Seagull(String name, LocalDate birthDay, Illness illness, int wingQuantity){
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }
    @Override
    public void eat(){
        System.out.println("клюет!");
    }
    @Override
    public double fly(){
        return 12;
    }
    @Override
    public double swim(){
        return 0;
    }
}
