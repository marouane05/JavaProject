package GestionEleves;

import java.util.ArrayList;
import java.util.Scanner;
import TP1.exe1;

public class Eleve {

	String nom ;
	static ArrayList <Integer> list = new ArrayList <Integer>();
	static double moyenne ;
	

	public Eleve(String nom) 
	{
	
		this.nom = nom ;			
	}

	public static double getMoyenne() 
	{
	
		return moyenne;
	}

	public void ajouterNote(int note)
	{
		list.add(note);
		
	}

	public String getNom() 
	{
		return nom;
	}
	public ArrayList<Integer> getListNotes()
	{
		
		return null;
		 
	}
	public String toString()
	{
		return "le nom  " + nom + " les notes :  " + getListNotes() + " la moyenne : " + moyenne;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Eleve eleve1 = new Eleve("Ishak");
		
		System.out.print(eleve1.toString());
		
		
		int i=1 ;
		int compt=1 ;
		
		
		while (i!=0) {
			int nb ; 
			System.out.println("entrer la note "+compt+": ") ;
			nb= sc.nextInt() ;
			eleve1.ajouterNote(nb);
	
			i= sc.nextInt() ;
		if (i == 0)
		{
			System.out.print("le programme sera arrete ");
		}
			
		
		//
		compt ++ ;
		}
		
		moyenne= 0 ;
	    for(int index=0 ; index < list.size() ; index++) {
			moyenne += list.get(index) ;
		    moyenne= (double)moyenne/(index+1) ;
			
		}
		System.out.println(" "+getMoyenne());
	}
	
}
