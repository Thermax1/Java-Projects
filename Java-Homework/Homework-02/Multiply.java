import java.util.Scanner;
import java.util.Random;

public class Multiply {

  public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

     Random  myRandomNumber = new Random();
     int myOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
     int mySecOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
     int ans;
     int input;

     System.out.println("what is " + myOneDigitNumber + " times " + mySecOneDigitNumber + " or -1 to quit");
     input = scan.nextInt();
     ans = myOneDigitNumber * mySecOneDigitNumber ;
   
   while (input != -1) {
     if (ans == input) {
        System.out.println("correct");
        myOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
        mySecOneDigitNumber = Math.abs( myRandomNumber.nextInt() % 10 );
        ans = myOneDigitNumber * mySecOneDigitNumber ;
     } else {
        System.out.println("Incorrect");
     }

     System.out.println("what is " + myOneDigitNumber + " times " + mySecOneDigitNumber + " or -1 to quit");
     input = scan.nextInt();
   }
  }

}