package Interfaces;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Я вам принес: " + dish);
            }
        }, "Пицца");
    }
}
