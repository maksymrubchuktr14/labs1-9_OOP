package Lab7;

import java.util.Random;

public class Helper {
    public static void chooseRandomCarAndPrintMessage(Car[] cars) {
        Random random = new Random();
        int randomIndex = random.nextInt(cars.length);
        Car randomCar = cars[randomIndex];
        System.out.println("Автомобіль марки " + randomCar.car_brand + " з водієм " + randomCar.name + " виїхав за вами.");
    }
}