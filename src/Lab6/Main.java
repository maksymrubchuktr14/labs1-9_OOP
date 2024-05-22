package Lab6;

class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("Person_2", 36);
        person2.move();
        person2.talk();
    }
    public static void task2() {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone(5728, "XS", 200);
        phones[1] = new Phone(2422, "SE", 175);
        phones[2] = new Phone(1413, "M4", 150);
        Phone.printphone(phones);
        Phone.printnumbers(phones);
        Phone.sendMessage(phones[0].getNumber(), phones[1].getNumber(), phones[2].getNumber());
    }
    public static void task3() {
        Cylinder cylinder = new Cylinder(3, 5);
        cylinder.setVolume(cylinder.getVolume());

        Pyramid pyramid = new Pyramid(3, 3, 3); // Припустимо, що радіус основи, ширина основи і висота піраміди - 3
        pyramid.setVolume(pyramid.getVolume());
    }
    public static void task4() {
        Sedan sedan = new Sedan("Toyota Camry", "Чорний", 200);
        Truck truck = new Truck("Volvo FH", "Сірий", 150);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();
    }
    public static void task5() {
        ComplexNumber complexNumber = new ComplexNumber(0, 0);
        complexNumber.inputNumber();
        complexNumber.printNumber();
        complexNumber.printModule();
        complexNumber.printArgument();
    }
}
