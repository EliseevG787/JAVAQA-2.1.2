public class Main {
    public static void main(String[] args) {
        int amount = 1200;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int count = 200;
        count = count + amount + bonus;
        System.out.println(count);
    }
}
