package org.example.classes;

import org.example.interfaces.Swimable;

import java.time.LocalDate;

public class Carp extends Animal implements Swimable{
    public Carp(String name, LocalDate birthDay, Illness illness){
        super(name, birthDay, illness);
    }
    @Override
    public void eat(){
        System.out.println("заглатывает!");
    }
    @Override
    public double swim(){
        return 7;
    }
    @Override
    public double fly(){
        return 0;
    }
    @Override
    public void toGo(){}
}
