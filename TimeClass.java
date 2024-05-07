public class TimeClass{
    public static void main(String[] args) {
        TunaMillitallyTime TunaTimeObject = new TunaMillitallyTime();
        System.out.println(TunaTimeObject.toMillitary());
        TunaTimeObject.setTime(13,27,6 );
        System.out.println(TunaTimeObject.toMillitary());
    }
}