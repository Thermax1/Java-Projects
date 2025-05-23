import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press enter to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        int userCard = drawRandomCard();
        int userCard2 = drawRandomCard();
        int userTotal = userCard + userCard2;
        
        int dealerCard = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        int dealerTotal = dealerCard + dealerCard2;
        
        if(userTotal > 21){
            System.out.println("Player total is: " + userTotal);
            System.out.println("Bust! Player loses!");
            System.exit(0);
        }

        System.out.println("\nYou get a \n" + userCard + "\n" + cardString(userCard) + "\nand a\n" + userCard2 + "\n" + cardString(userCard2));
        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>

        System.out.println("Your total is: " + (userCard + userCard2));
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

       System.out.println("The dealer shows \n" + dealerCard + "\n" + cardString(dealerCard) + "\nand has a card facing down\n" + faceDown());

        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        boolean userBreak = true;

        System.out.println("Your current total is: " + userTotal);
        while(userBreak){

            String userDecision = hitOrStay();
            if(userDecision.equals("hit")){
                int newUserCard = drawRandomCard();
                userTotal += newUserCard;
                System.out.println("\nYou get a: " + newUserCard + "\n" + cardString(newUserCard));
                System.out.println("Your new total is: " + userTotal);
                if(userTotal > 21){
                    System.out.println("Bust! Player loses. Try again!");

                    System.exit(0);
                }
            }
            else if(userDecision.equals("stay")){
                userBreak = false;
            }
        }

        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are: " + dealerCard + "\n" + cardString(dealerCard) + "\n and a " + dealerCard2 + "\n" + cardString(dealerCard2));

        System.out.println("Dealer's current total: " + dealerTotal);
        while(dealerTotal < 17){
            if(dealerTotal > 21){
                System.out.println("Dealer's total is: " + dealerTotal);
                System.out.println("BUST! Dealer loses!");
                System.exit(0);
            }
            System.out.println("Dealer's total: " + dealerTotal);
            int newDealerCard = drawRandomCard();
            System.out.println("Dealer gets a: " + newDealerCard);
            System.out.println("\n" + cardString(newDealerCard));
            dealerTotal += newDealerCard;
            System.out.println("New Dealer total: " + dealerTotal);
        }

        if(userTotal > dealerTotal){
            System.out.println("Payer wins!");
        }
        else{
            System.out.println("Dealer wins!");
        }

        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

     public static int drawRandomCard(){
        return (int)(Math.random() * 13) + 1;
     }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    public static String cardString(int cardNumber){
        switch (cardNumber) {
            case 1:
            return
                   "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
          
             case 2:
             return
                    "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";  
             case 3:
             return
                  "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

             case 4:
             return 
                   "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
             case 5:
             return
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

             case 6:
             return
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

             case 7:
              return
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
             case 8:
             return
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
             
             case 9:
             return
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

             case 10:
             return
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            
             case 11:
             return
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            
            case 12:
            return
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
              
              case 13:
              return 
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
               default:
               return "out of bounds somehow"; 
        } 
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */

    public static String hitOrStay(){
        System.out.println("Do you want to hit or stay?");
        String userResponse = scan.nextLine().toLowerCase();
        while (!userResponse.equals("hit") && !userResponse.equals("stay")){
            System.out.println("Please write 'hit' or 'stay'");
            System.out.println("Do you want to hit or stay?");
            userResponse = scan.nextLine().toLowerCase();
        }
        return userResponse;       
    }
    }

