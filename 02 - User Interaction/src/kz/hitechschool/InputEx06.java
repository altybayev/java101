package kz.hitechschool;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputEx06 {
    public InputEx06() {

        String[] months = {
                "Январь", "Февраль", "Март",
                "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь",
                "Октябрь", "Ноябрь", "Декабрь"
        };

        System.out.print("Введите индекс месяца: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int month = scanner.nextInt();
            System.out.println(months[month]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.print("Index out of bounds");
        } catch (InputMismatchException exception) {
            System.out.println("Input mismatch");
        }

    }

    /**
     * ЗАДАЧИ ДЛЯ САМОСТОЯТЕЛЬНОЙ ПРАКТИКИ
     *
     * 1 - перепишите игру "Угадай число" и обработайте
     * исключения, когда пользователь вводит строку вместо
     * числа
     *
     */
}
