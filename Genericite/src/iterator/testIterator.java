package iterator;
import java.util.ArrayList ;
import java.util.Iterator ;
public class testIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> list= new ArrayList<String>();

list.add("1");
list.add("2");
list.add("3");
list.add("4");
list.add("5");

Iterator it = list.iterator();
while(it.hasNext()) {
	
	String str=(String)it.next() ;
	if(str.equals("4")|| str.equals("2")) it.remove();
	}

	
for(int i=0; i< list.size(); i++) {
	System.out.println(""+list.get(i));
	
}

}
}
