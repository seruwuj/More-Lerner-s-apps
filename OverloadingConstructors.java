public class OverloadingConstructors {
    public static void main(String[] args) {
        TunaConstructors TunaConstructorsObject = new TunaConstructors();
        TunaConstructors TunaConstructorsObject2 = new TunaConstructors(5);
        TunaConstructors TunaConstructorsObject3= new TunaConstructors(5,13);
        TunaConstructors TunaConstructorsObject4 = new TunaConstructors(5,13,43);

        System.out.printf("%s/n",TunaConstructorsObject.toMillitary());
        System.out.printf("%s/n",TunaConstructorsObject2.toMillitary());
        System.out.printf("%s/n",TunaConstructorsObject3.toMillitary());
        System.out.printf("%s/n",TunaConstructorsObject4.toMillitary());
    }
}
