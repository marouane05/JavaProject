package inputOutput;
import  java.io.*;
public class FisFos {

	
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		
		File f = new File("fichier.txt");
		
		try {
		 fis = new FileInputStream(f);
		
		byte buf[]= new byte[1];
		int n ;
		while((n = fis.read(buf))>=0)
		{
			
			System.out.print((char)buf[0]);
		}
		 		
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
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
