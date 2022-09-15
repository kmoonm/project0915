package pack1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculateTest {
	
	@Test
	void testSum() {
		double result;
		result = calculate.sum(6, 3);
		assertTrue("결과 : 9",(result==9));
	}

	@Test
	void testSubt() {
		double result;
		result = calculate.subt(9, 3);
		assertTrue("결과 : 6",(result==6));
	}

	@Test
	void testMulti() {
		double result;
		result = calculate.multi(7, 8);
		assertTrue("결과 : 56",(result==56));
	}

	@Test
	void testDivide() {
		double result;
		result = calculate.divide(10,5);
		assertTrue("결과 : 2", (result==2));
	}

}
