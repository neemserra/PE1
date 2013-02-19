package neem.multiples.helper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		List<Integer> list0 = Mockito.mock(ArrayList.class);
		List<Integer> list1 = Mockito.mock(ArrayList.class);
		List<Integer> combinedList = Mockito.mock(ArrayList.class);
		
		Mockito.when(mockArrayHelper.combineLists(list0, list1)).thenReturn(combinedList);
		
		//Act
		List<Integer> result = mockArrayHelper.combineLists(list0, list1);
		
		//Assert
		assertEquals(combinedList, result);
		

	}
	@Test
	public void testSumList() {
		//Assemble
		List<Integer> list0 = Mockito.mock(ArrayList.class);
		List<Integer> list1 = Mockito.mock(ArrayList.class);
		List<Integer> combinedList = Mockito.mock(ArrayList.class);
		Integer sum = new Random().nextInt();
		
		Mockito.when(mockArrayHelper.combineLists(list0, list1)).thenReturn(combinedList);
		Mockito.when(mockArrayHelper.sumList(combinedList)).thenReturn(sum);
		
		
		//Act
		Integer result = mockArrayHelper.sumList(combinedList);
		
		//Assert
		assertEquals(sum, result);
		

	}
	
	
}
