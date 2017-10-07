import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class cuberootTest {
	cuberoot obj;
	int a;

	@Before
	public void setUp() throws Exception {
		obj = new cuberoot();
		a=6;
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		a= 0;
	}

	@Test
	public void testCube() {
		assertEquals(216,obj.cube(a));
	}

}
