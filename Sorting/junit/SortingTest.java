import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortingTest {
	private static Sorting sort = new Sorting();
	public static int[] a = {3,7,10,11,2,1};
	public static int[] b = {3,7,10,11,2,1,4,16,32,111,23,33,17,71,34};
	public static int[] c = {3,7,10,11,2,1};
	public static int[] d = {3,7,10,11,2,1,4,16,32,111,23,33,17,71,34};
	public static Object[] e = {3,7};
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInsertionSort() {
		sort.insertionSort(a);
		assertEquals(true,sort.isSorted(a));
		sort.insertionSort(b);
		assertEquals(true,sort.isSorted(b));
	}

	@Test
	public void testQuicksort() {
		Sorting.quicksort(c);
		assertEquals(true,sort.isSorted(c));
		Sorting.quicksort(d);
		assertEquals(true,sort.isSorted(d));
	}
	@Test
	public void testSwapReferences() {
		Object[] f = {7,3};
		sort.swapReferences(e, 0, 1);
		assertEquals(f,e);
	}

}