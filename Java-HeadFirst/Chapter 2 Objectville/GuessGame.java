import java.util.Random;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    Random random = new Random();

    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;

        int targetNumber = random.nextInt(10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true){
            System.out.println("Number to guess is " + targetNumber);

            int guessp1 = p1.guess();
            System.out.println("Player one guessed: " + guessp1);
            int guessp2 = p2.guess();
            System.out.println("Player two guessed: " + guessp2);
            int guessp3 = p3.guess();
            System.out.println("Player three guessed: " + guessp3);

            if(guessp1 == targetNumber) {
                p1Right = true;
            }

            if(guessp2 == targetNumber) {
                p2Right = true;
            }

            if(guessp3 == targetNumber) {
                p3Right = true;
            }

            if(p1Right || p2Right || p3Right) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1Right);
                System.out.println("Player two got it right? " + p2Right);
                System.out.println("Player three got it right? " + p3Right);
                break; //game over
            } else {
                System.out.println("Players will have to try again!");
            }
        }
    }
}
