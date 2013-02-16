package neem.multiples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MultiplesTest {

	private Multiples testObject;

	@Before
	public void setUp() {
		int maxValue = 10;
		testObject = new Multiples(maxValue);	
	}
	
	@Test
	public final void testThrees() {
		//Assemble
		List<Integer> testList = Arrays.asList(3, 6, 9);

		//Act
		List<Integer> result = testObject.threes(10);
		
		//Assert
		assertEquals(testList, result);
	}

	@Test
	public final void testFives() {
		//Assemble
		List<Integer> testList = Arrays.asList(5);

		//Act
		List<Integer> result = testObject.fives(10);
		
		//Assert
		assertEquals(testList, result);
	}

	@Test
	public final void testSum() {
		//Assemble
		int testFinalSum = 23;
		
		//Act
		List<Integer> threes = Arrays.asList(3, 6, 9);
		List<Integer> fives = Arrays.asList(5);		
		int finalSum = testObject.sum(threes, fives);
		
		//Assert
		assertEquals(testFinalSum, finalSum);
		
	}

	@Test
	public final void testProcess() {
		//Assemble
		int maxValue = 10;
		int testSum = 23;
		
		//Act
		int finalSum = testObject.process(maxValue);
		
		//Assert
		assertEquals(testSum, finalSum);
	}

}
