package kata.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisTest {
	
	Tennis match = new Tennis("Rafael Nadal", "Roger Federer");

	@Test
	public void retourneLoveAllSiNouveauMatch(){	
		assertEquals(match.retourneScore(), "Love all");	
	}
	
	@Test
	public void retourneFifteenLoveSiPremierJoueurMarque(){
		match.premierJoueurMarquePoint();
		assertEquals(match.retourneScore(), "Fifteen-Love");		
	}
	
	@Test
	public void retourneFifteenAllSiUnPointPartout(){
		match.premierJoueurMarquePoint();
		match.deuxiemeJoueurMarquePoint();
		assertEquals(match.retourneScore(), "Fifteen all");
	}
	
	@Test
	public void retourneLoveThirtySiDeuxiemeJoueurGagneDeuxPremiersPoints(){
		pointsDesJoueurs(0, 2);
		assertEquals(match.retourneScore(), "Love-Thirty");
	}
	
	@Test
	public void retourneThirtyAllSiDeuxPointPartout(){
		pointsDesJoueurs(2, 2);
		assertEquals(match.retourneScore(), "Thirty all");
	}
	
	@Test
	public void retourneFortyLoveSiPremierJoueurGagneTroisPremiersPoints(){
		pointsDesJoueurs(3, 0);
		assertEquals(match.retourneScore(), "Forty-Love");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testtempScorePasseExeption(){
		pointsDesJoueurs(4, -1);
		match.retourneScore();
	}
	
	@Test
	public void retourneDeuceSiTroisPointsPartout() {
		pointsDesJoueurs(3, 3);
		assertEquals(match.retourneScore(), "Deuce");		
	}
	
	
	
	
	private void pointsDesJoueurs(int pointsPremierJoueur, int pointsDeuxiemeJoueur) {
		for (int i = 0; i < pointsPremierJoueur; i++) {
			match.premierJoueurMarquePoint();
		}
		for (int i = 0; i < pointsDeuxiemeJoueur; i++) {
			match.deuxiemeJoueurMarquePoint();
		}
	}
	
	

}
