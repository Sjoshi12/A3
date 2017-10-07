import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class squareTest {
	square obj;
	int a;

	@Before
	public void setUp() throws Exception {
		obj =new square();
		a=5;
	}
	

	@After
	public void tearDown() throws Exception {
		obj=null;
		a=0;
	}

	@Test
	public void testSqaure() {
		assertEquals(25,obj.sqaure(a));
		
	}

}
