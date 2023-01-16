public class Solution_4 {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]); //Значение суммы рублей
        double r = Double.parseDouble(args[1]); //процент
        int t = Integer.parseInt(args[2]); //кол-во лет

        double sumDeposit = P * Math.exp(r * t);
        System.out.print(sumDeposit);
    }

}


