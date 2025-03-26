import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;

public class HeapGTv1 {

	@Test(timeout = 4000)
	public void testAddElem() throws Throwable {
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Heap heap0 = new Heap(linkedList0);
	    heap0.addElem(873);
	    heap0.addElem(873);
	    assertFalse(linkedList0.contains(873));
	}

	@Test(timeout = 4000)
	public void testCreatesHeap1() throws Throwable {
	    Integer integer0 = new Integer((-2637));
	    List<Integer> list0 = List.of(integer0, integer0, integer0, integer0);
	    Heap heap0 = new Heap(list0);
	}

	@Test(timeout = 4000)
	public void testRemoveLargestReturningNegative() throws Throwable {
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Heap heap0 = new Heap(linkedList0);
	    int int0 = heap0.removeLargest();
	    assertEquals((-1), int0);
	}

	@Test(timeout = 4000)
	public void testPrintAsTree() throws Throwable {
	    Integer integer0 = new Integer(30);
	    List<Integer> list0 = List.of(integer0, integer0, integer0, integer0);
	    Heap heap0 = new Heap(list0);
	    heap0.printAsTree();
	}

	@Test(timeout = 4000)
	public void testAddElemAndRemoveElem1() throws Throwable {
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Heap heap0 = new Heap(linkedList0);
	    heap0.addElem(817);
	    heap0.removeElem(1);
	    assertFalse(linkedList0.contains(1));
	}

	@Test(timeout = 4000)
	public void testAddElemAndRemoveElem0() throws Throwable {
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Heap heap0 = new Heap(linkedList0);
	    heap0.addElem(1172);
	    heap0.removeElem(1172);
	}

	@Test(timeout = 4000)
	public void testRemoveLargest() throws Throwable {
	    Integer integer0 = new Integer(1);
	    List<Integer> list0 = List.of(integer0, integer0, integer0, integer0, integer0);
	    Heap heap0 = new Heap(list0);
	    int int0 = heap0.removeLargest();
	    assertEquals(1, int0);
	}

	@Test(timeout = 4000)
	public void testRemoveElem1() throws Throwable {
	    Integer integer0 = new Integer((-32));
	    List<Integer> list0 = List.of(integer0, integer0, integer0, integer0, integer0);
	    Heap heap0 = new Heap(list0);
	    heap0.removeElem((-32));
	    assertTrue(list0.contains((-32)));
	}

	@Test(timeout = 4000)
	public void testRemoveElem0() throws Throwable {
	    Integer integer0 = new Integer((-1));
	    List<Integer> list0 = List.of(integer0, integer0, integer0, integer0, integer0);
	    Heap heap0 = new Heap(list0);
	    heap0.removeElem((-1));
	}

	@Test(timeout = 4000)
	public void testPrintAsList() throws Throwable {
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Heap heap0 = new Heap(linkedList0);
	    heap0.printAsList();
	}

	@Test(timeout = 4000)
	public void testAddElemWithNegative() throws Throwable {
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Heap heap0 = new Heap(linkedList0);
	    heap0.addElem((-3373));
	    heap0.addElem((-21));
	    assertFalse(linkedList0.contains((-21)));
	}

	@Test(timeout = 4000)
	public void testAddElemAndRemoveLargest() throws Throwable {
	    LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	    Heap heap0 = new Heap(linkedList0);
	    heap0.addElem(1547);
	    int int0 = heap0.removeLargest();
	    assertEquals(1547, int0);
	}

	@Test(timeout = 4000)
	public void testCreatesHeap0() throws Throwable {
	    Integer integer0 = new Integer((-12));
	    Integer integer1 = new Integer(1448);
	    List<Integer> list0 = List.of(integer1, integer0, integer0, integer1);
	    Heap heap0 = new Heap(list0);
	}

	@Test(timeout = 4000)
	public void testRemoveElemAndRemoveElemWithPositive() throws Throwable {
	    Integer integer0 = new Integer(1);
	    List<Integer> list0 = List.of(integer0, integer0, integer0, integer0, integer0);
	    Heap heap0 = new Heap(list0);
	    heap0.removeElem(1);
	}

}