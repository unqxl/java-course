package Examples;

public class MyMath {
    private static final double PI = 3.14;

    public static int sum(int... nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }

        return result;
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static int multiple(int a) {
        return a * a;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }
}
