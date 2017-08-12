package kata.tennis;

public class Tennis {
	
	private String nomPremierJoueur;
	private String nomDeuxiemeJoueur;
	
	public Tennis(String nomPremierJoueur, String nomDeuxiemeJoueur) {
		this.nomPremierJoueur = nomPremierJoueur;
		this.nomDeuxiemeJoueur = nomDeuxiemeJoueur;
	}
	
	public String retourneScore() {
		return "Love all";
	}


}
