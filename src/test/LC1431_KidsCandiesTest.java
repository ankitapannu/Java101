package test;

import main.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LC1431_KidsCandiesTest {

	@Test
	void LC1431_KidsCandiesTest_V1_1() {
		int [] candies = {2, 3, 5, 1, 3};
		int extraCandies = 3;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, true, true, false, true));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV1(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V1_2() {
		int [] candies = {4, 2, 1, 1, 2};
		int extraCandies = 1;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV1(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V1_3() {
		int [] candies = {12, 1, 12};
		int extraCandies = 10;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, false, true));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV1(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V2_1() {
		int [] candies = {2, 3, 5, 1, 3};
		int extraCandies = 3;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, true, true, false, true));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV2(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V2_2() {
		int [] candies = {4, 2, 1, 1, 2};
		int extraCandies = 1;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV2(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V2_3() {
		int [] candies = {12, 1, 12};
		int extraCandies = 10;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, false, true));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV2(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V3_1() {
		int [] candies = {2, 3, 5, 1, 3};
		int extraCandies = 3;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, true, true, false, true));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV3(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V3_2() {
		int [] candies = {4, 2, 1, 1, 2};
		int extraCandies = 1;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV3(candies, extraCandies);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1431_KidsCandiesTest_V3_3() {
		int [] candies = {12, 1, 12};
		int extraCandies = 10;
		List<Boolean> expected = new ArrayList<Boolean>(Arrays.asList(true, false, true));
		List<Boolean> actual = LC1431_KidsCandies.kidsWithCandiesV3(candies, extraCandies);
		assertEquals(expected, actual);
	}

}
