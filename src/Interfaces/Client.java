package Interfaces;

public class Client {
    void makeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}
