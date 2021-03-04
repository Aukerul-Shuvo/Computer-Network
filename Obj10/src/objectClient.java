import java.io.*;
import java.net.*;
class objectClient 
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
     Socket s=new Socket("127.0.0.1",1700);
     ObjectInputStream is=new ObjectInputStream(s.getInputStream());
     student st=(student)is.readObject();
     st.showDetails();
     
     ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
 	
     student object2=st;
     os.writeObject(object2);
     
     int e=0;
     int o=0;
     int tt=0;
     int n = st.header; 
     System.out.println("Parity of no " + n + " = " + 
                      (getParity(n)? "odd": "even"));
     if(!getParity(n))
     {	 e++;}
     
     else o++;
     System.out.println("\n"+"Even="+e +" and Odd="+o);
     
     
     String str = st.course;
     for(int i=0; i<str.length(); i++)
     {
       int asciiValue = str.charAt(i);
       System.out.println(str.charAt(i) + "=" + asciiValue);
       System.out.println("Parity of no " + asciiValue + " = " + 
               (getParity(asciiValue)? "odd": "even"));
       if(!getParity(asciiValue))
       {	 e++;}
       
       else o++;
     }
     
     String str1 = st.data;
     for(int i=0; i<str1.length(); i++)
     {
       int asciiValue = str1.charAt(i);
       System.out.println(str1.charAt(i) + "=" + asciiValue);
       System.out.println("Parity of no " + asciiValue + " = " + 
               (getParity(asciiValue)? "odd": "even"));
       if(!getParity(asciiValue))
       {	 e++;}
       
       else o++;
     }
     
     System.out.println("\n"+"Even="+e +" and Odd="+o);
     
     if ( o % 2 == 0 )
     {
     tt=0;
     }
      else
      { 
      tt=1;
      }
     
     if(st.tailer==tt)
     {
    	 System.out.println("All Okay "+ tt);
     }
     else if(st.tailer != tt)
     {
    	 System.out.println("Not Okay!!! "+ tt);
     }
    	 
     
   }
 }

