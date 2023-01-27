public class DayOfWeeks {

    public static void main(String[] args) {

        int dayOfWeek = Integer.parseInt(args[0]);

        switch (dayOfWeek) {
            case 1:
                System.out.println(String.format("%s - Понедельник", dayOfWeek));
                break;
            case 2:
                System.out.println(String.format("%s - Вторник", dayOfWeek));
                break;
            case 3:
                System.out.println(String.format("%s - Среда", dayOfWeek));
                break;
            case 4:
                System.out.println(String.format("%s - Четверг", dayOfWeek));
                break;
            case 5:
                System.out.println(String.format("%s - Пятница", dayOfWeek));
                break;
            case 6:
                System.out.println(String.format("%s- Суббота", dayOfWeek));
                break;
            case 7:
                System.out.println(String.format("%s - Воскресенье", dayOfWeek));
                break;
            default:
                System.out.println("Ошибка. Такого дня недели нет");

        }

    }
}

