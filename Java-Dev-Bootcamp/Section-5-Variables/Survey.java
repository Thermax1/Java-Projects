import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        int counter = 0;
        System.out.println("Welcome. Thank you for taking the survey");

        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter += 1;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter += 1; // can also do counter++ for reference

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter += 1;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter += 1;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter += 1;

        scan.close();
        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you, " + name + " for answering all " + counter + " questions.");
        System.out.println("Weekly, you spend $" + (coffeePrice * coffeeAmount) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodPrice * foodAmount) + " on food.");

    }
}
