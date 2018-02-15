package kz.hitechschool;

public class InputEx05 {
    public InputEx05(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите местоположение");
            return;
        }

        String location = args[0];
        int temperature = (int)(Math.random() * 10);
        System.out.println("Погода в " + location + ": " + temperature + "C, облачно, возможно осадки");
    }

    /**
     * ЗАДАЧИ ДЛЯ САМОСТОЯТЕЛЬНОЙ ПРАКТИКИ:
     *
     * 1 - сделайте так, чтобы через аргументы передавались данные:
     * температура, прогноз погоды (например, солнечно, или ожидается сильный град)
     *
     */
}
