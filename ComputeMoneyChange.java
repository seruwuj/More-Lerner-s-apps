import java.util.Scanner;

public class ComputeMoneyChange {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Recieve amount
        System.out.println("Enter an amount in double for example11.56: ");
        double amount = input.nextDouble();

        int remainingAmount =(int)(amount*100);
        //Find the number of one dollars
        int numberOfOneDollars = remainingAmount/100;
        remainingAmount = remainingAmount %100;

        //Find the number of quarters in the remaining amount
        int numberofQuarers = remainingAmount /25;
        remainingAmount = remainingAmount/25;
        
        //Find the number of dimes in the remaining amount
        int numberofDimes = remainingAmount/10;
        remainingAmount = remainingAmount%10;

        //Find the number of nickles in the remaining amount
        int numberofNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //Find the number of Pennies in the remaining Amount
        int numberofPennies = remainingAmount;

        //Display Results
        System.out.println("Your amount "+amount+" consists of");
        System.out.println(" "+numberOfOneDollars+ " dollars");
        System.out.println(" "+numberofQuarers+" quarters");
        System.out.println(" "+numberofDimes+" dimes");
        System.out.println(" "+numberofNickles+" nickles");
        System.out.println(" "+numberofPennies+" pennies");
    }
}
