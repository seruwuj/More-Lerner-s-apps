//We create one class that holds all animal classes
public class ArrayGeneralObjects {
  public static void main(String[] args) {
    
  AnimalList ALO = new AnimalList();
  Dog d = new Dog();
  Fish f = new Fish();
  ALO.add(d);
  ALO.add(f);
  }
}
