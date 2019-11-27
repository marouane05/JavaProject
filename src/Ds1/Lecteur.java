
/***** ZAIL ISHAK *****/

package Ds1;
import java.io.*;
import java.util.*;
public class Lecteur extends Thread{
	
	String theadName;
	String fileName;
	MyBuffer buff ;
	
	Lecteur(String theadName, String fileName, MyBuffer buff)
	{
		this.theadName = theadName;
		this.fileName = fileName ;
		this.buff = buff ;
	}
	
	public String readWord() throws FileNotFoundException  {
        File f = new File(this.fileName);
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String line = null;
        try
        {
        	 while ((line = bf.readLine())!=null){
                 String[] str = line.split("[ ;.,!?\"]");
                 while (!line.equals(str)){
                     System.out.println(line);
                 }
         }
        }catch(IOException e)
        {
        	e.printStackTrace();
        }
        return line;
    }
    	public void run(){
	        File f = new File(this.fileName);
	        BufferedInputStream bis = null;
	        try {
	            bis = new BufferedInputStream(new FileInputStream(f));
	            byte[] buf=  new  byte[8];
	            int n = 0;
	            while ((n=bis.read(buf))>=0){
	                for (int i=0;i<n;i++) {
	                     System.out.print((char) buf[i]);
	                     if (n<this.buff.data.size()){
	                         new Processor(fileName, buff);
	                     }else {
	                         this.buff.addWord(String.valueOf(((char) buf[i])));
	                     }
	                 }
	            }
	            
	        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
        	try {
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
        }
    }
}
