public class TunaMillitallyTime {
    private int Hour;
    private int Minute;
    private int Second;

    public void setTime(int H,int M,int S){
        Hour =((H>=0 && H<24)?H:0);
        Minute =((M>=0 && M<60)?M:0);
        Second =((S>=0&& S<60)?S:0);
    }
    public String toMillitary (){
     return String.format("%02d:%02d:%02d",Hour,Minute,Second);
     //%02d means remainder with two decimal points
     // Millitary time is same as 24 hour time
    }
}
