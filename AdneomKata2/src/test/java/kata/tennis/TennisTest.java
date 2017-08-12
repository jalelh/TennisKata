package kata.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisTest {

	@Test
	public void retourneLoveAllSiNouveauMatch()
	{	
		Tennis match = new Tennis("Rafael Nadal", "Roger Federer");
		assertEquals(match.retourneScore(), "Love all");
		
	}

}
