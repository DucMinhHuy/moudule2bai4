import java.time.LocalTime;
public class baitap2 {
    private LocalTime startTime,endTime;
    public baitap2(){
        startTime=LocalTime.now();
    }
    public baitap2(LocalTime startTime,LocalTime andTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public LocalTime getStartTime(){
        return startTime;
    }
    public LocalTime getEndTime(){
        return endTime;
    }
    public void start() {
        startTime = LocalTime.now();
    }
    public void stop(){
        endTime=LocalTime.now();
    }
    public int getElapsedTime(){
        int miliSecond =((endTime.getHour()- startTime.getHour()))*3600+(endTime.getMinute()-startTime.getSecond())*60+(endTime.getSecond()-startTime.getSecond())*1000;
        return miliSecond;
    }

}
