import java.util.Scanner;

class EvenIntegers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int intValue;
        int sumValue = 0;
        boolean breakloop = true;

        System.out.print("Enter integer: ");
        intValue = scan.nextInt();

        if(intValue < 2) {
            System.out.println("Integer must be greater than or equal to 2");
        }

        while(breakloop && intValue >= 2) {

            if(intValue % 2 != 0) {
                intValue = intValue -1;
                sumValue = sumValue + intValue;
                intValue = intValue -2;
            }
            
            if (intValue % 2 == 0) {
                sumValue = sumValue + intValue;
                intValue = intValue - 2;
            }
            
            if(intValue == 2) {
                sumValue = sumValue + intValue;
                System.out.println("Your even integer total is: " + sumValue);
            }
        }
    }
}
