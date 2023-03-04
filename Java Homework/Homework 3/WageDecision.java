import java.util.Scanner;

class WageDecision {

  public static void main(String[] args) {
    
    boolean exitProg = true;
    while(exitProg){

      Scanner scan = new Scanner(System.in);

      System.out.println("*".repeat(60));
      System.out.println("\t\t\t Menu");
      System.out.println("*".repeat(60));
      System.out.println("1) \t Calculate earnings at $10.00/hr");
      System.out.println("2) \t Calculate earnings at $.10 doubled each hour");
      System.out.println("3) \t Exit");
      System.out.println("*".repeat(60));
      System.out.print("Please enter an option: ");

      int option = scan.nextInt();

      if(option > 3 || option < 1)
        System.out.println("Please choose from the available options.\n");

      if(option == 3)
        exitProg = false;

      if(option == 1) {
        int hourlyWage = 10;
        System.out.print("Enter hours worked: ");
        int hoursWorked = scan.nextInt();
        
        int earnedPay = hourlyWage * hoursWorked;
        System.out.println("You will earn $ " + earnedPay + "\n");
       }
      
      if(option == 2){
        double hourlyWage = .10;
        double earnedPay = 0;
        double wageIncrease = 0;
        int x = 0;
        System.out.print("Enter hours worked: ");
        int hoursWorked = scan.nextInt();

        do{
          if(hoursWorked == 0)
            hourlyWage = 0;
          wageIncrease = wageIncrease + hourlyWage;
          earnedPay = wageIncrease;
          hourlyWage = hourlyWage * 2;
          x++;
         }while(x < hoursWorked);
         System.out.printf("you will earn $ %.2f" + "\n\n", earnedPay);
       }
    }
  }
}