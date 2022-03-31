package firststate.day03;

public class YearDemo {
    public static void main(String[] args) {
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年是平年");
        }
    }
}

