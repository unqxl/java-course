package BeforeOOP;

public class Strings {
    public static void main(String[] args) {
//        String str = "Hello World!";
//        System.out.println(str);

        String name = "John";
        int age = 27;
        String result = String.format("Привет, %s! Тебе %d лет", name, age);
        System.out.println(result);
    }
}
