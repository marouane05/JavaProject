package collection;
import collection.Comparable;

public class Cd implements Comparable{
	
	private String auteur , titre ;
	private double prix ;

	
	public Cd(String auteur , String titre , double prix)
	{
		this.auteur= auteur ;
		this.titre = titre;
		this.prix= prix;
	}
	
	public String toString() 
	{
		return " Cd [auteur = " + auteur + " , titre = " + titre + ", prix = " + prix + " ]";
	}

	public String getAuteur() 
	{
		return auteur;
	}

	

	public String getTitre() 
	{
		return titre;
	}

	

	public double getPrix() 
	{
		return prix;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
				Cd cd1= (Cd) o ;
				
		return (int) (prix - cd1.prix );
	}
	
	

	
	public static void main (String[] args) {
		
		
		Cd c1 = new Cd("author","book",10);
	
		Cd c2 = new Cd("author2","book2",20);
		
		System.out.println(" "+c1.compareTo(c2));
		
		
	
	}

	
	
	
	
	
}
