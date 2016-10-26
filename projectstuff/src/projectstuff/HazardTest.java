package projectstuff;

import static org.junit.Assert.*;

import org.junit.Test;

public class HazardTest {
	@Test
	public void test() {
		Hazard h = new Hazard();
		assertSame(h.getxpos(),5);
		h.moveLeft();
		assertFalse(h.getxpos()==5);
		h.increasexvel(5);
		assertSame(h.getxvel(),20);
	}

}
