package ch.bbw.pr.craps;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CrapsTest {
	
	Craps testee;

	@Test
	public void testPlayDiceFirstRoundReturnsSum7ReturnsTrue() {
		Dice dice = mock(Dice.class);
		when(dice.roll()).thenReturn(3).thenReturn(4);
	
		testee = new Craps(dice);
		assertTrue(testee.play() == true);
	}
}
