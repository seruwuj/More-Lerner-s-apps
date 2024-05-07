//how to convert millitary Time to 12 hour clock;
public class NonMillitaryTime {
    public static void main(String[] args) {
        TunaTwelveHour TunaTwelveHourObject = new TunaTwelveHour();
        System.out.println(TunaTwelveHourObject.toMillitary());
        System.out.println(TunaTwelveHourObject.toString());

        TunaTwelveHourObject.setTime(13,27,6);
        System.out.println(TunaTwelveHourObject.toMillitary());
        System.out.println(TunaTwelveHourObject.toString());
    }
    
}
