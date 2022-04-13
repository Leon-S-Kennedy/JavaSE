package oop.date;

//约束要求
//1.年只能是1000到3000
//2.月只能是1-12
//3.日只能是1-28、1-29、1-30、1-31等
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(Date d1) {
        this.year = d1.year;
        this.month = d1.month;
        this.day = d1.day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Date(int year, int month, int day) {
        if (!checkyear(year)) {
            throw new RuntimeException("输入有误！！！yaer=" + year);
        }
        if (!checkmonth(month)) {
            throw new RuntimeException("输入有误！！！month=" + month);
        }
        if (!checkday(year, month, day)) {
            throw new RuntimeException("输入有误！！！day=" + day);
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String tostring() {
        //%04d表示右对齐占4个宽度用0填充
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public void lastday() {
        day--;
        if (day >= 1) {
            return;
        }
        day = func(year, month, day);
        month--;
        if (month >= 1) {
            return;
        }
        year--;
        month = 12;
    }

    private int func(int year, int month, int day) {
        if (isrunnian(year)) {
            if (month == 3) {
                return 29;
            } else if (month == 1 || month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11) {
                return 31;
            } else {
                return 30;
            }
        } else {
            if (month == 3) {
                return 28;
            } else if (month == 1 || month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11) {
                return 31;
            } else {
                return 30;
            }
        }
    }

    public void nextday() {
        day++;
        if (day <= monthbound(year, month, year)) {
            return;
        }
        month++;
        day = 1;
        if (month <= 12) {
            return;
        }
        year++;
        month = 1;
    }

    private static int monthbound(int year, int month, int day) {
        if (isrunnian(year)) {
            if (month == 2) {
                return 29;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            } else {
                return 30;
            }
        } else {
            if (month == 2) {
                return 28;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            } else {
                return 30;
            }
        }
    }

    private static boolean checkday(int year, int month, int day) {
        if (isrunnian(year)) {
            if (month == 2) {
                return day >= 1 && day <= 29;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return day >= 1 && day <= 31;
            } else {
                return day >= 1 && day <= 30;
            }
        } else {
            if (month == 2) {
                return day >= 1 && day <= 28;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return day >= 1 && day <= 31;
            } else {
                return day >= 1 && day <= 30;
            }
        }
    }

    private static boolean isrunnian(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkmonth(int month) {
        return month <= 12 && month >= 1;
    }

    private static boolean checkyear(int year) {
        return year >= 1000 && year <= 3000;
    }

}
