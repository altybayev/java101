package kz.hitechschool;

import java.util.Scanner;

/**
 * Игра "УГАДАЙ ЧИСЛО"
 *
 * Компьютер случайно загадывает число от 1 до 100.
 * Игроку дается 10 попыток угадать это число.
 * При каждой попытке компьютер дает подсказку -
 * больше или меньше загаданное, чем число, сказанное игроком.
 */

public class InputEx03 {

    public InputEx03() {
        int randomNumber = (int)(Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Я загадал число от 1 до 100, Человек!");
        System.out.println("У тебя всего 10 попыток! Не ошибись!");

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.print("У тебя осталось " + i + " попыток(-ки). Твое число: ");
            int guess = scanner.nextInt();

            if (randomNumber > guess) {
                System.out.println("Это больше, чем " + guess);
            } else if (randomNumber < guess) {
                System.out.println("Это меньше, чем " + guess);
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("\nКАК?! КАК ТЫ ДОГАДАЛСЯ??? В этот раз ты выиграл, Человек!");
        } else {
            System.out.println("\nУАХАХАХА! ТЫ ПРОИГРАЛ!");
            System.out.println("Это было: " + randomNumber);
        }
    }

    /**
     * ЗАДАЧИ ДЛЯ САМОСТОЯТЕЛЬНОЙ ПРАКТИКИ:
     *
     * 1 - выведите за сколько попыток человек угадал загаданное число
     *
     */
}
