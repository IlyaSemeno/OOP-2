package org.example.classes;

import org.example.interfaces.Goable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String name, LocalDate birthDay, Illness illness){
        super(name, birthDay, illness);
    }
    @Override
    public void eat(){
        System.out.println("чавкает!");
    }
    @Override
    public double go(){
        return 10;
    }
    @Override
    public double fly(){
        return 0;
    }
}
