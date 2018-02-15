package kz.hitechschool;

import java.util.Scanner;

public class Example01 {

    public Example01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Имя:");
        String name = scanner.nextLine();

        System.out.println("Возраст:");
        int age = scanner.nextInt();

        System.out.println("Вас зовут " + name + " и вам " + age);
    }

}
