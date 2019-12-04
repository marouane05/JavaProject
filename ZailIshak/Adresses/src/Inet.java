import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Inet {

	public static void main(String[] args) {
		try
		{
			
			
			Scanner c = new Scanner(System.in);
			
			String hote  ="";
			
			System.out.println("Donnez une adresse :");
			hote = c.nextLine();
			InetAddress address = InetAddress.getByName(hote);
			System.out.println("Address ip : "+ address.getHostAddress());
			
			
//			System.out.println("Nom :" + address.getHostName());
//			System.out.println("adresse :" + address.getHostAddress());
//			System.out.println("Nom canonique :" + address.getCanonicalHostName());
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
