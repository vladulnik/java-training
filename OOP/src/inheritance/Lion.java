package inheritance;

public class Lion extends CatFamily{
    public Lion(){
        super(true, 4, 2);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("антилопу");
    }
}
