package eserver;

import java.net.Socket;

public class eclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.print("Client started");
			Socket soc = new Socket("localhost",9806);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
