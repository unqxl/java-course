package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        
        try {
            int b = 7 / a;
            int c = Integer.parseInt("asdasd");
        } catch (Exception e) {
            System.out.println("Автор урока думать не умеет");
        }

        System.out.println("Hello");
    }
}
