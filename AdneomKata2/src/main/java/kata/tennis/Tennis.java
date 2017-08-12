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
		
		if((scorePremierJoueur==scoreDeuxiemeJoueur) && (scorePremierJoueur==1)) {
			return "Fifteen all";
		}else if((scorePremierJoueur==scoreDeuxiemeJoueur) && (scorePremierJoueur==2)) {
			return "Thirty all";
		}else if(scorePremierJoueur==1 && scoreDeuxiemeJoueur==0) {
			return "Fifteen-Love";
		}else if((scorePremierJoueur==0) && (scoreDeuxiemeJoueur==2)) {
			return "Love-Thirty";
		}else if((scorePremierJoueur==3) && (scoreDeuxiemeJoueur==0)) {
			return "Forty-Love";
  		}
		return "Love all";
	}
	
	public void premierJoueurMarquePoint() {
		scorePremierJoueur++;
	}
	
	public void deuxiemeJoueurMarquePoint() {
		scoreDeuxiemeJoueur++;
	}


}
