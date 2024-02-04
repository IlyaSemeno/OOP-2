package org.example.classes;

import org.example.interfaces.Flyable;
import org.example.interfaces.Goable;
import org.example.interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> animals;
    private List<Doctor> doctors;
    private List<Nurse> nurses;

    public VeterinaryClinic() {
        this.animals = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }


    public List<Animal> getRunners() {
        List<Animal> runners = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Goable) {
                runners.add(animal);
            }
        }
        return runners;
    }

    public List<Animal> getSwimmers() {
        List<Animal> swimmers = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                swimmers.add(animal);
            }
        }
        return swimmers;
    }

    // Получить всех летающих животных
    public List<Animal> getFlyers() {
        List<Animal> flyers = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                flyers.add(animal);
            }
        }
        return flyers;
    }

    // Добавить доктора в клинику
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Добавить медсестру в клинику
    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

}

