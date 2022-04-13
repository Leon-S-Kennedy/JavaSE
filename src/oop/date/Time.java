package oop.date;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(Time time){
        this.hour= time.hour;
        this.minute= time.minute;
        this.second=time.second;
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public boolean nextSecond(){
        second++;
        if(second<60){
            return false;
        }
        minute++;
        second=0;
        if(minute<60){
            return false;
        }
        hour++;
        minute=0;
        if(hour<24){
            return false;
        }
        hour=0;
        return true;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);

    }

    public static void main(String[] args) {
        Time time = new Time(23, 59 ,59);
        System.out.println(time.toString());
    }
}
