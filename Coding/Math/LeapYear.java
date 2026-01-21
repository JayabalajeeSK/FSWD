package Math;

public class LeapYear 
{

    static boolean isLeapYear(int year) 
    {
        if (year % 400 == 0) return true;

        if (year % 100 == 0) return false;

        return year % 4 == 0;
    }

    static void printNLeapYears(int startYear, int n) 
    {
        int count = 0, year = startYear;
        while (count < n) 
        {
            if (isLeapYear(year)) 
            {
                System.out.print(year + " ");
                count++;
            }
            year++;
        }
        System.out.println();
    }

    static int nthLeapYear(int startYear, int n) 
    {
        int count = 0, year = startYear;
        while (true) 
        {
            if (isLeapYear(year)) 
            {
                count++;

                if (count == n) return year;
            }
            year++;
        }
    }

    public static void main(String[] args) {
        int year = 2024;

        System.out.println(year + " is leap year? " + isLeapYear(year));

        printNLeapYears(2000, 5);

        System.out.println("10th leap year from 2000: " + nthLeapYear(2000, 10));
    }
}
// 2024 is leap year? true
// 2000 2004 2008 2012 2016 
// 10th leap year from 2000: 2036