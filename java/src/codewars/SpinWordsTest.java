package codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpinWordsTest {

	@Test
	public void test() {
		assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
	    assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
	    }

}
