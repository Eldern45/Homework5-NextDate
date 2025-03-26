package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNDv21() throws Throwable {
	    NDv2 NDv20 = new NDv2(10, 10, 10);
	    String string0 = NDv20.run(10, 31, 1970);
	    assertEquals("11/1/1970", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv20() throws Throwable {
	    NDv2 NDv20 = new NDv2(12, 12, 12);
	    String string0 = NDv20.run(12, 1839, 1839);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv23() throws Throwable {
	    NDv2 NDv20 = new NDv2(4, 4, 4);
	    String string0 = NDv20.run(4, 31, 1970);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv22() throws Throwable {
	    NDv2 NDv20 = new NDv2(12, 12, 12);
	    String string0 = NDv20.run(5, 12, 1906);
	    assertEquals("5/13/1906", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv25() throws Throwable {
	    NDv2 NDv20 = new NDv2(6, 6, 6);
	    String string0 = NDv20.run(6, 30, 1899);
	    assertEquals("7/1/1899", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv24() throws Throwable {
	    NDv2 NDv20 = new NDv2(11, 11, 11);
	    String string0 = NDv20.run(11, 11, 1880);
	    assertEquals("11/12/1880", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NDv2 NDv20 = new NDv2(2, 2, 2);
	    String string0 = NDv20.run(2, 31, 1901);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NDv2 NDv20 = new NDv2((-112), (-112), (-112));
	    String string0 = NDv20.run((-112), (-112), (-112));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NDv2 NDv20 = new NDv2(12, 12, 12);
	    String string0 = NDv20.run((-441), 12, (-441));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NDv2 NDv20 = new NDv2(12, 12, 12);
	    String string0 = NDv20.run(12, 12, 12);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv214() throws Throwable {
	    NDv2 NDv20 = new NDv2(9, 9, 9);
	    String string0 = NDv20.run(9, 31, 1915);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NDv2 NDv20 = new NDv2(290, 290, 290);
	    String string0 = NDv20.run(290, 290, 290);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv213() throws Throwable {
	    NDv2 NDv20 = new NDv2(8, 8, 8);
	    String string0 = NDv20.run(8, 8, 1826);
	    assertEquals("8/9/1826", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NDv2 NDv20 = new NDv2(1, 1, 1);
	    String string0 = NDv20.run(1, 1, 2022);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv27() throws Throwable {
	    NDv2 NDv20 = new NDv2(7, 7, 7);
	    String string0 = NDv20.run(7, 31, 1930);
	    assertEquals("7/31/1930", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv26() throws Throwable {
	    NDv2 NDv20 = new NDv2(12, 12, 12);
	    String string0 = NDv20.run(12, 12, 1839);
	    assertEquals("12/13/1839", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv29() throws Throwable {
	    NDv2 NDv20 = new NDv2(2, 2, 2);
	    String string0 = NDv20.run(2, 28, 1879);
	    assertEquals("3/1/1879", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv28() throws Throwable {
	    NDv2 NDv20 = new NDv2(2, 2, 2);
	    String string0 = NDv20.run(2, 2, 1819);
	    assertEquals("2/3/1819", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv210() throws Throwable {
	    NDv2 NDv20 = new NDv2(2, 2, 2);
	    String string0 = NDv20.run(2, 29, 1899);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv212() throws Throwable {
	    NDv2 NDv20 = new NDv2(3, 3, 3);
	    String string0 = NDv20.run(3, 3, 1826);
	    assertEquals("3/4/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv211() throws Throwable {
	    NDv2 NDv20 = new NDv2(1, 1, 1);
	    String string0 = NDv20.run(1, 1, 2020);
	    assertEquals("1/2/2020", string0);
	}

}