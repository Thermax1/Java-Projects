class BetterMethod {
   
  public static void main(String[] args) {


    int method1 = 0;
    int hourlyRate1 = 10;
    int totalPay1 = 0;
    double method2 = 0;
    double hourlyRate2 = .10;
    double totalPay2 = 0;
    boolean exitProg = true;
    int method1Hours = 0;
    double method2Hours = 0;   

    while(exitProg) {

      method1Hours++;
      method2Hours++;

      method1 = hourlyRate1 * method1Hours;
      totalPay1 = method1;

      if(method2Hours > 0) {
        method2 = method2 + hourlyRate2;
        totalPay2 = method2;
        hourlyRate2 = hourlyRate2 * 2; 
       }

      if(totalPay2 > totalPay1)
        exitProg = false;

      }
        
    
    System.out.println("Method 1 is $10 per hour. Method 2 starts at $.10 for the first hour, followed by the pay doubling every hour.");

    System.out.printf("At " + method2Hours + " hours, $.10 doubled each hour is $ %.2f" + " while $10 per hour is $" + totalPay1 + ".\n", totalPay2);

    System.out.println("Therefore, one would need to work at least a ten hour shift in order to make Method 2 more beneficial than Method 1.");
    
  }
}