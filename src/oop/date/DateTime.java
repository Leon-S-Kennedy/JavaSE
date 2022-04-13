package oop.date;

public class DateTime {
    private Date date;
    private Time time;

    public DateTime(){
    }

    public DateTime(int year,int month,int day,int hour,int minute,int second){
        this.date=new Date(year,month,day);
        this.time=new Time(hour,minute,second);

    }
    public String toString(){
        return date.tostring()+"  "+time.toString();
    }

    public void nextSecond(){
        if(time.nextSecond()){
            date.nextday();
        }
    }

    //浅拷贝，藕断丝连式的。
    public DateTime sCopy(){
        DateTime dateTime = new DateTime();
        dateTime.date=this.date;
        dateTime.time=this.time;
        return dateTime;
    }
    //深拷贝，将丝也斩断的拷贝。
    public DateTime dCopy(){
        DateTime dateTime = new DateTime();
        dateTime.date=new Date(this.date);
        dateTime.time=new Time(this.time);
        return dateTime;

    }
    public static void main(String[] args) {
        DateTime dateTime = new DateTime(2021, 12, 9, 10, 21, 59);
        //System.out.println(dateTime.toString());
        DateTime dateTime1=dateTime.dCopy();
        System.out.println(dateTime1.toString());
        dateTime.nextSecond();
        System.out.println(dateTime1.toString());


    }
}
