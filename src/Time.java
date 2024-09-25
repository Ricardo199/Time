public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {

    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        if(hour <0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60){
            throw  new IllegalArgumentException("Hour, minute, and/or second was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
