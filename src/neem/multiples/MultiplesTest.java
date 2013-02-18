package neem.multiples;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import neem.multiples.helper.ArrayHelper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MultiplesTest {

	private Multiples testObject;
	@Mock
	ArrayHelper mockArrayHelper;

	@Before
	public void setUp() {
		testObject = new Multiples(mockArrayHelper);	
	}
	
	@Test
	public final void testThrees() {
		//Assemble
		List<Integer> testList = Arrays.asList(3, 6, 9);

		//Act
		List<Integer> result = testObject.findMultiples(10, 3);
		
		//Assert
		assertEquals(testList, result);
	}

	@Test
	public final void testFives() {
		//Assemble
		List<Integer> testList = Arrays.asList(5);

		//Act
		List<Integer> result = testObject.findMultiples(10, 5);
		
		//Assert
		assertEquals(testList, result);
	}

	@Test
	public final void testSum() {
		//Assemble
		List<Integer> list0 = Mockito.mock(ArrayList.class);
		List<Integer> list1 = Mockito.mock(ArrayList.class);
		List<Integer> combinedList = Mockito.mock(ArrayList.class);
		Integer sum = new Random().nextInt();
		
		Mockito.when(mockArrayHelper.combineLists(list0, list1)).thenReturn(combinedList);
		Mockito.when(mockArrayHelper.sumList(combinedList)).thenReturn(sum);
		
		
		//Act
		Integer result = testObject.sum(list0, list1);
		
		//Assert
		assertEquals(sum, result);
		
	}

}
