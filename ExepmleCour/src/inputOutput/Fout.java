package inputOutput;
import java.io.*;
public class Fout {

	public static void main(String[] args) {
		 try{    
             FileOutputStream fout=new FileOutputStream("FileOut.txt");    
             String s="Test is success";    
             byte b[]=s.getBytes();
             fout.write(b);    
             fout.close();    
             System.out.println("success.");    
            }catch(Exception e){System.out.println(e);}    
	}

}
