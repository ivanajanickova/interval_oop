package Interval_oop.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Interval_oop.Interval;

class Interval_oopTest {

	@Test
	void test() {
		Interval myInterval = new Interval(4,7);
		assertEquals(4, myInterval.getLowerBound());
		assertEquals(7, myInterval.getUpperBound());
		assertEquals(3, myInterval.getWidth());
		assertArrayEquals(new int[] {4, 5, 6}, myInterval.getElements());
	}

}
