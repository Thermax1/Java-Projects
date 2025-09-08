import java.util.Arrays;
import java.util.Scanner;

public class Prices {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String[] categories = {"Baking", "Beverage", "Cereals"};
        // double[][] myDouble = new double[3][5];
        // for(int i = 0; i < myDouble.length;i++){
        //     for(int j = 0; j < myDouble[i].length;j++){
        //         System.out.print("Enter row " + i + " column " + j + " here: ");
        //         myDouble[i][j] = scan.nextDouble();
        //     }
        double[][] myDouble = {
        {12.99, 8.99, 9.99, 10.49, 11.99},
        {0.99, 1.99, 2.49, 1.49, 2.99},
        {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        
        for(int i = 0; i < myDouble.length;i++){
            System.out.print(categories[i] + ": ");
            System.out.println(Arrays.toString(myDouble[i]));
        }
    }
}
