
import java.io.*;
import java.net.*;

public class Serveur {

	public static void main(String[] args) {
		
		ServerSocket sSoc = null; 
		Socket soc = null;
		
		try {
			sSoc = new ServerSocket(4040);
			soc = sSoc.accept();
			System.out.println("Un client s'est connect�");
			sSoc.close();
			soc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
