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
  
        
        BufferedReader br 
            = new BufferedReader( 
                new InputStreamReader( 
                    soc.getInputStream())); 
  
    
        BufferedReader kb 
            = new BufferedReader( 
                new InputStreamReader(System.in)); 
        String str, str1; 
  
       
        while (!(str = kb.readLine()).equals("bye")) { 
        	  
           
            dos.writeBytes(str + "\n"); 
  
           
            str1 = br.readLine(); 
  
            System.out.println(str1); 
        } 
  
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
