public class Main {
    public static void main(String[] args) {

        int initialAccount = 110;
        int replenishment = 1100;
        int bonus;


        if (replenishment >= 1100) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);

        if (replenishment >= 1050) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }


    }
}