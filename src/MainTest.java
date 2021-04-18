import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void teststr() {
		String temp = "shri";
		Cat obj = new Cat();
		obj.setStr(temp);
		assertEquals(obj.getStr(), temp);
	}

}
