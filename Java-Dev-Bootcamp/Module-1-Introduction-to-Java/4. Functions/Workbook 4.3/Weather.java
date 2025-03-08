public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function.
        System.out.println("Midnight temperature");
        printTemperatures(midnight);
        System.out.println("Noon temperature");
        printTemperatures(noon);
        System.out.println("Evening temperature");
        printTemperatures(evening); 
        
        
    }


    //Task 1: Make a function here. See the doc comments below.

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (5.0/9.0);
        return (celsius);
    }

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */

     
    //Task 2: Make a function here. See the doc comments below.

    public static void printTemperatures(double fahrenheit){
        System.out.println("F: " + fahrenheit);
        System.out.printf("C: %.2f\n", fahrenheitToCelsius(fahrenheit));
    }

    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
}