import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        int secretNumber = (int)(Math.random() * 5) + 1;

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);

       int userGuess = scan.nextInt();

    //    while(userGuess < 1 || userGuess > 5){
    //     System.out.println("You entered a number out of bounds. Try again: ");
    //     userGuess = scan.nextInt();
    //    }
       while(secretNumber != userGuess) {

        if(userGuess < 1 || userGuess > 5){
            System.out.println("You guessed " + userGuess + ", which is OUT OF BOUNDS. Try again: ");
            userGuess = scan.nextInt();
        }

        else {
            System.out.println("You guessed " + userGuess + "! WRONG. Try again: ");
            userGuess = scan.nextInt();
        }
       }

       System.out.println("CONGRATS. You guessed " + userGuess + " and I picked " + secretNumber + " as well!");

        scan.close();
    }

}
