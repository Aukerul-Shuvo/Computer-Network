package eserver;

import java.net.ServerSocket;
import java.net.Socket;

public class eserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.print("Waiting for clients...\n");
			ServerSocket ss = new ServerSocket(9806);
			Socket soc = ss.accept();
			System.out.print("Connected...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
