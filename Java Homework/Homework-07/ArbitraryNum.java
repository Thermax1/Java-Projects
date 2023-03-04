//Arbitrary num should not be a set number of inputs

import java.util.Scanner;
import java.util.Arrays;

class ArbitraryNum {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter how many values you wish to have: ");
	int count = scan.nextInt();
	int values[] = new int[count];
	
	for(int x = 0;x<values.length;x++){
	  System.out.print("Enter a value between 0 and 50: ");
	  
	  count = scan.nextInt();
	  
	  if(count >= 0 && count <= 50){
	    values[x] = count;
	    }
	  while(count < 0 || count > 50) {
	      System.out.println("Number out of range. Try again.");
	      
	      System.out.print("Enter a value between 0 and 50: ");
	      
	      count = scan.nextInt();
	      if(count >= 0 && count <= 50)
	        values[x] = count;
	  }
	}
	
	Arrays.sort(values);
	int numCount = 0;
	
	for(int x = 0;x<values.length;x++) {
		for(int i = 0;i<values.length;i++) {
			if(values[i] == values[x]) {
				numCount++;
			}
		}
		
		if(numCount > 0) {
			System.out.println("The value of " + values[x] + " has " + numCount + " occurences.");
			numCount = 0;
		}
	}
	
	  
  }	
}
