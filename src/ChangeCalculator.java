public class ChangeCalculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        System.out.println("стоимость товара: " + a + " руб." + b + " коп. ");
        if (a < 0 || b < 0 || c < 0 || d < 0) {
            System.out.println("баланс карты отрицательный");
            System.exit(1);
        }
        int totalCost = a * 100 + b;
        int totalPaid = c * 100 + d;

        if (totalPaid < totalCost) {
            System.out.println("на карте недостаточно средств");
            System.exit(1);

            int change = totalPaid - totalCost;
            int e = change / 100;
            int f = change % 100;
            System.out.println("вы внесли: " + c + " руб. " + d + " коп.");
            System.out.println("ваша сдача: " + e + " руб. " + f + " коп. ");
        }
    }
}

