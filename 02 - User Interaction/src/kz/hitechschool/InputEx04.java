package kz.hitechschool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Программа для подсчета количества слов в файле.
 */

public class InputEx04 {
    public InputEx04() throws FileNotFoundException {

        File file = new File("tolkien2.txt");
        Scanner scanner = new Scanner(file);

        int wordsCount = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            wordsCount += line.split("").length;
        }

        System.out.println("В тексте " + wordsCount + " слов");

    }

    /**
     * ЗАДАЧИ ДЛЯ САМОСТОЯТЕЛЬНОЙ ПРАКТИКИ
     *
     * 1 - перепишите программу, чтобы в начале спрашивалось
     * название файла для чтения
     *
     * 2 - если такого файла не существует, сообщите об
     * этом пользователю и прекратите программу
     *
     * 3 - добавьте к количеству строк такие данные, как
     * количество строк и общее число слов
     *
     */
}
