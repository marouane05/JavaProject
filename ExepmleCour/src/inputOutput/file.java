package inputOutput;

import java.io.*;

public class file {

	
	public static void main(String[] args) {
	
		File f = new File("C:\\");
		int n=0;
		f.listFiles();
		for(File e : f.listFiles())
		{
			if(e.isDirectory()) {
				System.out.printf("%d - %20s \t",n+1,e.getName());
				n++;
				if ((n%4)==0) System.out.println();
			}
		
		}   
	}

}
