public class Main {
    public static void main(String[] args) {
        int score = 100;
        int  refill = 100;
        int bonus = 0;
        if (refill >= 1000) {
            bonus = refill / 100;
            int new_score = bonus + score + refill;
            System.out.println("Ваш счет = " + new_score);
            System.out.println("Ваш бонус = " + bonus);
        } else {
            int new_score = score + refill;
            System.out.println("Ваш счет = " + new_score);
            System.out.println("Ваш бонус = " + bonus + " 'Пополните счет на 1000 рублей, для получения бонусов!'");
        }

    }
}
