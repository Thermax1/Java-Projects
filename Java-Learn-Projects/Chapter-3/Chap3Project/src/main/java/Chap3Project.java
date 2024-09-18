import java.time.Year;
import java.util.Scanner;

public class Chap3Project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the weight of your dinosaur: ");
        int dinoWeight = scanner.nextInt();
        System.out.print("What percentage of its weight does this dinosaur eat per day? Enter number only: ");
        int dinoPercent = scanner.nextInt();
        System.out.print("How many times a day does your dinosaur need to eat: ");
        int dinoFrequency = scanner.nextInt();

        float dinoFoodDaily = dinoWeight * ((float)dinoPercent / 100);

        float dinoFoodBreakdown = dinoFoodDaily / dinoFrequency;

        System.out.printf("Your %d kg dinosaur needs to eat %.0f kg daily, which means we need to serve %.0f kg per feeding!", dinoWeight, dinoFoodDaily, dinoFoodBreakdown);
    }
}
