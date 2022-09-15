import java.util.Scanner;

class CorrectChange {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the purchase amount [0 - 100]: ");

    int number = scan.nextInt();
    
    int change = 100 - number;
    int quarters = change / 25; // number of quarters that go into the change
    change = change % 25; // This number represents how much change is left over
    int dimes = change / 10;
    change = change % 10;
    int nickels = change / 5;
    change = change % 5;
    int pennies = change / 1;

    if(number >= 0 && number <= 100) { // If true, print out program as homework intended

        change = 100 - number;
        System.out.println("Your change of " + change + " cents is given as: ");
        System.out.println(quarters + " Quarters");
        System.out.println(dimes + " Dimes");
        System.out.println(nickels + " Nickels");
        System.out.println(pennies + " Pennies");
    }
    else { // if numbers are out of range. Run program again.
        System.out.println("You are out of range. Try program again.");
    } 
    
  }
}