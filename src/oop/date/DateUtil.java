package oop.date;

public class DateUtil {
    public static int datesub(Date d1, Date d2) {
        boolean b = true;
        if (func2(d1, d2) > 0) {
            Date d = d1;
            d1 = d2;
            d2 = d;
            b = false;
        }
        int count = 0;
        Date tmp = new Date(d1);
        while (!comp(tmp, d2)) {
            tmp.nextday();
            count++;
        }
        return b ? count : -count;
    }

    private static int func2(Date d1, Date d2) {
        if (d1.getYear() != d2.getYear()) {
            return d1.getYear() - d2.getYear();
        } else if (d1.getMonth() != d2.getMonth()) {
            return d1.getMonth() - d2.getMonth();
        }
        return d1.getDay() - d2.getDay();

    }

    private static boolean comp(Date d1, Date d2) {
        return d1.getYear() == d2.getYear()
                && d1.getMonth() == d2.getMonth()
                && d1.getDay() == d2.getDay();
    }
}
