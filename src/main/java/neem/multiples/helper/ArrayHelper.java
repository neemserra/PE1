package neem.multiples.helper;

import java.util.List;

public class ArrayHelper {

	public List<Integer> combineLists(List<Integer> list0, List<Integer> list1) {
		List<Integer> combinedList = list0;
		for (int index = 0; index < list1.size(); index++){
			if (!list0.contains(list1.get(index)))
				combinedList.add(list1.get(index));
		}
		return combinedList;
	}

	public Integer sumList(List<Integer> combinedList) {
		Integer sum = 0;
		for (int index = 0; index < combinedList.size(); index++){
			sum += combinedList.get(index);
		}
		return sum;
	}

}
