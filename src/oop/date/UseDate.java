package oop.date;

public class UseDate {
    public static void main(String[] args) {
        Date d1 = new Date(2021, 11, 25);
        Date d2 = new Date(2022, 7, 1);
        System.out.println(DateUtil.datesub(d2,d1));
        System.out.println(d1.tostring());
        System.out.println(d2.tostring());
/*
        Date date1 = new Date(2021, 12, 8);
        String s = date1.tostring();
        System.out.println(s);
        for (int i = 0; i < 300; i++) {
            date1.lastday();
            if(i%15==0){
                System.out.println(date1.tostring());
            }
        }
*/
    }
}
