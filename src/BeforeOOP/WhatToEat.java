package BeforeOOP;

public class WhatToEat {
    public static void main(String[] args) {
        int moneyInPocket = 7;
        if (moneyInPocket > 10) {
            System.out.println("• Пицца");
        } else if (moneyInPocket > 6) {
            System.out.println("• Гамбургер");
        } else {
            System.out.println("• Сендвич");
        }
    }
}
