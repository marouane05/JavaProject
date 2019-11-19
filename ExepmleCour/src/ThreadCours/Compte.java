package ThreadCours;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Compte extends Thread{

	int valeur ;

	Compte(int val){
		
		valeur= val ;
		
	}
	
	public void run() {
		try {
			while(valeur <1000) {
				System.out.println("test");
			
			valeur++ ;
			}
			
			
			
			
		}catch(InterruptedException e) {
			return ;
		}
	}
	
	
	public static void main(String[] args)
	{
		//Compte c= new Compte(1);
		//c.start();
		// new Compte(2000).start();
	 
	    
	}
	
}
