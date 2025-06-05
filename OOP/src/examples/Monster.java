package examples;

public class Monster {

    int quantityOfEyes;
    int quantityOfHands;
    int quantityOfLegs;

    Monster() {
        this(2);
    }

    Monster(int quantity) {
        this(quantity, quantity, quantity);
    }

    Monster(int quantityOfEyes, int quantityOfHands, int quantityOfLegs) {
        this.quantityOfEyes = quantityOfEyes;
        this.quantityOfHands = quantityOfHands;
        this.quantityOfLegs = quantityOfLegs;
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrr...");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
