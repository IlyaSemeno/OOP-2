package org.example.interfaces;
@FunctionalInterface
public interface Swimable {
    double swim();
    default void defoultSwim(double speed){
        System.out.println(" Объект плывет со скоростью "+ speed);
    }
}
