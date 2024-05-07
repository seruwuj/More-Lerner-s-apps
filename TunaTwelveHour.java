public class TunaTwelveHour {
    private int Hour;
    private int Minute;
    private int Second;

    public void setTime(int H, int M,int S) {
        Hour = ((H>=0 && H<24)? H:0);
        Minute =((M>=0 && M<60)? M:0);
        Second =((S>=0 && S<60)? S:0);
    }
    public String toMillitary(){
        return String.format("%02d:%02d:%02d",Hour,Minute,Second);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s", (Hour == 0 || Hour == 12) ? 12 : Hour % 12, Minute, Second, (Hour < 12) ? "AM" : "PM");
    }
}
