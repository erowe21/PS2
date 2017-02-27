package pkgTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgNumber.MyInteger;




public class TestInteger {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void test() {
		MyInteger myInt = new MyInteger(12);
		boolean expectedEven = true;
		boolean expectedOdd = false;
		boolean expectedPrime = false;
		boolean a = MyInteger.isEven(12);
		boolean b = MyInteger.isOdd(12);
		boolean c = MyInteger.isPrime(12);
		
		assertEquals(myInt.isEven(),expectedEven);
		assertEquals(myInt.isOdd(),expectedOdd);
		assertEquals(myInt.isPrime(),expectedPrime);
		assertEquals(a,expectedEven);
		assertEquals(b,expectedOdd);
		assertEquals(c,expectedPrime);
		
		MyInteger myInt2 = new MyInteger(21);
		boolean expectedEven2 = false;
		boolean expectedOdd2 = true;
		boolean expectedPrime2 = true;
		boolean a2 = MyInteger.isEven(21);
		boolean b2 = MyInteger.isOdd(21);
		boolean c2 = MyInteger.isPrime(21);
		
		assertEquals(myInt2.isEven(),expectedEven2);
		assertEquals(myInt2.isOdd(),expectedOdd2);
		assertEquals(myInt2.isPrime(),expectedPrime2);
		assertEquals(a2,expectedEven2);
		assertEquals(b2,expectedOdd2);
		assertEquals(c2,expectedPrime2);
		
		
		
		
	}

}