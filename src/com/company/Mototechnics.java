package com.company;

public class Mototechnics implements Vehicle {
    int fuel, mileage, wheels;
    String sound;

    Mototechnics(int fuel, int mileage, String sound, int wheels){
        this.fuel = fuel;
        this.mileage = mileage;
        this.sound = sound;
        this.wheels = wheels;
    }

    @Override
    public void getFuel(){
        System.out.println("Топлива в баке: " + this.fuel + " литров");
    }
    @Override
    public void mileage(){
        System.out.println("Пробег: " + this.mileage + " километров");
    }
    @Override
    public void move(){
        System.out.println(this.sound);
    }

    public void getWheels(){
        System.out.println("Колес у данного агрегата - " + this.wheels);
    }

    public static class QuadBike extends Mototechnics {
        public QuadBike(int fuel, int mileage, String sound, int wheels){
            super(fuel, mileage, sound, wheels);
        }
    }

    public static class Motorcycle extends Mototechnics {
        public Motorcycle(int fuel, int mileage, String sound, int wheels){
            super(fuel, mileage, sound, wheels);
        }
    }

    public static class Scooter extends Mototechnics {
        public Scooter(int fuel, int mileage, String sound, int wheels){
            super(fuel, mileage, sound, wheels);
        }
    }
}
