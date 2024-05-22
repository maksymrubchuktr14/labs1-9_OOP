package Lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void task1() {
        Car[] cars = new Car[12];
        cars[0] = new Car("BMW 3 Series ", 255.0f, "Oleg", 20000.0f, 2019);
        cars[1] = new Car("Toyota Camry", 203.0f, "Benjamin", 22500.0f, 2020);
        cars[2] = new Car("Ford Mustang", 310.0f, "Olivia", 35000.0f, 2021);
        cars[3] = new Car("Honda Civic", 158.0f, "Ethan", 38000.0f, 2021);
        cars[4] = new Car("Chevrolet Silverado", 285.0f, "Ava", 45000.0f, 2020);
        cars[5] = new Car("Mercedes-Benz E-Class", 241.0f, "William", 47500.0f, 2020);
        cars[6] = new Car("Audi A4", 201.0f, "Sophia", 55000.0f, 2021);
        cars[7] = new Car("Volkswagen Golf GTI", 228.0f, "James", 45000.0f, 2022);
        cars[8] = new Car("Tesla Model S -", 670.0f, "Emma", 32000.0f, 2019);
        cars[9] = new Car("Jeep Wrangler", 285.0f, "Alexander", 28500.0f, 2020);
        cars[10] = new Car("Subaru Outback", 182.0f, "Isabella", 34000.0f, 2021);
        cars[11] = new Car("Nissan Ultima", 188.0f, "Michael", 30000.0f, 2019);



        ArrayList<Float> prices = new ArrayList<>();
        ArrayList<Float> powers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        ArrayList<String> namess = new ArrayList<>(6);
        namess.add(0, "Ethan");
        namess.add(1, "Sona");
        namess.add(2, "Matviu");
        namess.add(3, "Bohdan");
        namess.add(4, "Pavlo");
        namess.add(5, "Taras");

        for (Car car : cars) {
            prices.add(car.getPrice());
            powers.add(car.getPower());
            names.add(car.getName());
        }

        for (int in = 0; in < 12; in += 2) {
            Float nev = prices.get(in) * 1.1f;
            prices.set(in, nev);
            Float nen = powers.get(in) * 1.05f;
            powers.set(in, nen);
            String nem = names.set(in, namess.get(in / 2));
        }
        Helper.chooseRandomCarAndPrintMessage(cars);

        Driver[] drivers = new Driver[12];
        drivers[0] = new Driver("Oleg", 21, 3);
        drivers[1] = new Driver("Benjamin", 35, 10);
        drivers[2] = new Driver("Olivia", 23, 2);
        drivers[3] = new Driver("Ethan", 48, 7);
        drivers[4] = new Driver("Ava", 22, 2);
        drivers[5] = new Driver("William", 28, 7);
        drivers[6] = new Driver("Sophia", 30, 6);
        drivers[7] = new Driver("James", 40, 15);
        drivers[8] = new Driver("Emma", 32, 6);
        drivers[9] = new Driver("Alexander", 31, 12);
        drivers[10] = new Driver("Isabella", 44, 10);
        drivers[11] = new Driver("Michael", 20, 1);

        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Integer> driving_experiences = new ArrayList<>();

        for (Driver driver : drivers) {
            ages.add(driver.getAge());
            driving_experiences.add(driver.getDriving_experience());
            names.add(driver.getNamea());
        }
        for (int im = 0; im < 12; im++) {
            if (ages.get(im) < 25 && driving_experiences.get(im) < 5) {
                driving_experiences.set(im, driving_experiences.get(im) + 1);
            }
        }
    }
    public static void task2() {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Петров", "+380951234567");
        phoneBook.put("Іванов", "+380992345678");
        phoneBook.put("Сидоренко", "+380633456789");
        phoneBook.put("Коваленко", "+380974567890");
        phoneBook.put("Мельник", "+380665678901");
        phoneBook.put("Ковальчук", "+380976789012");
        phoneBook.put("Семененко", "+380987890123");
        phoneBook.put("Сергієнко", "+380688901234");
        phoneBook.put("Ткаченко", "+380999012345");
        phoneBook.put("Зайцев", "+380631123456");

        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        String surnameToFind = "Коваленко";
        if (phoneBook.containsKey(surnameToFind)) {
            String phoneNumber = phoneBook.get(surnameToFind);
            System.out.println("Номер телефону " + surnameToFind + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + surnameToFind);
        }

        String randomSurnameToRemove = "Мельник";
        phoneBook.remove(randomSurnameToRemove);

        System.out.println("\nТелефонна книга після видалення запису:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
