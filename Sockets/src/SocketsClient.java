import java.io.*;
import java.net.*;

public class SocketsClient {

	public static void main(String[] args) {
		for(int i = 1; i <= 65536; i++){
	         try {
	             Socket soc = new Socket("127.0.0.1", i);
	             System.out.println("La machine autorise les connexions sur le port : " + i);
	         } catch (UnknownHostException e) {
	            e.printStackTrace();
	         }catch (IOException e ){}
	         
			
		}
	}

}
