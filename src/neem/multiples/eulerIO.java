package neem.multiples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class eulerIO {

	/**
	 * @throws IOException 
	 * @int userinput
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Please input an integer: ");
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
	    String inputLine = userInput.readLine();
		
	    try {
	    	int integerInput = Integer.parseInt(inputLine);
			Multiples userMult = new Multiples(integerInput);
			int finalSum = userMult.process(integerInput);
			
			System.out.print(finalSum);
	    }
	      
	    catch (NumberFormatException e) {
	    	System.err.println("Input is not an integer");
	    }
	}

}
