package neem.multiples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import neem.multiples.helper.ArrayHelper;



public class EulerIO {


	public static void main(String[] args) throws IOException {
		System.out.println("Please input an integer: ");
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
	    String inputLine = userInput.readLine();
		
	    try {
	    	int userDefinedMaximumValueToSumUntil = Integer.parseInt(inputLine);
	    	BusinessClass business = new BusinessClass(userDefinedMaximumValueToSumUntil, new Multiples(new ArrayHelper()));
			Integer finalSum = business.findSumOfMultiplesOfThreeAndFive();
			
			System.out.print(finalSum);
	    }
	      
	    catch (NumberFormatException e) {
	    	System.err.println("Input is not an integer");
	    }
	}



}
