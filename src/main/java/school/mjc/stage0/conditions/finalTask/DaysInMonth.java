package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 2:
                if (isLeapYear) {
                    System.out.print(month + " " + year);
                } else {
                    System.out.print(month + " " + year);
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print(month + " " + year);
                break;
            case 4:
            case 9:
            case 6:
            case 11:
                System.out.print(month + " " + year);
                break;

        }
    }
}
