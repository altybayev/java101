package kz.hitechschool;

public class Pet {
    private String name;
    private int hungerLevel;
    private int moodLevel;
    private int fatigueLevel;

    public Pet(String name) {
        this.name = name;
        this.hungerLevel = 10;
        this.moodLevel = 10;
        this.fatigueLevel = 5;
    }

    public void eat() {
        this.hungerLevel += 2;
        this.fatigueLevel -= 1;
        this.moodLevel += 1;
    }

    public void play() {
        this.moodLevel += 2;
        this.hungerLevel -= 1;
        this.fatigueLevel -= 1;
    }

    public void sleep() {
        if (fatigueLevel >= 10) {
            System.out.println("Я уже много спал");
            return;
        }

        this.fatigueLevel += 2;
        this.hungerLevel -= 1;
        this.moodLevel -= 1;
    }

    public void status() {
        if (hungerLevel >= 10 && fatigueLevel >= 10 && moodLevel >= 10)
        {
            System.out.println("У меня все отлично!");
            return;
        }

        if (hungerLevel < 3) {
            System.out.println("Я голоден!");
        }

        if (moodLevel < 3) {
            System.out.println("Я хочу играть!");
        }

        if (fatigueLevel < 3) {
            System.out.println("Я хочу спать!");
        }
    }
}
