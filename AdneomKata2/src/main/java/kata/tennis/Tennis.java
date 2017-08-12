package kata.tennis;

public class Tennis {
	
	private String nomPremierJoueur;
	private String nomDeuxiemeJoueur;
	private int scorePremierJoueur = 0;
	
	public Tennis(String nomPremierJoueur, String nomDeuxiemeJoueur) {
		this.nomPremierJoueur = nomPremierJoueur;
		this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
	}
	
	public String retourneScore() {
		
		if(scorePremierJoueur==1) {
			return "Fifteen-Love";
		}
		return "Love all";
	}
	
	public void premierJoueurMarquePoint() {
		scorePremierJoueur++;
	}


}
