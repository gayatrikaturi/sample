package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveTest4 {

	@Test
	public void test() {
		sample st=new sample();
		String x=st.remove("BBAA");
		assertEquals("BBAA",x);
	}

}
