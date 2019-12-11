import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class TCPServerTest {

	public static void main(String args[]) {
		
	
		ServerSocket serverSocket = null ;
		int nbr = 0;
		try {
			int port = 1234;
			 serverSocket = new ServerSocket(port);
		
		System.out.println("Serveur OK port= "+port);
		}catch(IOException ex) {
			System.out.println("SERVEUR : Impossible de creer les serveur avec le port");
		}
		while(true)
		{
			Socket clientSocket = null ;
			
			try {
				clientSocket = serverSocket.accept();
				nbr++;
				System.out.println("Clients : "+ nbr);
				processClientRequest(clientSocket);
			}catch(IOException e)
			{
				System.out.println("Error : cannot accept client request. Exit program");
			}
		}
	
	}

	private static void processClientRequest(Socket clientSocket) {
		try {
			PrintStream printStream = new PrintStream(clientSocket.getOutputStream());
			InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			String message = null;
			message = bufferedReader.readLine();
			Thread.sleep(1000);
			String messageSend = "SERVER :" + message +"\n";
			printStream.println(messageSend);
			printStream.close();
		}catch(Exception e) {
			System.out.println("SERVEUR : probleme d'envoie du message");
		}
	}
}
