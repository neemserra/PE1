package neem.multiples;

import java.util.ArrayList;
import java.util.List;

public class Multiples {
	int maxValue;
	
	public Multiples(int numberToTest) {
		maxValue = numberToTest;
	}

	public List<Integer> threes(int maxValue) {
		List<Integer> threeMult = new ArrayList<Integer>();
		for (int index = 1; index < maxValue; index++){
			if (index%3 == 0){
				threeMult.add(index);
			}
		}
		return threeMult;
	}

	public List<Integer> fives(int maxValue) {
		List<Integer>  fivesMult = new ArrayList<Integer>();
		for (int index = 1; index < maxValue; index++){
			if (index%5 == 0){
				fivesMult.add(index);
			}
		}
		return fivesMult;
	}

	public int sum(List<Integer> threes, List<Integer> fives) {
		int finalSum = 0;
		
		for (int index=0; index< threes.size(); index++)
		{
			finalSum += threes.get(index);
		}
		
		for (int index=0; index< fives.size(); index++)
		{
			if (!threes.contains(fives.get(index))){
				finalSum += fives.get(index);
			}
		}
		
		return finalSum;
	}

	public int process(int maxValue) {
		List<Integer> threesList = threes(maxValue);
		List<Integer> fivesList = fives(maxValue);
		int finalSum = sum(threesList, fivesList);
		return finalSum;
	}

}
