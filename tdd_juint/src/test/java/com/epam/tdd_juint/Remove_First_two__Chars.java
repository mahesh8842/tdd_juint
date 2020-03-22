package com.epam.tdd_juint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove_First_two__Chars {
	
   	/* remove the char A if it is present in the first two characters of given string
	 * TODO list for the task
	 *1."ABCD"=>"BCD" -success
	 *2."AACD"=>"CD"  -success
	 *3."BACD"=>"BCD" -success 
	 *4."BBAA"=>"BBAA"  -success
	 *5."AABAAA"=>"BAAA"  -success
	 */
	ReplaceFirstTwo replaceFirstTwo;
	@BeforeEach
	void start() {
		replaceFirstTwo=new ReplaceFirstTwo();
	}
	
	@Test
	void test1Char() {
		assertEquals("BCD",replaceFirstTwo.replace("ABCD"));
		
	}

	@Test
	void test2Char() {
		
		assertEquals("CD",replaceFirstTwo.replace("AACD"));
		
	}@Test
	void test2ndChar() {
		assertEquals("BCD",replaceFirstTwo.replace("BACD"));
		
	}@Test
	void test0Char() {
		assertEquals("BBAA",replaceFirstTwo.replace("BBAA"));
		
	}
	@Test
	void testnChar() {
		assertEquals("BAAA",replaceFirstTwo.replace("AABAAA"));
		
	}
}
