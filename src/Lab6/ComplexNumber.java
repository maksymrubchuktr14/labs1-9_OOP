package Lab6;

import java.util.Scanner;
class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть дійсну частину: ");
        this.realPart = scanner.nextDouble();
        System.out.print("Введіть уявну частину: ");
        this.imaginaryPart = scanner.nextDouble();
    }

    public void printNumber() {
        System.out.println("Комплексне число: " + realPart + " + " + imaginaryPart + "i");
    }

    public void printModule() {
        double module = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
        System.out.println("Модуль комплексного числа: " + module);
    }

    public void printArgument() {
        double argument = Math.atan2(imaginaryPart, realPart);
        System.out.println("Аргумент комплексного числа: " + argument);
    }
}
