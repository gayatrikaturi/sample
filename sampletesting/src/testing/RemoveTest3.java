package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveTest3 {

	@Test
	public void test() {
		sample st=new sample();
		String x=st.remove("BACD");
		assertEquals("BCD",x);
	}

}
