package org.example.classes;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, LocalDate birthDay, Illness illness){
        this.name = name;
        this.birthDay = birthDay;
        this.illness = illness;

    }
    public Animal(){
        this("Вася", LocalDate.now(), new Illness("Болезнь"));
    }
    public void toGo(){
        System.out.println(getType() + " движется");
    }
    public double fly(){
        System.out.println(getType() + " летает");
        return 0;
    }
    public double swim(){
        System.out.println(getType() + " плавает");
        return 0;
    }
    public abstract void eat();
    public void setIllness(Illness illness){
        this.illness = illness;
    }
    public String getName(){
        return name;
    }
    public LocalDate getBirthDay(){
        return birthDay;
    }
    public Illness getIllness(){
        return illness;
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    @Override
    public String toString() {
        return String.format("name = %s, birthday = %s, illness = %s", name, birthDay, illness);
    }
}
