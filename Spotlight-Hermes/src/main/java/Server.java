import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	
	
	public void send() {
		
	}
	
	
	public void ask() {
		
	}
	
	
	public void ask(int depth) {
		
	}
	// That works for the communication between client and sever
	public static void main(String[]args) {
		try {
			    ServerSocket serverSocket = new ServerSocket(5555);
			    Socket clientSocket = serverSocket.accept();
			    PrintWriter out =
			        new PrintWriter(clientSocket.getOutputStream(), true);
			    BufferedReader in = new BufferedReader(
			        new InputStreamReader(clientSocket.getInputStream()));
			    // ...
			    PrintWriter pw =
			        new PrintWriter(clientSocket.getOutputStream(), true);
			    BufferedReader br = new BufferedReader(
			        new InputStreamReader(clientSocket.getInputStream()));

			    String inputLine;
			            
			    // Initiate conversation with client
			    while ((inputLine = br.readLine()) != null) {
			        out.println("helloo");
			        out.println("helloo2");
			        System.out.println(inputLine);
			    }
			    clientSocket.close();
			    serverSocket.close();
	}
	    catch(Exception e) {
	    	
	    }
	}	
}
