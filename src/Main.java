public class Main {
    public static void main(String[] args) {
        int score = 100;
        int  refill = 1100;
        int bonus = 0;

        if (refill > 1000) {
            bonus = refill / 100;
            score = bonus + score + refill;
            System.out.println("Ваш счет = " + score);
            System.out.println("Ваш бонус = " + bonus);
        } else {
            score = score + refill;
            System.out.println("Ваш счет = " + score);
            System.out.println("Ваш бонус = " + bonus + " 'Пополните счет на 1100 рублей, для получения бонусов!'");
        }

    }
}
