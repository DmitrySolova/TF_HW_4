package com.company;

public class Trucks implements Vehicle {
    int fuel, mileage;
    String sound, type;

    Trucks(int fuel, int mileage, String sound, String type){
        this.fuel = fuel;
        this.mileage = mileage;
        this.sound = sound;
        this.type = type;
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

    public void workType(){
        System.out.println("Тип работы этой машины - " + this.type);
    }

}


class Bus extends Trucks {
    Bus(int fuel, int mileage, String sound, String type){
        super(fuel, mileage, sound, type);
    }

    public void getPrice(int price) {
        System.out.println("Стоимость проезда в автобусе - " + price + " рубля");
    }
}

class Tractor extends Trucks {
    Tractor(int fuel, int mileage, String sound, String type) {
        super(fuel, mileage, sound, type);
    }

    public void fuelType(String type) {
        System.out.println("Тип топлива - " + type);
    }
}

class Bulldozer extends Trucks {
    Bulldozer(int fuel, int mileage, String sound, String type) {
        super(fuel, mileage, sound, type);
    }

    private Blade bullBlade = new Blade();

    private class Blade {

        private void bladeUp() {
            System.out.println("Отвал поднят!");
        }

        private void bladeDown() {
            System.out.println("Отвал опущен!");
        }
    }

}

