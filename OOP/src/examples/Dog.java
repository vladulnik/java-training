package examples;

public class Dog {
    String name;
    String breed;
    int weight;
    int speed;

    String getInfo() {
        return "Name: " + name + "Breed: " + breed + "Weight: " + weight;
    }

    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }
    }
}
