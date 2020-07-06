package test;

import main.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class LC1470_ShuffleArrayTest {

	@Test
	void LC1470_ShuffleArrayTest_V1_1() {
		int[] nums = {2, 5, 1, 3, 4, 7};
		int n = 3;
		int[] expected = {2, 3, 5, 4, 1, 7};
		int[] actual = LC1470_ShuffleArray.shuffleV1(nums, n);
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void LC1470_ShuffleArrayTest_V1_2() {
		int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
		int n = 4;
		int[] expected = {1, 4, 2, 3, 3, 2, 4, 1};
		int[] actual = LC1470_ShuffleArray.shuffleV1(nums, n);
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void LC1470_ShuffleArrayTest_V1_3() {
		int[] nums = {1, 1, 2, 2};
		int n = 2;
		int[] expected = {1, 2, 1, 2};
		int[] actual = LC1470_ShuffleArray.shuffleV1(nums, n);
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

}
