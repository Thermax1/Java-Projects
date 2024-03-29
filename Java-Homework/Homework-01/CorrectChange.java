// modified the change value;  change=change % {coin} to determine the remaining change instead of creating new variables
import java.util.Scanner;

class CorrectChange {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the purchase amount [0 - 100]: ");
    int number = scan.nextInt();
    
    int change = 100 - number;
    int original_change = change;
    int quarters = change / 25;
    change %= 25;
    int dimes = change / 10;
    change %= 10;
    int nickels = change / 5;
    int pennies = change % 5;

    if(number >= 0 && number <= 100) //If true, print out program input as homework intended.
    {
      System.out.println("Your change of " + original_change + " cents is given as: ");
      change = change % quarters;
      System.out.println(quarters + " Quarters.");
      System.out.println(dimes + " Dimes.");
      System.out.println(nickels + " Nickels.");
      System.out.println(pennies + " Pennies.");
    }
    else //Error message available if someone doesn't follow the range listed in the program
    {
      System.out.println("You are out of range. Try program again.");
    }
  }
}