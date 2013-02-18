package neem.multiples;

import java.util.List;

public class BusinessClass {

	
	private int userDefinedMaximumValueToSumUntil;
	private Multiples multiples;

	public BusinessClass(int userDefinedMaximumValueToSumUntil, Multiples multiples) {
		this.userDefinedMaximumValueToSumUntil = userDefinedMaximumValueToSumUntil;	
		this.multiples = multiples;
	}

	public Integer findSumOfMultiplesOfThreeAndFive() {
		List<Integer> threes = multiples.findMultiples(userDefinedMaximumValueToSumUntil, 3);
		List<Integer> fives = multiples.findMultiples(userDefinedMaximumValueToSumUntil, 5);
			
		Integer finalSum = multiples.sum(threes, fives);
		
		return finalSum;
	}

}
