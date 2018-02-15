package kz.hitechschool;

import java.util.Scanner;

public class InputEx07 {
    public InputEx07() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Список задач");
        System.out.println("2 - редактировать задач");
        System.out.println("3 - выполнить задачи");
        System.out.println("=======================");
        System.out.println("Ваш выбор: ");


        try {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали пункт 'Список задач'");
                    break;
                case 2:
                    System.out.println("Вы выбрали пункт 'Редактировать задачи'");
                    break;
                case 3:
                    System.out.println("Вы выбрали пункт 'выолнение задач'");
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
