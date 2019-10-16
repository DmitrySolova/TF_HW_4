package com.company;

public abstract class Automobile implements Vehicle {
    int fuel, mileage, prise;
    String sound;

    Automobile(int fuel, int mileage, int prise, String sound){
        this.fuel = fuel;
        this.mileage = mileage;
        this.sound = sound;
        this.prise = prise;
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

    void getPrice(){
        System.out.println("Стоимость этого автомобиля - " + this.prise + " рублей");
    }

    public abstract void drift();
}

abstract class Sedan extends Automobile
{
    Sedan(int fuel, int mileage, int prise, String sound) {
        super(fuel, mileage, prise, sound);
    }

    public abstract void drift();
}

abstract class Hatchback extends Automobile
{
    Hatchback(int fuel, int mileage, int prise, String sound) {
        super(fuel, mileage, prise, sound);
    }

    public abstract void drift();
}

abstract class Suv extends Automobile
{
    Suv(int fuel, int mileage, int prise, String sound) {
        super(fuel, mileage, prise, sound);
    }

    public abstract void drift();
}
