package Lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Виберіть iм'я файлу: ");
        String File_name = scanner.nextLine();


        BufferedReader br = null;

        try {
            File file = new File(File_name);

            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner scan = new Scanner(System.in);
            System.out.print("Виберіть нижню межу для генерації випадкових чисел, а=");
            int a = scan.nextInt();
            System.out.print("Виберіть верхню межу для генерації випадкових чисел, b=");
            int b = scan.nextInt();

            int b1 = Integer.parseInt(String.valueOf(a));
            int b2 = Integer.parseInt(String.valueOf(b));
            PrintWriter numbers = new PrintWriter(file);
            numbers.println(new Random().nextInt(b2 - b1 + 1) + b1);
            numbers.println(new Random().nextInt(b2 - b1 + 1) + b1);
            numbers.println(new Random().nextInt(b2 - b1 + 1) + b1);
            numbers.println(new Random().nextInt(b2 - b1 + 1) + b1);
            numbers.println(new Random().nextInt(b2 - b1 + 1) + b1);
            numbers.println(new Random().nextInt(b2 - b1 + 1) + b1);
            numbers.println(new Random().nextInt(b2 - b1 + 1) + b1);
            numbers.close();

            br = new BufferedReader(new FileReader(File_name));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("помилка " + e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("помилка " + e);
            }
        }
    }
}
