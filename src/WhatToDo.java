public class WhatToDo {
    public static void main(String[] args) {
        boolean isGoodWeather = true;
        boolean isNight = false;

        if (isNight) {
            System.out.println("Спать");
        } else if (!isNight && isGoodWeather) {
            System.out.println("Гулять");
        } else if (!isNight && !isGoodWeather) {
            System.out.println("Читать книгу");
        }
    }
}
