public class Main {
    public static void main(String[] args) {

        int initialAccount = 110;
        int replenishment = 1100;
        int bonus;
        int calculatedBonus = 11;
        int replenishmentTwo = 1050;
        int result = initialAccount + replenishment + calculatedBonus;

        System.out.println(result);

        if (replenishment >= 1100) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);

        if (replenishment >= 1050) {
            bonus = replenishmentTwo / 100;
        } else {
            bonus = 0;
        }


    }
}