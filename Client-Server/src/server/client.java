package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.print("Client started");
			Socket soc = new Socket("localhost",9806);
			
			DataOutputStream dos 
            = new DataOutputStream( 
                soc.getOutputStream()); 
  
        // to read data coming from the server 
        BufferedReader br 
            = new BufferedReader( 
                new InputStreamReader( 
                    soc.getInputStream())); 
  
        // to read data from the keyboard 
        BufferedReader kb 
            = new BufferedReader( 
                new InputStreamReader(System.in)); 
        String str, str1; 
  
        // repeat as long as exit 
        // is not typed at client 
        while (!(str = kb.readLine()).equals("bye")) { 
        	  
            // send to the server 
            dos.writeBytes(str + "\n"); 
  
            // receive from the server 
            str1 = br.readLine(); 
  
            System.out.println(str1); 
        } 
     // close connection. 
        dos.close(); 
        br.close(); 
        kb.close(); 
        soc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
