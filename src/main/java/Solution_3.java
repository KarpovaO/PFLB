public class Solution_3 {
    public static void main(String[] args) {

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        boolean result = (firstNumber % secondNumber) == 0;
        System.out.println(result);
    }
}
