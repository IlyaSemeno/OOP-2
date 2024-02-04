package org.example.classes;

public class Doctor {
    private String name;
    public Doctor(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void examinePatient(Patient patient) {
        System.out.println("Доктор " + name + " осматривает пациента " + patient.getName());
    }

}
