
public class Main {
    public static void main(String[] args) {
        int score = 100;
        int deposits = 1200;
        int bonus;

        if (deposits > 1000) {
            bonus = deposits / 100;
        } else {
            bonus = 0;
        }
        int balance = score + deposits + bonus;
        System.out.println("Ваш баланс:" + balance + " руб. Бонус составляет: " + bonus + " руб.");
    }
}
