package org.example.classes;

import org.example.interfaces.Flyable;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable{
    private int wingQuantity;

    public Parrot(String name, LocalDate birthDay, Illness illness, int wingQuantity){
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }
    @Override
    public void eat(){
        System.out.println("клюёт!");
    }
    @Override
    public double fly(){
        return 15;
    }

    @Override
    public double swim(){
        return 0;
    }
}
