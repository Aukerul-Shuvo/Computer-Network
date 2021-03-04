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
	  int e=0;
	   int o=0;
	   int t=0;
	   
   // Server will be started on 1700 port number
    ServerSocket server=new ServerSocket(1700);
	
   // Server listening for connection
    Socket s=server.accept();
	
   // Stream object for sending object 
    ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int n = number;
    
    System.out.println("Parity of no " + n + " = " + 
                     (getParity(n)? "odd": "even"));
    if(!getParity(n))
    {	 e++;}
    
    else if (getParity(n)){ o++;}
    System.out.println("\n"+"Even="+e +" and Odd="+o);
    
	System.out.print("Enter course: ");
	String myString = input.next();
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
	String myString2 = input.next();
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
   
   ObjectInputStream is=new ObjectInputStream(s.getInputStream());
   student st=(student)is.readObject();
   st.showDetails();
   ObjectOutputStream os1=new ObjectOutputStream(s.getOutputStream());
   
   student object2=st;
   //os1.writeObject(object2);
  /* int n = number;
   
   System.out.println("Parity of no " + n + " = " + 
                    (getParity(n)? "odd": "even"));
   if(!getParity(n))
   {	 e++;}
   
   else o++;
   System.out.println("\n"+"Even="+e +" and Odd="+o);
   
   */
   /*String str = st.course;
   for(int i=0; i<str.length(); i++)
   {
     int asciiValue = str.charAt(i);
     System.out.println(str.charAt(i) + "=" + asciiValue);
     System.out.println("Parity of no " + asciiValue + " = " + 
             (getParity(asciiValue)? "odd": "even"));
     if(!getParity(n))
     {	 e++;}
     
     else o++;
   }*/
   
   /*String str1 = st.data;
   for(int i=0; i<str1.length(); i++)
   {
     int asciiValue = str1.charAt(i);
     System.out.println(str1.charAt(i) + "=" + asciiValue);
     System.out.println("Parity of no " + asciiValue + " = " + 
             (getParity(asciiValue)? "odd": "even"));
     if(!getParity(n))
     {	 e++;}
     
     else o++;
   }
   
   System.out.println("\n"+"Even="+e +" and Odd="+o);
   */
   /*if ( o % 2 == 0 )
   { object1.tailer=0;}
    else
    { object1.tailer=1;}*/
  os.writeObject(object1);

   
   
   s.close();
   }
 }