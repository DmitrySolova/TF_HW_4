package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Mototechnics.Scooter SUZUKI_LETS_5 = new Mototechnics.Scooter(5, 1125, "Тр-тр-тр", 2);
        SUZUKI_LETS_5.getFuel();

        Mototechnics.QuadBike Yamaha_YFZ_450R = new Mototechnics.QuadBike(10, 532, "Тру-тру-тру-тртртр", 4);
        Yamaha_YFZ_450R.getWheels();

        Mototechnics.Motorcycle Aprilia_RS_125 = new Mototechnics.Motorcycle(14 , 11004, "Виииуу", 2);
        Aprilia_RS_125.move();

        Bulldozer TM_10 = new Bulldozer(50, 2353, "Бруууу-бр-бр", "Служит для послойного копания, планировки и перемещения грунтов");
        TM_10.workType();

        Bus Ikarus = new Bus(60, 40021, "Ууу-ууу-ууу", "Перевозка пассажиров");
        Ikarus.getPrice(24);

        Tractor DT_75 = new Tractor(42, 1123, "Тру-тру-тру", "Трактор предназначен для пахоты лёгких почв в садах и теплицах, обработки пропашных культур, для работы с косилкой, стогометателем, снеговым отвалом, а также для транспортных работ.");
        DT_75.fuelType("Дизель");

        Suv UAZ = new Suv(40, 1123, 100000, "Пр-пр-пр") {
            @Override
            public void drift() {
                System.out.println("Дрифт по грязи");
            }
        };

        UAZ.drift();

        Sedan Dodge_Charger_Hellcat = new Sedan(35, 10123, 1430000, "Врум-врум") {
            @Override
            public void drift() {
                System.out.println("Американский дрифт");
            }
        };

        Dodge_Charger_Hellcat.getPrice();

        Hatchback Volkswagen_Golf_GTI = new Hatchback(20, 1323, 500000, "Пр-тр-пр") {
            @Override
            public void drift() {
                System.out.println("Немецкий дрифт");
            }
        };

        Volkswagen_Golf_GTI.mileage();


    }

}
