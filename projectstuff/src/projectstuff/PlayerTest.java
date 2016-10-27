package projectstuff;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void test() {
		Player aplayer = new Player(0, 0, 0, 0, 2, 0, 0, "trash", "neutral");
	     aplayer.LoseLife();
		assertTrue(aplayer.getLife()==0);
		aplayer.setLife(3);
		aplayer.LoseLife();
		assertTrue(aplayer.getLife()==2);
		
		aplayer.Invincibility();
		assertTrue(aplayer.getState().equals("invincible"));
		
		aplayer.SpeedUp();
		assertTrue(aplayer.getState().equals("speedup"));
		
		aplayer.FlipSalinity();
		assertTrue(aplayer.getSalinity() == -2 );
		
		
		aplayer.SwitchTool();
		assertTrue(aplayer.getTool().equals("recycle"));
		aplayer.SwitchTool();
		assertTrue(aplayer.getTool().equals("compost"));
		aplayer.SwitchTool();
		assertTrue(aplayer.getTool().equals("trash"));
		
		
		

		
	}
}
