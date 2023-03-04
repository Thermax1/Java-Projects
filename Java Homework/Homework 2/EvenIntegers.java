import java.util.Scanner;

class EvenIntegers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int integerValue;
    int sumEvenInteger = 0;
    
    System.out.print("Enter your integer: ");
    integerValue = scan.nextInt();

    if(integerValue < 2) {
      System.out.println("You must enter an integer greater than or equal to 2");
    }

    while(true && integerValue >= 2) {

    
        if (integerValue % 2 != 0) {
          integerValue = integerValue -1;
          sumEvenInteger = sumEvenInteger + integerValue;
          integerValue = integerValue - 2;
         }
         
        if (integerValue % 2 == 0) {
          sumEvenInteger = sumEvenInteger + integerValue;
          integerValue = integerValue - 2;
         }
     
        if (integerValue < 2){
         System.out.println("Sum of all even integer values: " + sumEvenInteger);
        }
  
    } 
  }
}