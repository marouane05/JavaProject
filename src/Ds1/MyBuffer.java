/***** ZAIL ISHAK *****/

package Ds1;
import java.util.*;
public class MyBuffer {
	
	int size;
	MyBuffer(int size)
	{
		this.size = size ;
	}
	LinkedList<String> data = new LinkedList<String>();
	
	
	public void addWord(String word)
	{
		data.add(word);
	}
	public String getWord()
	{
		return data.getLast();
		
	}

}
