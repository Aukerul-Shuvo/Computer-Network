package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.print("Waiting for clients...\n");
			ServerSocket ss = new ServerSocket(9806);
			Socket soc = ss.accept();
			System.out.print("Connected...");
			
			PrintStream ps 
            = new PrintStream(soc.getOutputStream()); 
  
        
        BufferedReader br 
            = new BufferedReader( 
                new InputStreamReader( 
                    soc.getInputStream())); 
  
       
        BufferedReader kb 
            = new BufferedReader( 
                new InputStreamReader(System.in));
        while (true) { 
        	  
            String str, str1; 
  
           
            while ((str = br.readLine()) != null) { 
                System.out.println(str); 
                str1 = kb.readLine(); 
  
                 
                ps.println(str1); 
            }
            ps.close(); 
            br.close(); 
            kb.close(); 
            ss.close(); 
            soc.close(); 
  
            
            System.exit(0); 
        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
