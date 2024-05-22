package Lab4;




public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task2();
        task3();
        task4();
    }

    public static void task1_1() {
        System.out.println("task 1.1");
        int[] evenNumbers = new int[50];
        int count = 0;
        for (int i = 0; count < 50; i += 2) {
            evenNumbers[count] = i;
            count++;
        }
        System.out.println("Парні числа у масиві:");
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
    }
    public static void task1_2() {
        System.out.println("task 1.2");
        int[] evenNumbers = new int[50];
        int count = 0;
        for (int i = 0; count < 50; i += 1) {
            evenNumbers[count] = i;
            count++;
        }
        System.out.println("Не парні числа у масиві:");
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
    }

    public static void task2() {
        System.out.println("task 2");
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.println("Перебір масиву циклом while:");

        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println("Перебір масиву циклом for:");

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println("Числа з непарним індексом (цикл while):");

        i = 1;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i += 2;
        }

        System.out.println("Числа з парним індексом (цикл for):");

        for (int k = 0; k < numbers.length; k += 2) {
            System.out.print(numbers[k] + " ");
        }

        System.out.println("Масив у зворотньому порядку:");

        for (int m = numbers.length - 1; m >= 0; m--) {
            System.out.print(numbers[m] + " ");
        }
    }
    public static void task3() {
        System.out.println("task 3");
        double[] array = {1.5, 2.7, 3.9, 4.1, 5.3};
        double sum = calculateSum(array);
        System.out.println("Сума елементів масиву: " + sum);
    }
    public static double calculateSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void task4() {
        System.out.println("task 4");
        int[] array = {1, -2, 3, -4, 5};
        changeSign(array);
        System.out.println("Масив після зміни знаку непарних елементів:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void changeSign(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= -1;
            }
        }
    }


}




