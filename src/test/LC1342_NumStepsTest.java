package test;

import main.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.LC1108_DefangIP;

class LC1342_NumStepsTest {

	@Test
	void LC1342_NumStepsTest_V1() {
		int num = 14;
		int expected = 6;
		int result = LC1342_NumSteps.numberOfStepsV1(num);
		assertEquals(expected, result);
	}
	
	@Test
	void LC1342_NumStepsTest_V2() {
		int num = 14;
		int expected = 6;
		int result = LC1342_NumSteps.numberOfStepsV2(num);
		assertEquals(expected, result);
	}
	
	@Test
	void LC1342_NumStepsTest_V2_BaseCase() {
		int num = 0;
		int expected = 0;
		int result = LC1342_NumSteps.numberOfStepsV2(num);
		assertEquals(expected, result);
	}

}
