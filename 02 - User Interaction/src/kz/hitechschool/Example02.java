package kz.hitechschool;

import java.util.Scanner;

public class Example02 {

    public Example02() {
        int randomNumber = (int)(Math.random() * 100) + 1;
        boolean hasWon = false;

        // i = i - 1 <=> i -= 1 <=> i--

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.print("У тебя " + i + " попыток(-ки). Твое число: ");
            int guess = scanner.nextInt();

            if (randomNumber > guess) {
                System.out.println("Мое число больше твоего");
            } else if (randomNumber < guess) {
                System.out.println("Мое число меньше твоего");
            } else {
                hasWon = true;
                break;
            }

//            System.out.println(randomNumber + " - " + guess);
        }

        if (hasWon) {
            System.out.println("Ты победил!");
        } else {
            System.out.println("ХАХАХА! Ты проиграл");
            System.out.println("Мое число было: " + randomNumber);
        }
    }

}
