package interfaces;

public class Kitchener implements Worker, Driver{

    @Override
    public void work() {
        System.out.println("повар работает");
    }

    @Override
    public void drive() {
        System.out.println("повар водит");
    }
}
