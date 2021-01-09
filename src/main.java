public class main {
    public static void main(String[] args) {
        int balans = 253;
        int transfer = 1356;
        int bonus = transfer /100;
        int minBonustrans = 1000;
        if (transfer >= minBonustrans) {
            balans = balans + transfer + bonus;
        } else {
            balans = balans + transfer;
        }
        System.out.println(balans);
    }
}
