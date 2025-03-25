package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNDv128() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(7, 7, 7);
	    String string0 = nDv12_0.run(7, 7, 1805);
	    assertEquals("7/7/1805", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv129() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 2, 2);
	    String string0 = nDv12_0.run(2, 2, 1826);
	    assertEquals("2/3/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv126() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(12, 12, 12);
	    String string0 = nDv12_0.run(12, 12, 1812);
	    assertEquals("12/13/1812", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv127() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 31, 31);
	    String string0 = nDv12_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv124() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(11, 30, 30);
	    String string0 = nDv12_0.run(11, 30, 1840);
	    assertEquals("12/1/1840", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv125() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 29, 29);
	    String string0 = nDv12_0.run(2, 29, 1826);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 2, 2);
	    String string0 = nDv12_0.run(12, 31, 1991);
	    assertEquals("1/1/1992", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv122() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(5, 5, 5);
	    String string0 = nDv12_0.run(5, 5, 1826);
	    assertEquals("5/6/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1215() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(4, 4, 4);
	    String string0 = nDv12_0.run(4, 4, 1805);
	    assertEquals("4/5/1805", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv123() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(6, 31, 6);
	    String string0 = nDv12_0.run(6, 31, 1844);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1216() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(9, 9, 9);
	    String string0 = nDv12_0.run(9, 9, 1838);
	    assertEquals("9/10/1838", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NDv12 nDv12_0 = new NDv12((-2867), (-2867), (-2867));
	    String string0 = nDv12_0.run((-2867), (-2867), (-2867));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv120() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(8, 8, 8);
	    String string0 = nDv12_0.run(8, 1876, 1876);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv121() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 2, 2);
	    String string0 = nDv12_0.run(1, 31, 1991);
	    assertEquals("2/1/1991", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(0, 0, 0);
	    String string0 = nDv12_0.run(0, 6, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(12, 12, 12);
	    String string0 = nDv12_0.run(12, 12, 12);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2021, 2021, 2021);
	    String string0 = nDv12_0.run(2021, 2021, 2021);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(12, 12, 12);
	    String string0 = nDv12_0.run(12, 2193, 2193);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1210() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 28, 28);
	    String string0 = nDv12_0.run(2, 28, 1826);
	    assertEquals("3/1/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1211() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 30, 30);
	    String string0 = nDv12_0.run(2, 30, 1826);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1212() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(3, 3, 3);
	    String string0 = nDv12_0.run(3, 3, 1840);
	    assertEquals("3/4/1840", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1213() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(8, 8, 8);
	    String string0 = nDv12_0.run(8, 8, 1845);
	    assertEquals("8/9/1845", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1214() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(10, 10, 10);
	    String string0 = nDv12_0.run(10, 10, 1826);
	    assertEquals("10/11/1826", string0);
	}

}