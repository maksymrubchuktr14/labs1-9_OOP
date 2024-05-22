package Lab5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("task_1");
        double a = 3;
        double S = area_of_square(a);
        System.out.println("Площа квадрата зі стороною " + a + "  дорівнює " + S + " квадратних одиниць");
    }

    public static double area_of_square(double a) {
        return a * a;
    }

    public static void task2() {
        System.out.println("task_2");
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;
        int min = findMin(num1, num2, num3);
        System.out.println("Найменше число: " + min);
    }

    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void task3() {
        int[] arry = {5, 200, 29, -40, 100};
        System.out.println("task_3");
        System.out.print("Числа з масиву:");
        printarr(arry);
    }

    public static int printarr(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");

        }
        return 0;
    }
    public static void task4() {
        int[] array = {5, 200, 29, -40, 100};
        System.out.println(" ");
        System.out.println("task_4");
        int maxNumber = findMax(array);
        System.out.println("Найбільше число в масиві: " + maxNumber);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    }




