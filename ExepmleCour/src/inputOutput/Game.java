package inputOutput;

import java.io.Serializable;



public class Game implements Serializable {

	private String nom , style ;
	private double prix ;
	
	public Game(String nom , String style , Double prix) {
		
		
		this.nom= nom ;
		this.style=style ;
		this.prix=prix ;
		
	}
	
	public String toString() {
		
		return "nom du jeu"+ this.nom +"\n style de jeux: "+this.style+"\n prix de jeux: "+this.prix ; 
	}
	
	
	
	
	
}
