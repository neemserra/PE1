package neem.multiples;

import static org.junit.Assert.*;

import org.junit.Test;

import neem.multiples.helper.ArrayHelper;

public class IntegrationTest {
	
	@Test
	public void testApp(){
		BusinessClass businessClass = new BusinessClass(10, new Multiples(new ArrayHelper()));
		
		Integer finalAnswer = businessClass.findSumOfMultiplesOfThreeAndFive();
		
		assertEquals((Integer)23, finalAnswer);	
	}

}
