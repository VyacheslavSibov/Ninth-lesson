package ua.ithillel.car;

import java.util.Arrays;
//ctrl + alt + L
public class Main {
    public static void main(String[] args) {
        Wheel[] Wheels = new Wheel[5];
        for (int i = 1; i < Wheels.length; i++) {
            Wheels[i] = new Wheel();
            Wheels[i].setSize(25);
        }

        Transmission Transmission = new Transmission();
        Transmission.setType("Механика");

        Engine myEngine = new Engine();
        myEngine.setFuelConsumption(20);
        myEngine.setPower(240);

        Car myCar = new Car();
        myCar.setColor("Синий");
        myCar.setModel("Audi");
        myCar.setTransmission(Transmission);
        myCar.setEngine(myEngine);

        System.out.println("Информация :");
        System.out.println("Машина: " + myCar.getColor() + " " + myCar.getModel());
        System.out.println("Мощность: " + myEngine.getPower() + " Расход: " + myEngine.getFuelConsumption() + "л");
        System.out.println("Коробка передач: " + Transmission.getType());
        System.out.println("Колеса: ");
        for (int i = 1; i < Wheels.length; i++) {
            System.out.println("Колесо " + i + " - " + "Размер : " + Wheels[i].getSize());
        }
    }
}
