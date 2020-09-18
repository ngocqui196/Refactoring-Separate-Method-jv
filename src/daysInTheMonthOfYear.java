import java.util.Scanner;

public class daysInTheMonthOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        dayInmonth(month,year);
    }

    private static void dayInmonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                boolean check = isLeapYear(year);
                if (check){
                    System.out.printf("năm %d có 29 ngày", year);
                }else {
                    System.out.printf("năm %d có 28 ngày", year);
                }
                break;
        }
    }

    public static boolean isLeapYear(int yearr) {
        if (yearr % 4 == 0) {
            if (yearr % 100 == 0) {
                if (yearr % 400 == 0){
                    return true;
                }
            }else {
                return true;
            }
        }
        return false;
    }
}
