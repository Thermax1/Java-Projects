import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        Scanner scanner = new Scanner(System.in);
        //set up scanner. 

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String myName = scanner.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("\nHi " + myName + "! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        
        String myHome = scanner.nextLine();

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + myHome + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        //Pick up age and store it.

        int myAge = scanner.nextInt();
        scanner.nextLine();

        //add new a line before asking next question.
        System.out.println("\nSo you're " + myAge +", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (double)(400 / myAge) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        String favLang = scanner.nextLine();


        //add new a line here.
        System.out.println("\n" + favLang + ", that's great! Nice chatting with you, " + myName + ". I have to log off now. See ya!");
        
        //close scanner. 

        
    }
}
