import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions.


        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        //store answer 1
        String answerOne = scan.nextLine().toLowerCase();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        //store answer 2
        String answerTwo = scan.nextLine().toLowerCase();


        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        //store answer 3
        String answerThree = scan.nextLine().toLowerCase();


        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        //store answer 4
        String answerFour = scan.nextLine().toLowerCase();

        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        
        if(answerOne.equals("c")) {
            score += 5;
        }
        if(answerTwo.equals("a")) {
            score += 5;
        }
        if(answerThree.equals("d")) {
            score += 5;
        }
        if(answerFour.equals("a") || answerFour.equals("b")) {
            score += 5;
        }
        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score

        if(score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5 && score < 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time!");
        }

        // if the score is 15 or higher, print: "Wow, you know your stuff!";
        // if the score is between 5 and 15, print "Not bad!";
        // else, better luck next time. 
        scan.close();

    }
}
