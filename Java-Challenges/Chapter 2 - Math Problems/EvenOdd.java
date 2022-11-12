import java.util.Scanner;
public class EvenOdd {

    static boolean isEven(int n) {
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isOdd(int n) {
        if(n % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();

        scan.close();

        System.out.println(num1  + " is even: " + isEven(num1));
        System.out.println(num1  + " is odd: " + isOdd(num1));

    }
}
