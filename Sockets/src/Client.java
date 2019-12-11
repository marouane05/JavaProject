import java.net.*;
import java.io.*;
public class Client {

	public static void main(String[] args) {
		Socket soc= null;
		
		try {
			soc = new Socket("192.168.1.3",1234);
			PrintStream printStream = new PrintStream(soc.getOutputStream());
			String message = "Binome 22 \n\n";
			printStream.print(message);
			soc.close();
			
		 
		}catch(IOException e) {
			System.out.println("Cnct");
			
		}

	}

}

/*  Excercice Vecteur Client/serveur + thread + temps ecoulé entre chaque operation + TCPClientTest +  */