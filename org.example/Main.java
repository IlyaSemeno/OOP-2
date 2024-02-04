package org.example;

import org.example.classes.*;
import org.example.interfaces.Flyable;
import org.example.interfaces.Goable;
import org.example.interfaces.Swimable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    VeterinaryClinic clinic = new VeterinaryClinic();
        Cat cat = new Cat("Мурзик", LocalDate.now(), null);
        Carp carp = new Carp("чел", LocalDate.now(), null);
        Parrot parrot = new Parrot("Кеша", LocalDate.now(), null, 3);
        Dog dog = new Dog("Барбос", LocalDate.now(), null);
        GoldFish goldFish = new GoldFish("лол", LocalDate.now(), null);
        Seagull seagull = new Seagull("Лёлик", LocalDate.now(), null, 5);
        clinic.addAnimal(cat);
        clinic.addAnimal(carp);
        clinic.addAnimal(parrot);
        clinic.addAnimal(dog);
        clinic.addAnimal(goldFish);
        clinic.addAnimal(seagull);
        // Получаем список бегающих животных
        System.out.println("Бегающие животные:");
        for (Animal animal : clinic.getRunners()) {
            System.out.println(animal.getName());
        }

        // Получаем список плавающих животных
        System.out.println("\nПлавающие животные:");
        for (Animal animal : clinic.getSwimmers()) {
            System.out.println(animal.getName());
        }

        // Получаем список летающих животных
        System.out.println("\nЛетающие животные:");
        for (Animal animal : clinic.getFlyers()) {
            System.out.println(animal.getName());
        }
        Doctor doctor = new Doctor("Иванов");
        Nurse nurse = new Nurse("Петрова", 5);
        clinic.addDoctor(doctor);
        clinic.addNurse(nurse);
        Goable goable = ()->15;
        System.out.println("Объект движется со скоростью "+ goable.go() + " м/с");
        Swimable swimable = ()->20;
        System.out.println("Объект плывет со скоростью "+ swimable.swim() + " м/с");
        Flyable flyable = ()->30;
        System.out.println("Объект летит со скоростью "+ flyable.fly() + " м/с");
}
}
