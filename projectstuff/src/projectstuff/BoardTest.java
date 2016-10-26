package projectstuff;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void test() {
		Board aboard = new Board();
		assertTrue(aboard.getTile(5, 0)==1);
		assertTrue(aboard.getTile(6, 20)==-1);
	}

}
