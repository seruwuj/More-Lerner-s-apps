public class Polymorphism2 {
    public static void main(String[] args) {
        
        Fatty TunaPolymorphism = new Fatty();
        Food Fo = new Food();
        Food Ho = new Hotdog();

        TunaPolymorphism.digest(Fo);
        TunaPolymorphism.digest(Ho);
    }
}
