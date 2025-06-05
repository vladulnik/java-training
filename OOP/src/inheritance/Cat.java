package inheritance;

public class Cat extends CatFamily {

    public Cat() {
        super(false, 4, 2);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}
