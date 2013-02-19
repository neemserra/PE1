package neem.multiples;


import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessClassTest {
	BusinessClass testObject;
	int maxValue = 10;
	
	@Mock
	Multiples mockMultiples;
	@Mock
	List<Integer> mockThreeList;
	@Mock
	List<Integer> mockFiveList;
	
	@Before
	public void setUp() throws Exception {
		testObject = new BusinessClass(maxValue, mockMultiples);
	}

	@Test
	public void testFindSumOfMultiplesOfThreeAndFive(){
		//Assemble
		Integer expectedSum = new Random().nextInt();
		
		Mockito.when(mockMultiples.findMultiples(maxValue, 3)).thenReturn(mockThreeList);
		Mockito.when(mockMultiples.findMultiples(maxValue, 5)).thenReturn(mockFiveList);
		Mockito.when(mockMultiples.sum(mockThreeList, mockFiveList)).thenReturn(expectedSum);
		
		
		//Act
		Integer testSum = testObject.findSumOfMultiplesOfThreeAndFive();
		
		//Assert
		assertEquals(expectedSum, testSum);
	}
}
