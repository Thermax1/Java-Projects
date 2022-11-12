import java.util.Scanner;

public class BasicOperators{

    //calc method must be static to be able to run in main method
    // Other option includes creating a new BasicOperators class (same way as creating a new Scanner) and using that
    // BasicOperators test = new BasicOperators();
    static int calc(int m, int n){ 

        int result = (((m * n) / 2) % 7);

        String output = String.format("We multiplied %d by %d, divided it by 2, and we looked for a remainder using 7. Our final result was: %d",m,n,result);

        System.out.println(output);

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter a number: ");
        int num2 = scan.nextInt();

        scan.close();

        calc(num1, num2);
    }
}