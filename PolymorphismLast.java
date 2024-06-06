public class PolymorphismLast {
    //combines all subclasses to one main class
    public static void main(String[] args) {
        AnimalFinal[] thelist = new AnimalFinal[2];
        Dogfinal d = new Dogfinal();
        FishFinal f = new FishFinal();

        thelist[0]= d;
        thelist[1]= f;

        for(AnimalFinal x:thelist){
            x.Noise();
        }
    }
}
