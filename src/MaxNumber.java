public class MaxNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int MaxNumber = Math.max(a, (Math.max(b, c)));
        System.out.println(MaxNumber);
    }

}

