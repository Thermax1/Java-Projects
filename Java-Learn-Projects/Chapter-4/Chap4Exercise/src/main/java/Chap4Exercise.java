import java.util.Scanner;

public class Chap4Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("What does your dinosaur eat? Enter animals or plants: ");
        String dinoDiet = scanner.next().toLowerCase();

        if(!(dinoDiet.equals("animals") || dinoDiet.equals("plants"))) {
            System.out.println("Wrong input. Try again!");
            while(!(dinoDiet.equals("animals") || dinoDiet.equals("plants"))) {
                System.out.print("What does your dinosaur eat? Enter animals or plants: ");
                dinoDiet = scanner.next().toLowerCase();
            }
        }

        System.out.println("You entered " + dinoDiet + "!");

    }
}
