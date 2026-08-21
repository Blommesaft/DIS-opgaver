package Skeleton2026;
import java.net.*;
import java.io.*;
public class ServerThread extends Thread{
	Socket connSocket;
	
	public ServerThread(Socket connSocket) {
		this.connSocket = connSocket;
	}

	public void run() {
		try {
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connSocket.getOutputStream());
			
			// Do the work and the communication with the client here	
			// The following two lines are only an example
			String clientSentence = inFromClient.readLine();
			outToClient.writeBytes("ecco " + clientSentence + '\n' );
		
		} catch (IOException e) {
			e.printStackTrace();
		}		
		// do the work here
	}
}
