package pack1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class junit_test {

	@BeforeAll // 어노테이션 최초 한번만 수행
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterAll // 마지막 한번 수행
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@BeforeEach // 테스트 전에 실행
	void setUp() throws Exception {
		System.out.println("@Before");
	}

	@AfterEach // 테스트 후에 실행
	void tearDown() throws Exception {
		System.out.println("@After");
	}

	@Test // 매 테스트마다 실행
	void test1() {
		System.out.println("@TestCase1");
	}
	
	@Test // 매 테스트마다 실행
	void test2() {
		System.out.println("@TestCase2");
	}
	

}
