package test;

import main.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import main.LC1108_DefangIP;

class LC1108_DefangIPTest {

	@Test
	void LC1108_DefangIPTest_V1() {
		String address = "1.1.1.1";
		String expected = "1[.]1[.]1[.]1";
		String actual = LC1108_DefangIP.defangIPaddrV1(address);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1108_DefangIPTest_V1_Empty() {
		String address = "";
		String expected = "";
		String actual = LC1108_DefangIP.defangIPaddrV1(address);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1108_DefangIPTest_V2() {
		String address = "1.1.1.1";
		String expected = "1[.]1[.]1[.]1";
		String actual = LC1108_DefangIP.defangIPaddrV2(address);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1108_DefangIPTest_V2_Empty() {
		String address = "";
		String expected = "";
		String actual = LC1108_DefangIP.defangIPaddrV2(address);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1108_DefangIPTest_V3() {
		String address = "1.1.1.1";
		String expected = "1[.]1[.]1[.]1";
		String actual = LC1108_DefangIP.defangIPaddrV3(address);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1108_DefangIPTest_V3_Empty() {
		String address = "";
		String expected = "";
		String actual = LC1108_DefangIP.defangIPaddrV3(address);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1108_DefangIPTest_V4() {
		String address = "1.1.1.1";
		String expected = "1[.]1[.]1[.]1";
		String actual = LC1108_DefangIP.defangIPaddrV4(address);
		assertEquals(expected, actual);
	}
	
	@Test
	void LC1108_DefangIPTest_V4_Empty() {
		String address = "";
		String expected = "";
		String actual = LC1108_DefangIP.defangIPaddrV4(address);
		assertEquals(expected, actual);
	}

}
