import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 6;   //3rd day of the week...
        boolean holiday;
         
        Scanner scan = new Scanner(System.in);

        System.out.print("Is today a holiday? Enter 'yes' or 'no': ");

        String holidayAnswer = scan.nextLine().toLowerCase();

        if(holidayAnswer.equals("yes")){
            holiday = true;
        } else {
            holiday = false;
        }
        
        if(holiday == true) {
            System.out.println("Woohoo, no work!");
        }
        else if(day == 6 || day == 7){
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 AM :(");
        }
        
        }

    }
