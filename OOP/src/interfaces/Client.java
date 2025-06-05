package interfaces;

public class Client {

    public void doOrder(Waiter waiter, String dish) {

        waiter.bringOrder(dish);
    }
}
