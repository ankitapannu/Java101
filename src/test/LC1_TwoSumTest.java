package test;

import main.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class LC1_TwoSumTest {

	@Test
	void LC1_TwoSumTest_V1() {
		int [] nums = {2, 7, 11, 15};
		int target = 9;
		int [] expected = {0, 1};
		int [] actual = LC1_TwoSum.twoSumV1(nums, target);
		Arrays.sort(expected);
	    Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void LC1_TwoSumTest_V2() {
		int [] nums = {2, 7, 11, 15};
		int target = 9;
		int [] expected = {0, 1};
		int [] actual = LC1_TwoSum.twoSumV2(nums, target);
		Arrays.sort(expected);
	    Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

}
