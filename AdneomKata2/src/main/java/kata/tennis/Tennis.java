package kata.tennis;

public class Tennis {
	
	private String nomPremierJoueur;
	private String nomDeuxiemeJoueur;
	private int scorePremierJoueur = 0;
	private int scoreDeuxiemeJoueur = 0;
	
	public Tennis(String nomPremierJoueur, String nomDeuxiemeJoueur) {
		this.nomPremierJoueur = nomPremierJoueur;
		this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
	}
	
	public String retourneScore() {
		
		if(scorePremierJoueur == scoreDeuxiemeJoueur) {
			if (scorePremierJoueur == 3) {
				return "Deuce";
			}
			return descriptionDeScore(scorePremierJoueur) + " all";
		}else {
			return descriptionDeScore(scorePremierJoueur) + "-" + descriptionDeScore(scoreDeuxiemeJoueur);
		}
	}
	
	public void premierJoueurMarquePoint() {
		scorePremierJoueur++;
	}
	
	public void deuxiemeJoueurMarquePoint() {
		scoreDeuxiemeJoueur++;
	}
	
	private String descriptionDeScore(int tempScore) {
		switch (tempScore) {
			case 0:
				return "Love";
			case 1: 
				return "Fifteen";
			case 2:
				return "Thirty";
			case 3:
				return "Forty";
			default : 
				throw new IllegalArgumentException("Score doit etre entre 0 et 3 : " + tempScore);
		}
		
	}


}
