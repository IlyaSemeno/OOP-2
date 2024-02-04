package org.example.classes;

public class Nurse {
    private String name;
    private int yearsOfExperience;
    public Nurse(String name, int yearsOfExperience){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void giveAnInjection(Patient patient) {
        System.out.println("Медсестра " + name + " делает укол " + patient.getName());
    }


}
