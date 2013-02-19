package neem.multiples;

import java.util.ArrayList;
import java.util.List;

import neem.multiples.helper.ArrayHelper;

public class Multiples {

	private ArrayHelper arrayHelper;


	public Multiples(ArrayHelper arrayHelper) {
		this.arrayHelper = arrayHelper;
	}


	public int sum(List<Integer> list0, List<Integer> list1) {
		
		List<Integer> combinedList = arrayHelper.combineLists(list0, list1);
		return arrayHelper.sumList(combinedList);
		
	}


	public List<Integer> findMultiples(int maximumValue, int multipleNumber) {
		List<Integer> mult = new ArrayList<Integer>();
		for (int index = 1; index < maximumValue; index++){
			if (index % multipleNumber == 0){
				mult.add(index);
			}
		}
		return mult;
	}

}
