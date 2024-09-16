import java.time.Year;
import java.util.Scanner;

public class Chap3Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCapacity = 1000;
        int safetyRating;
        int dinoAgeDifference;
        Year currentYear = Year.now();

        System.out.print("Enter the weight of the first dinosaur: ");
        int dinoWeight1 = scanner.nextInt();
        System.out.print("Enter the age of the first dinosaur: ");
        int dinoAge1 = scanner.nextInt();
        System.out.print("Enter the weight of the second dinosaur: ");
        int dinoWeight2 = scanner.nextInt();
        System.out.print("Enter the age of the second dinosaur: ");
        int dinoAge2 = scanner.nextInt();

        if(dinoAge1 == dinoAge2) {
            dinoAgeDifference = 0;
        } else if(dinoAge1 > dinoAge2) {
            dinoAgeDifference = dinoAge1 - dinoAge2;
        } else {
            dinoAgeDifference = dinoAge2 -  dinoAge1;
        }
        System.out.println("The current age differences between our two dinosaurs is: " + dinoAgeDifference);

        int averageDinoWeight = (dinoWeight1 + dinoWeight2) / 2;

        System.out.println("The average weight is: " + averageDinoWeight + " pounds.");

        int dinoFoodNeeded = averageDinoWeight / 3;

        System.out.println("Dinosaurs eat less than you think! To keep our dinosaurs healthy, we take the average weight of the dinosaurs and divide it by 3 so we know how many pounds of food they need per day.");

        System.out.println("Since our average weight is " + averageDinoWeight + " pounds, we know that the total amount of food needed is " + dinoFoodNeeded + " pounds.");


        if(currentYear.isLeap()) {
            System.out.println("The current year is " + currentYear + ". We are currently in a leap year.");
        } else {
            System.out.println("The current year is " + currentYear + ". We are currently not in a leap year.");
        }

        System.out.print("Enter the number of people in the park right now: ");

        int currentCapacity = scanner.nextInt();

        if(currentCapacity > maxCapacity) {
            System.out.println("Max capacity reached: True");
        } else {
            System.out.println("Max capacity reached: False");
        }

        System.out.print("What is our safety rating: ");
        safetyRating = scanner.nextInt();

        if(safetyRating > 7) {
            System.out.println("Our safety rating is pretty high right now!");
        } else {
            System.out.println("Our safety rating is in the dumpster!");
        }
    }
}
