package BeforeOOP;

public class Conditions {
    public static void main(String[] args) {
        int temp = 30;

        boolean isHot = temp >= 25;
        boolean isCold = temp <= 22;

        int time = 23;
        boolean isNight = time > 22 || time < 6;

        if (isHot && !isNight) {
            System.out.println("[!] Кондиционер включен");
        } else if (isCold) {
            System.out.println("[!] Кондиционер выключен");
        } else {
            System.out.println("[#] Кондиционер не активен");
        }
    }
}
