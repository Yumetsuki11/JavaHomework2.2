public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int addition = 3966;
        int bonus;

        balance = balance + addition;

        if (addition > 1000) {
            bonus = addition/100;
            balance = balance + bonus;
        }
        else {
            bonus = 0;
        }

        System.out.println("Сумма на счёте " + balance + " р.");
        System.out.println("Зачислено " + (addition + bonus) + " р.");
        System.out.println("Из них бонусных " + bonus + " р.");
    }
}
