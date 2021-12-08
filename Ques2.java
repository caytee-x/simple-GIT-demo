package assignment5;

import java.util.stream.IntStream;

public class Ques2 {
	//calculate average of array elements

	public static void main(String[] args) {
	
		int[]myNum= {89,71,54,96,71};
	
		int sum= IntStream.of(myNum).sum();
		//finds sum
		
	    int avg= sum/myNum.length;
	    
	    System.out.println("The average of the numbers are:"+ avg);
	    
		}
			
		
}

