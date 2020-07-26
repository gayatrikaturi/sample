package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveTest5 {

	@Test
	public void test() {
		sample st=new sample();
		String x=st.remove("AABAA");
		assertEquals("BAA",x);
	}

}
