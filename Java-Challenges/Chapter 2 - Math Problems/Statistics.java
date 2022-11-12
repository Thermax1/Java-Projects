import java.util.ArrayList; //This is great for when I want to resize the array. Or in my case, have my array be an exact size without pre-defining it beforehand
import java.util.Scanner;

public class Statistics {

    static void calcSumAndCountAllNumbersDivBy_2_Or_7(int a) {

        int count = 0;
        int sum = 0;

        int max_number = a;
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for (int i = 1; i < max_number; i++) {
            if (i % 2 == 0) {
                count++;

                arrayList1.add(i);

                sum = sum + i;
            }

            if (i % 1 == 0 && i % 7 == 0) {
                count++;

                arrayList2.add(i);

                sum = sum + i;
            }
        }

        if (arrayList1.size() > 0) {
            System.out.print("Divisible by 2: ");
            for (Integer i : arrayList1) {
                System.out.print(i + " ");
            }
        }

        if (arrayList2.size() > 0) {
            System.out.print("\nDivisible by 7: ");
            for (Integer i : arrayList2) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nWe were able to divide a total of " + count + " times");

        System.out.println("Our total sum was: " + sum);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number greater than 2: ");
        int num1 = scan.nextInt();

        while(num1 <= 2){
            System.out.print("Wrong input. Please enter a number greater than 2: ");
            num1 = scan.nextInt();
        }
        scan.close();
        calcSumAndCountAllNumbersDivBy_2_Or_7(num1);

    }
}