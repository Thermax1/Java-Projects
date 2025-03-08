public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "cloudy";
        switch (weather) {
            case "sunny": System.out.println("You can wear a shirt"); break;
            case "cloudy": System.out.println("You can wear a sweater"); break;
            case "rainy": System.out.println("You can wear a raincoat"); break;
            case "snowy": System.out.println("You can wear a coat"); break;
            default: System.out.println("You can wear what you want");
            
        }
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        // Section 2: User role
        int role = 2;

        switch (role) {
            case 1: System.out.println("admin"); break;
            case 2: System.out.println("editor"); break;
            case 3: System.out.println("user"); break;
            default: System.out.println("Undetermined role");
        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if(temperature >= 80 && humidity > 60) {
            System.out.println("Too hot and humid!");
        } else if (temperature >= 60 && humidity >= 50) {
            System.out.println("Comfortable temperature. Maybe a light jacket if you like");
        } else {
            System.out.println("It's cold. Anything below 60 is cold.");
        }
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // Section 5: Age and income
        int age = 25;
        int income = 50000;

        if(age >=21 && income >= 50000) {
            System.out.println("You're eligible for our card!");
        } else if(age >=21 && income < 50000) {
            System.out.println("Your income is too low for our cards!");
        } else {
            System.out.println("You're too young. We don't care how much money you make");
        }
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";

        switch (lightColor) {
            case "green": System.out.println("You can wear go"); break;
            case "yellow": System.out.println("You should slow down to a stop"); break;
            case "red": System.out.println("STOPPPPPPPPPPPP"); break;
            default: System.out.println("Stoplight is out of order. Treat like a stop sign.");
            
        }
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;

        if(grade < 60) {
            System.out.println("You got an F");
        } else if (grade >=60 && grade < 70) {
            System.out.println("you got a D");
        } else if (grade >=70 && grade < 80) {
            System.out.println("you got a C");
        } else if (grade >=80 && grade < 90) {
            System.out.println("you got a B");
        } else {
            System.out.println("You got an A, smarty pants");
        }
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";

        switch (browser) {
            case "Chrome": System.out.println("You're running Chrome. Good choice"); break;
            case "Firefox": System.out.println("You're running Firefox. Good choice"); break;
            case "Edge": System.out.println("You're running Edge. Don't do that lol"); break;
            case "Opera": System.out.println("You're running Opera. Do you happen to be an old person?"); break;
            default: System.out.println("You misspelled the browser or are using some yee-yee browser.");
        }
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
