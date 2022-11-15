import java.util.Scanner;

public class NumberText {

    //create array with words 0 - 9
    // Take number and turn into string
    //compare index position to array and print out correct input
  static void numberAsText(String s){
    
    String valueAsText = "";
    
    for(int i = 0;i< s.length();i++) {
      if(s.charAt(i) == '0'){
        valueAsText = "ZERO";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '1'){
        valueAsText = "ONE";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '2'){
        valueAsText = "TWO";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '3'){
        valueAsText = "THREE";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '4'){
        valueAsText = "FOUR";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '5'){
        valueAsText = "FIVE";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '6'){
        valueAsText = "SIX";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '7'){
        valueAsText = "SEVEN";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '8'){
        valueAsText = "EIGHT";
        System.out.print(valueAsText + " ");
      }
            
      if(s.charAt(i) == '9'){
        valueAsText = "NINE";
        System.out.print(valueAsText + " ");
      }
    }
    
    System.out.println("\n");

  }
        
    
  public static void main(String[] args){
      
    Scanner scan = new Scanner(System.in);
      
    System.out.print("Enter a number and I'll print out each digit for you: ");
    int answer = scan.nextInt();
    String convert = Integer.toString(answer);
      
    numberAsText(convert);
      
    }
}
