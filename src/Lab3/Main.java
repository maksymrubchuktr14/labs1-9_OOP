package Lab3;

public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task2();
        task3();
        task4();
        task5_1();
        task5_2();
    }

    public static void task1_1() {
        for (int i = 0; i < 50; i++) {
            System.out.println("task 1.1");
        }
    }

    public static void task1_2() {
        int i = 0;
        while (i < 50) {
            System.out.println("task 1.2");
            i++;
        }
    }

    public static void task2() {
        System.out.println("task 2");
        int t=0;
        for (int i=0; i < 60 ; i ++) {
            System.out.println(t + " годин " + i + " хвилин ");
            if (i== 59 && t ==0) {
                t = 1;
                i=0;
                System.out.println(t + " година " + i + " хвилин ");
            }
            else if (i==59 && t==1) {
                t = 2;
                i=0;
                System.out.println(t + " години " + i + " хвилин ");
            }
        }
    }

    public static void task3() {
        System.out.println("task 3");
        int t=0, i=0;
        while ( i < 60) {
            System.out.println(t + " годин " + i + " хвилин ");
            i++;
            if (i== 59 && t ==0) {
                t = 1;
                i=0;
                System.out.println(t + " година " + i + " хвилин ");
            }
            else if (i==59 && t==1) {
                t = 2;
                i=0;
                System.out.println(t + " години " + i + " хвилин ");
            }
        }

    }

    public static void task4() {
        System.out.println("task 4");
        int t = 0, n = 0;

        for (int i = 0; i < 60; i++) {
            System.out.println(t + " годин " + n + " хвилин " + i + "секунд");
            if (i == 59 && n < 59) {
                n = n + 1;
                System.out.println(t + " годин " + n + " хвилин " + i + "секунд");
                i = 0;
            } else if (i == 59 && n == 59 && t <= 1) {
                t = t+1;
                i= 0;
                n=0;
                System.out.println(t + " годин " + n + " хвилин " + i + "секунд");
            }
        }

    }

    public static void task5_1() {
        System.out.println("task 5.1");
        double  f ;
        for (double x = 0; x <= 2;x += 0.1  )  {
            f = Math.sin(Math.pow(x, 2)) * Math.cos(Math.pow(x, 2)) - 10 * x;
            System.out.println("f(x)=" + f);
        }
    }



    public static void task5_2() {
        System.out.println("task 5.2");
        double  f ;
        double x = 0;
        while ( x <= 2)  {
            f = Math.sin(Math.pow(x, 2)) * Math.cos(Math.pow(x, 2)) - 10 * x;
            System.out.println("f(x)=" + f);
            x += 0.1 ;
        }

    }
}
