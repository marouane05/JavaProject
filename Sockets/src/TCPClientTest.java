import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class TCPClientTest {
	public static void main(String[] args) throws IOException {
		Socket clientSocket = null;
		String serverHosteName = "localhost";
		int port = 1234;
		for(int i =0 ; i<100;i++) {
		try {
			clientSocket = new Socket(serverHosteName,port);
		}catch(IOException ex) {
			System.out.println("Impossible");
		}
		long t=System.currentTimeMillis()
;
		PrintStream printStream = new PrintStream(clientSocket.getOutputStream());
		InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
		BufferedReader bufferReader = new BufferedReader(inputStream);
		String message = "Bonjour !!\n";
		
		t=System.currentTimeMillis();
		printStream.print(message);
		printStream.flush();
		
		message = bufferReader.readLine();
		
		System.out.println("Serveur : " + (System.currentTimeMillis()));
		}
	}

}
