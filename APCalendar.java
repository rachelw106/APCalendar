public class APCalendar {
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year) {
        boolean four = year % 4 == 0;
        boolean hundred = year % 100 == 0;
        boolean fourHundred = year % 400 == 0;
        return four && (!hundred || fourHundred);
    }

    /**
     * Returns the number of leap years
     * between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for(int i = year1; i<=year2; i++) {
            if(isLeapYear(i)) count++;
        }
        return count;
    }

    /**
     * Returns the value representing the day
     * of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday,
     * ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year) {
        int day = 1;
        for(int i = 1; i < year; i++) {
            day++;
            if(isLeapYear(1)) day++;
        }
        return day%7;
    }

    /**
     * Returns n, where month, day, and year specify
     * the nth day of the year. Returns 1 for January 1
     * (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day,
     * 
     * 1
     * 
     * Brooklyn Technical High School AP Computer Science A
     * APCalendar
     * year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) {
        int days=0;
        if(month > 1) days += 31;
    }

    /**
     * Returns the value representing the day of the week for
     * the given date (month, day, year), where 0 denotes Sunday,
     * 1 denotes Monday, ..., and 6 denotes Saturday.
     * Precondition: The date represented by month, day,
     * year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year) {
        /* to be implemented in part (b) */ }
    // There may be instance variables, constructors,
    // and other methods not shown.
}