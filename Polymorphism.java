public class Polymorphism {
    public static void main(String[] args) {
        Food TunaPolymorphism[]= new Food[2];
        TunaPolymorphism[0]= new Hotdog();
        TunaPolymorphism[1]= new TunaPolymorphism();

        for(int x=0;x<2;++x){
            TunaPolymorphism[x].eat();
        }
    }
}
