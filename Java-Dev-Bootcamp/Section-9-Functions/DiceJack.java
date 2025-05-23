import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(areLessThan1(num1, num2, num3) || areHigherThan6(num1, num2, num3)) {
            System.out.println("You entered an invalid dice number. Try program again.");
            System.exit(0);
        }
        scan.close();

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Your sum: " + sumOfNumbers);

        System.out.println("Dice sum: " + sumOfDiceRolls);

        if(userWon(sumOfNumbers, sumOfDiceRolls)) {
            System.out.println("Congrats, you won!");
        } else {
            System.out.println("Better luck next time!");
        }
    }

    public static boolean areLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean areHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls);
    }

    public static int rollSum(int roll1, int roll2, int roll3){
        return roll1 + roll2 + roll3;
    }

    public static int userSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int rollDice(){
        
        return (int)(Math.random() * 6) + 1;
    }


}
