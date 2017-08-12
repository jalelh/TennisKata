package kata.tennis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisTest {
	
	private static final String joueur1 = "Rafael Nadal";
	private static final String joueur2 = "Roger Federer";
	
	Tennis match = new Tennis(joueur1, joueur2);

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
	
	@Test
	public void retourneDeuceSiTroisPointsPartout() {
		pointsDesJoueurs(3, 3);
		assertEquals(match.retourneScore(), "Deuce");		
	}
	
	@Test
	public void retourneDeuceSiEgaliteEtAuMoinsTroisPointsPartout() {
		pointsDesJoueurs(4, 4);
		assertEquals(match.retourneScore(), "Deuce");		
	}
	
	@Test
	public void retourneAdvantagePremierJoueur(){
		pointsDesJoueurs(7, 6);
		assertEquals(match.retourneScore(), "Advantage "+ joueur1);
	}
	
	@Test
	public void retourneAdvantageDeuxiemeJoueur(){
		pointsDesJoueurs(5, 6);
		assertEquals(match.retourneScore(), "Advantage "+ joueur2);
	}
	
	@Test
	public void retournePremierJoueurGagne()
	{
		pointsDesJoueurs(4, 2);
		assertEquals(match.retourneScore(), joueur1 + " Wins");
	}
	
	@Test
	public void retourneDeuxiemeJoueurGagne()
	{
		pointsDesJoueurs(0, 4);
		assertEquals(match.retourneScore(), joueur2 + " Wins");
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
