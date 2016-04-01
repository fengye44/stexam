import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
    private static Triangle tri = new Triangle(3,4,5);
    private static Triangle tri1 = new Triangle(1,4,5);
    private static Triangle tri2= new Triangle(3,3,3);
    private static Triangle tri3 = new Triangle(3,3,5);
    private static Triangle tri4 = new Triangle(Long.MAX_VALUE+1,3,5);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsTriangle() {
		assertEquals(true,tri.isTriangle(tri));
		assertEquals(false,tri1.isTriangle(tri1));
		assertEquals(false,tri4.isTriangle(tri4));
	}

	@Test
	public void testGetType() {
		assertEquals("Illegal",tri1.getType(tri1));
		assertEquals("Regular",tri2.getType(tri2));
		assertEquals("Scalene",tri.getType(tri));
		assertEquals("Isosceles",tri3.getType(tri3));
		
	}

	@Test
	public void testGetBorders() {
		long[] l = new long[3];
		l[0] = 3;
		l[1] = 4;
		l[2] = 5;
		assertEquals(l,tri.getBorders());
	}

}
