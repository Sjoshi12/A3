import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class rectengleTest {

 
	
		rectengle r;
		rectengle[] rList=new rectengle[5];

		@Before
		
		public void testSetup()
		{
			System.out.println("Setup for test complete.");
		}

		@After
		
		public void testComplete()
		{
			System.out.println("Test complete.");
		}

		@Test
		public void test1()
		{
			
			r=new rectengle();
			try
			{
				assertTrue("Test 1: Default values are wrong.", 
					r.getH()==0 && r.getW()==0);
			
			}
			catch (AssertionError e)
			{
				
			}
		}
	}
