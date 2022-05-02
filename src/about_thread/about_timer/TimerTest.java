package about_thread.about_timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        //创建一个定时器对象
        Timer timer=new Timer();

        //指定定时任务
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        try {
            parse = sdf.parse("2022-03-29 20:49:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date firstTime=parse;

        /**指定定时任务并执行
         * schedule(定时任务，执行时间，执行间隔)
         */
        timer.schedule(new LogTimerTask(),firstTime,1000 * 10);


    }
}
//编写一个定时任务类
class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        //此处编写需要完成的任务
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println(format+"：完成备份!!");
    }
}