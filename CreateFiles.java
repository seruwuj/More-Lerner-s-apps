import java.io.File;

public class CreateFiles {
    public static void main(String[] args) {
        File x = new File("Desktop:\\test\\JAVA TESTS.txt");
        //Checking if a file exists with an if statement
        if (x.exists())
         System.out.println(x.getName()+ " Exists");
        else
         System.out.println("Sorry, this file doesn't exist");

            
        }
    }
    
