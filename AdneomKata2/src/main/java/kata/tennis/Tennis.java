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
		
		if (existeGagnant()) {
			return nomJoueurAyantMeilleurScore() + " Wins";
		}else if (existeAvantage()) {
			return "Advantage " + nomJoueurAyantMeilleurScore();
		}else 
			if(scorePremierJoueur == scoreDeuxiemeJoueur) {
				if (scoreDeuce()) {
					return "Deuce";
				}
			return descriptionDeScore(scorePremierJoueur) + " all";
		}else {
			return descriptionDeScore(scorePremierJoueur) + "-" + descriptionDeScore(scoreDeuxiemeJoueur);
		}
	}
	
	private boolean deuxiemeJoueuraGagne() {
		return scoreDeuxiemeJoueur >= 4 && scoreDeuxiemeJoueur >= scorePremierJoueur+2;
	}

	private boolean premierJoueuraGagne() {
		return scorePremierJoueur >= 4 && scorePremierJoueur >= scoreDeuxiemeJoueur+2;
	}

	private boolean scoreDeuce() {
		return scorePremierJoueur >= 3;
	}

	private boolean avantageDeuxiemeJoueur() {
		return scoreDeuxiemeJoueur >= 4 && scoreDeuxiemeJoueur >= scorePremierJoueur+1;
	}

	private boolean avantagePremierJoueur() {
		return scorePremierJoueur >= 4 && scorePremierJoueur >= scoreDeuxiemeJoueur+1;
	}
	
	private boolean existeGagnant() {
		if (premierJoueuraGagne() || deuxiemeJoueuraGagne()) {
			return true;
		}
		
		return false;
	}
	
	private boolean existeAvantage() {
		if (avantagePremierJoueur() || avantageDeuxiemeJoueur()) {
			return true;
		}
		
		return false;
	}
	
	private String nomJoueurAyantMeilleurScore() {
		if (scorePremierJoueur > scoreDeuxiemeJoueur) {
			return nomPremierJoueur;
		} else {
			return nomDeuxiemeJoueur;
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
