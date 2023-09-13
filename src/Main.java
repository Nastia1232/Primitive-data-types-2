public class Main {
    public static void main(String[] args) {
        double currentBalance = 100.0;

        double rechargeAmount = 1100.0;

        double bonusThreshold = 1000.0;

        double bonusPer100 = 1.0;

        double bonus = 0.0;


        if (rechargeAmount > bonusThreshold) {

            bonus = Math.floor((rechargeAmount - bonusThreshold) / 100) * bonusPer100;
        }


        double totalBalance = currentBalance + rechargeAmount + bonus;

        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }
}
