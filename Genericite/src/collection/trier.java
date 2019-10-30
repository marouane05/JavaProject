package collection;

import java.util.ArrayList;

public class trier implements Comparable{
	
	
	
	public static void main(String[] args) {
ArrayList <String> maListe= new ArrayList<String>() ;

    maListe.add("fore");
    maListe.add("pablo");
	maListe.add("all");
    maListe.add("beal");
    
    
   
    for(int i=0; i< maListe.size() ;i++ ) {
    	System.out.println(" "+maListe.get(i));
    	//maListe.get(i).compareTo(maListe);
    }

	
}

	@Override
	public int compareTo(Object o) {
		
		
		
		
		return 0;
	}
}