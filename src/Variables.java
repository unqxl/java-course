public class Variables {
    public static void main(String[] args) {
        int x = 5;
        int y = x + 5;
        System.out.printf("• y = %d \n", y);

        // Задача про Джона и Ника
        int johnsMoney = 100;
        int nicksMoney = johnsMoney * 5;
        int totalMoney = johnsMoney + nicksMoney;
        System.out.printf("• J+N = %d$ \n", totalMoney);

        // Деление чисел
        int a = 10;
        int b = 3;
        int c = a / b;
        System.out.printf("• с = %d \n", c);

        // Остаток от деления
        int a1 = 10;
        int b1 = 3;
        int c1 = a1 % b1;
        System.out.printf("• с1 = %d \n", c1);

        // Домашка
        int days = 10000;
        int years = days / 365;
        int months = (days - (years * 365)) / 30;
        int remainingDays = days - (years * 365) - (months * 30);
        System.out.printf("• %d г., %d мес., %d дн.", years, months, remainingDays);
    }
}
