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
	
	@Test
	public void retourneFifteenLoveSiPremierJoueurMarque()
	{
		Tennis match = new Tennis("Rafael Nadal", "Roger Federer");
		match.premierJoueurMarquePoint();
		assertEquals(match.retourneScore(), "Fifteen-Love");		
	}
	
	@Test
	public void retourneFifteenAllSiUnPointPartout(){
		Tennis match = new Tennis("Rafael Nadal", "Roger Federer");
		match.premierJoueurMarquePoint();
		match.deuxiemeJoueurMarquePoint();
		assertEquals(match.retourneScore(), "Fifteen all");
	}
	
	@Test
	public void retourneLoveThirtySiDeuxiemeJoueurGagneDeuxPremiersPoints(){
		Tennis match = new Tennis("Rafael Nadal", "Roger Federer");
		match.deuxiemeJoueurMarquePoint();
		match.deuxiemeJoueurMarquePoint();
		assertEquals(match.retourneScore(), "Love-Thirty");
	}
	
	

}
