package interfaces;

public class Bird extends Animal implements AbleToRun, AbleToFly{

    @Override
    public void eat() {
        System.out.println("птичий корм");
    }

    @Override
    public void fly() {
        System.out.println("птица летит");
    }

    @Override
    public void run() {
        System.out.println("птица бежит");
    }
}
