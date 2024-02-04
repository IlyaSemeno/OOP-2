package org.example.interfaces;
@FunctionalInterface
public interface Flyable {
    double fly();
    default void defoultFly(double speed){
        System.out.println(" Объект летит со скоростью "+ speed);
    }
}
