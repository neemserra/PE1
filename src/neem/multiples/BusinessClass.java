package neem.multiples;

import java.util.ArrayList;
import java.util.List;

public class BusinessClass {

	
	private int userDefinedMaximumValueToSumUntil;
	private Multiples multiples;

	public BusinessClass(int userDefinedMaximumValueToSumUntil, Multiples multiples) {
		// TODO Auto-generated constructor stub
		this.userDefinedMaximumValueToSumUntil = userDefinedMaximumValueToSumUntil;	
		this.multiples = multiples;
	}

	public Integer findSumOfMultiplesOfThreeAndFive() {
		List<Integer> threes = multiples.findMultiples(userDefinedMaximumValueToSumUntil, 3);
		List<Integer> fives = multiples.findMultiples(userDefinedMaximumValueToSumUntil, 5);
		
//		List<Integer> thingy = new ArrayList<Integer>();
//		for(Integer i : threes){
//			thingy.add(i);
//		}
//		
		Integer finalSum = multiples.sum(threes, fives);
		
		return finalSum;
	}

}
