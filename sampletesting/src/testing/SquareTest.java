package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquareTest {

	@Before
	public void display()
	{
		System.out.println("Befor Annotation");
	}
	@Test
	public void test() {
		sample st=new sample();
		int x=st.square(5);
		assertEquals(25,x);
	}

}
