package org.example.classes;

import org.example.interfaces.Goable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {
    public Cat(String name, LocalDate birthDay, Illness illness){
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
