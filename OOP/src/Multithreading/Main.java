package Multithreading;

import java.util.Random;

public class Main {

    static boolean correct = false;

    public static void main(String[] args) {
        int bound = 1_000_000_000;

        Random random = new Random();
        int number = random.nextInt(bound);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int option;
                do {
                    option = random.nextInt(bound);
                } while (option != number);
                correct = true;
                System.out.println("Correct: " + option);
            }
        });
        thread.start();

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!correct) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    i++;
                }
            }
        });
        timer.start();


    }
}
