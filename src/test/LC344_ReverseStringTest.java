package test;

import main.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC344_ReverseStringTest {

	@Test
	void LC344_ReverseStringTest_V1_1() {
		char[] input = {'h', 'e', 'l', 'l', 'o'};
		LC344_ReverseString.reverseString(input);
		char[] expected = {'o', 'l', 'l', 'e', 'h'};
		assertArrayEquals(expected, input);
	}
	
	@Test
	void LC344_ReverseStringTest_V1_2() {
		char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};
		LC344_ReverseString.reverseString(input);
		char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
		assertArrayEquals(expected, input);
	}

}
