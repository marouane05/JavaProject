package inputOutput;
import  java.io.*;
public class FisFos {

	
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		File g = new File("FileOut.txt");
		File f = new File("fichier.txt");
		
		try {
		 fis = new FileInputStream(f);
		 fos = new FileOutputStream(g);
		  
		byte buf[]= new byte[1];
		int n ;
		long t=System.currentTimeMillis();
		while((n = fis.read(buf))>=0)
		{
			for(int i =0;i<n;i++)
			fos.write(buf[i]);
			
		}
		 		System.out.print("Time : " + t+ "ms");
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		
		
		
		           
		
	}
		
	

}
