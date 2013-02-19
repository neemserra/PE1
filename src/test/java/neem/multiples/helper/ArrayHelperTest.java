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

	ArrayHelper testObject;

	@Before
	public void setUp() throws Exception {
		testObject = new ArrayHelper();
	}

	@Test
	public void testCombineLists() {
		// Assemble
		final List<Integer> list0 = Arrays.asList(3, 4, 5);
		final List<Integer> list1 = Arrays.asList(5, 6, 7);
		final List<Integer> combinedList = Arrays.asList(3, 4, 5, 6, 7);

		// Act
		List<Integer> result = testObject.combineLists(list0, list1);

		// Assert
		assertEquals(combinedList, result);

	}

	@Test
	public void testSumList() {
		// Assemble
		final List<Integer> combinedList = Arrays.asList(3, 4, 5, 6, 7);
		Integer sum = 25;

		// Act
		Integer result = testObject.sumList(combinedList);

		// Assert
		assertEquals(sum, result);
	}

}
