import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diceRoll;
        int score = 0;
        boolean my_main_loop = true;

        // See Learn the Part for detailed instructions.

        System.out.print("Let's play Rolling Java. Press enter to start: ");

        scan.nextLine();

        System.out.println("Great, here are the rules:");
        System.out.println("1. If you a roll a 6, the game stops.");
        System.out.println("2. If you a roll a 4, nothing happens.");
        System.out.println("3. Otherwise, you get 1 point.");
        System.out.print("\nYou must collect at least 3 points to win. Press enter to roll: ");

        while(my_main_loop){
            scan.nextLine();
            diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);

            if(diceRoll == 6){
                System.out.println("End of game");
                break;
            }

            else if(diceRoll == 4){
                System.out.println("Zero points. Keep rolling.");
            }
            else{
                score++;
                System.out.println("One point keep rolling.");
            }
        }
        if(score >= 3){
            System.out.println("\nWow, that's lucky! You win!");
        }
        else{
            System.out.println("\nTough luck, you lose");
        }

        System.out.println("\nFinal score: " + score);
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
  
  

  
  
}
