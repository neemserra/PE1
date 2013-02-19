package neem.multiples.helper;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ArrayHelperTest {

	@Mock
	ArrayHelper mockArrayHelper;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCombineLists() {
		//Assemble
		final List<Integer> list0 = Arrays.aslist(3, 4, 5);
		final List<Integer> list1 = Arrays.aslist(5, 6, 7);
		final List<Integer> combinedList = Arrays.aslist(3, 4, 5, 6, 7);
		
		//Act
		List<Integer> result = mockArrayHelper.combineLists(list0, list1);
		
		//Assert
		assertEquals(combinedList, result);
		

	}
	@Test
	public void testSumList() {
		//Assemble
		final List<Integer> combinedList = Arrays.aslist(3, 4, 5, 6, 7);
		Integer sum = 25;
		
		//Act
		Integer result = mockArrayHelper.sumList(combinedList);
		
		//Assert
		assertEquals(sum, result);
	}
	
	
}
