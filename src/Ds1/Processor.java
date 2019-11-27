/***** ZAIL ISHAK *****/
package Ds1;
import java.io.*;
import java.util.*;
public class Processor extends Thread{

	String Pname ;
	MyBuffer buff ;
	
		public Processor(String PName, MyBuffer buff)
		{
			this.Pname = PName;
			this.buff = buff ;
		}
		
		HashMap<String,Integer> wordsCounts = new HashMap<>();
		
		public void processe()
		{
			ListIterator<String> it = buff.data.listIterator();
			while(it.hasNext()) {
				it.remove();
				wordsCounts.put(buff.getWord(),it.nextIndex());
			
			}
				
			
				}
		int n = 0 ;
		public void run()
		{
			
			
			try {
				while(wordsCounts.size()>0)
				{
					buff.data.remove();
				}
				}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
}
