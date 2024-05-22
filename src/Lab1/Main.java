package lab1;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        float a = 1,  b = 3,  c = 7, d = 6, e = 5, z=4, x=8, m=7, v=9, n=10;
        float sum, minus, mul, div;
        sum =  a + b + c + d + e + z + m + v + n;
        minus = a - b - c - d - e - z - x - m - v - n;
        mul = a * b * c * d * e * z * x * m * v * n;
        div = a / b / c / d / e / z / x / m / v / n;
        System.out.println("task 1");
        System.out.println("Sum=" + sum);
        System.out.println("Difference=" + minus);
        System.out.println("Product=" + mul);
        System.out.println("Fraction=" + div);
    }

    public static void task2() {
        String z= "Come", x= "up", c= "with", v= "a", b="sentence", n="of",  m="10",  a= "-", s = "12", d = "words", f=".";
        System.out.println("task 2");
        System.out.println(z + " " + x + " " + c + " " + v + " " + b + " " + n + " " + m + " " + a + " " + s + " " + d + " " + f);
    }

    public static void task3() {
        User[] users = new User[10];
        users[0] = new User(1, 25, "John", "Doe", 70.5, 175.2);
        users[1] = new User(2, 30, "Jane", "Smith", 65.2, 165.0);
        users[2] = new User(3, 28, "Michael", "Johnson", 80.0, 180.5);
        users[3] = new User(4, 35, "Emily", "Brown", 55.7, 160.8);
        users[4] = new User(5, 22, "David", "Wilson", 68.3, 172.3);
        users[5] = new User(6, 27, "Sarah", "Martinez", 63.9, 168.7);
        users[6] = new User(7, 33, "Jessica", "Lee", 75.1, 177.4);
        users[7] = new User(8, 29, "Daniel", "Taylor", 72.6, 173.9);
        users[8] = new User(9, 31, "Ashley", "Anderson", 61.8, 163.2);
        users[9] = new User(10, 26, "Christopher", "Thomas", 77.4, 181.1);

        int totalAge = 0;
        for (User user : users) {
            totalAge += user.age;
        }
        System.out.println("task 3");
        System.out.println("Sum years: " + totalAge);

        double totalWeight = 0;
        for (User user : users) {
            totalWeight += user.weight;
        }
        System.out.println("Sum Weight: " + totalWeight);

        double totalHeight = 0;
        for (User user : users) {
            totalHeight += user.height;
        }
        System.out.println("Sum height: " + totalHeight);
    }

    public static void task4() {
        Car[] cars = new Car[10];
        cars[0] = new Car(150, 2.0, "Toyota", "Corolla", 2015, "Blue");
        cars[1] = new Car(200, 2.5, "Honda", "Civic", 2018, "Red");
        cars[2] = new Car(180, 1.8, "Ford", "Focus", 2017, "White");
        cars[3] = new Car(250, 3.0, "BMW", "3 Series", 2016, "Black");
        cars[4] = new Car(300, 3.5, "Audi", "A4", 2019, "Silver");
        cars[5] = new Car(170, 2.2, "Hyundai", "Elantra", 2014, "Green");
        cars[6] = new Car(190, 2.3, "Mercedes-Benz", "C-Class", 2017, "Gray");
        cars[7] = new Car(220, 2.7, "Nissan", "Altima", 2018, "Orange");
        cars[8] = new Car(260, 3.2, "Lexus", "IS", 2015, "Yellow");
        cars[9] = new Car(280, 3.6, "Chevrolet", "Malibu", 2016, "Brown");

        double totalEngineVolume = 0;
        for (Car car : cars) {
            totalEngineVolume += car.getEngineVolume();
        }
        System.out.println("task 4");
        System.out.println("Sum engine Volume: " + totalEngineVolume);

        int totalHorsepower = 0;
        for (Car car : cars) {
            totalHorsepower += car.getHorsepower();
        }
        System.out.println("Sum Horse power: " + totalHorsepower);
    }

    public static void task5() {
        int number = 512;
        int reversedNumber = reverseNumber(number);
        System.out.println("task 5");
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        return reversedNumber;
    }
}




