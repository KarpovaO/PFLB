public class Triangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int triangle = a > 0 && b > 0 && c > 0 && a <= b + c && b <= a + c && c <= a + b ? 1 : 2;

        switch (triangle) {
            case 1:
                if (a * 2 == (b * 2 + c * 2)) {
                    System.out.println("right");
                    return;
                }
                if (a * 2 > (b * 2 + c * 2)) {
                    System.out.println("obtuse");
                    return;
                }
                if (a * 2 < (b * 2 + c * 2)) {
                    System.out.println("acute");
                }
                return;

            case 2:
                System.out.println("Not triangle!");

        }
    }
}

