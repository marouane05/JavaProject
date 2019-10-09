package hashmap;
import java.util.*;
public class testHashmap {

	public static void main(String[] args) {
		

		Map <Integer,String> map = new HashMap <Integer , String >();
		map.put(1,"un");
		map.put(2,"deux");
		map.put(3,"trois");
		map.put(4,"quatre");
		
Set<Integer> setInt = map.keySet();
Iterator<Integer> it=setInt.iterator();
System.out.println("Parcours d une map avec Keyser: ");
while(it.hasNext()) {
	
	int key = it.next();
	System.out.println("Vleur pour la cle " + key +"="+map.get(key));
}
	}

}
