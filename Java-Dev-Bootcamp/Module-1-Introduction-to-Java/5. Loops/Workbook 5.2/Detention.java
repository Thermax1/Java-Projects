import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.

        Scanner scan = new Scanner(System.in);
        System.out.print("Type here: ");
        String bartLine = scan.nextLine();
        scan.close();

        for(int i = 1;i < 100;i++){
            System.out.println(i + ". " + bartLine);
        }
    }
}
