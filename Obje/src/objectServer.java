import java.net.*;
import java.util.Scanner;
import java.io.*;
class objectServer
 {
	static boolean getParity(int n) 
    { 
        boolean parity = false; 
        while(n!=0) 
        { 
            parity = !parity; 
            n = n & (n-1); 
        } 
        return parity; 
          
    } 
	
  public static void main(String arg[]) throws Exception
   {
	  int jjj=0,number=0;
	  ServerSocket server=new ServerSocket(1700);
	    Socket s=server.accept();
	    ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
	  while(jjj<10)
	  {  
	  int e=0;
	   int o=0;
	   int t=0;
	   
   
   // int number =0;
    int n = number;
    
    System.out.println("Parity of no " + n + " = " + 
                     (getParity(n)? "odd": "even"));
    if(!getParity(n))
    {	 e++;}
    
    else if (getParity(n)){ o++;}
    System.out.println("\n"+"Even="+e +" and Odd="+o);
    
	System.out.print("Enter course: ");
	
	//String myString = input.next();
	String myString = "B.Sc";
	String str = myString;
	
	   for(int i=0; i<str.length(); i++)
	   {
	     int asciiValue = str.charAt(i);
	     System.out.println(str.charAt(i) + "=" + asciiValue);
	     System.out.println("Parity of no " + asciiValue + " = " + 
	             (getParity(asciiValue)? "odd": "even"));
	     if(!getParity(asciiValue))
	     {	 e++;}
	     
	     else if (getParity(asciiValue)){ o++;}
	     System.out.println("\n"+"Even="+e +" and Odd="+o);
	   }
	System.out.print("Enter institution: ");
	//String myString2 = input.next();
	String myString2 = "RUET";
	 String str1 = myString2;
	   for(int i=0; i<str1.length(); i++)
	   {
	     int asciiValue = str1.charAt(i);
	     System.out.println(str1.charAt(i) + "=" + asciiValue);
	     System.out.println("Parity of no " + asciiValue + " = " + 
	             (getParity(asciiValue)? "odd": "even"));
	     if(!getParity(asciiValue))
	     {	 e++;}
	     
	     else if (getParity(asciiValue)){ o++;}
	     System.out.println("\n"+"Even="+e +" and Odd="+o);
	   }
	   
	   System.out.println("\n"+"Even="+e +" and Odd="+o);
	   if ( o % 2 == 0 )
	   { t=0;}
	    else
	    { t=1;}
	   System.out.println("\n"+t);
	   
   student object1=new student(number,myString,myString2,t);
   
   os.writeObject(object1);
   
   
   PrintStream ps 
   = new PrintStream(s.getOutputStream()); 


BufferedReader br 
   = new BufferedReader( 
       new InputStreamReader( 
           s.getInputStream())); 

  String sss = br.readLine();
   System.out.println(sss); 
   System.out.println("obj no:"+jjj);
   
   
  
  //os.writeObject(object1);
jjj++;
number=number+2;
   }
   
   //s.close();
   
   }
 }