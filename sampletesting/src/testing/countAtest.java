package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countAtest {

	@Test
	public void test() {
		sample st=new sample();
		int x=st.countA("Alphabet");
		assertEquals(2,x);
	}

}
