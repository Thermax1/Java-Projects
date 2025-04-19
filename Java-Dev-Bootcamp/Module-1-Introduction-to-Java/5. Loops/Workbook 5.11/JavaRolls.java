import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diceRoll;
        int score = 0;
        boolean my_main_loop = true;

        // See Learn the Part for detailed instructions.

        System.out.print("Let's play Rolling Java. Type anything and press enter to start: ");

        scan.nextLine();

        System.out.println("Great, here are the rules:");
        System.out.println("1. If you a roll a 6, the game stops.");
        System.out.println("2. If you a roll a 4, nothing happens.");
        System.out.println("3. Otherwise, you get 1 point.");
        System.out.print("\nYou must collect at least 3 points to win. Enter anything and press enter to roll: ");

        scan.nextLine();

        while(my_main_loop){
            
        }
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
  
  

  
  
}
