import java.util.Scanner;

public class SwitchMonthDays {

    public static void main(String[] args) {
        int num = 0;
        String monthName;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number days for a month? : ");
        num = keyboard.nextInt();

        switch (num) {
            case 30:
                monthName = "September April June November";
                //System.out.println("Month Names = " + monthName);
                break;
            case 31:
                monthName = "January, March, May, July, August, October, December";
                //System.out.println("Month Names = " + monthName);
                break;
            case 28:
                monthName = "February";
                //System.out.println("Month Names = " + monthName);
                break;
            default:
                monthName = "Unknown";
                System.out.println("Month Names = " + monthName);
                break;
        }
        System.out.println(monthName);
    }
}
