
package application;


import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;
public class connectserveur{

	static ServerSocket s;
	static Socket c1;
	static Socket c2;
	static DataInputStream in1;
	static DataInputStream in2;
	static DataOutputStream out1;	
	static DataOutputStream out2;
	
        @SuppressWarnings("UseSpecificCatch")
	public static void main(String[] args) {
		
		try {
			s= new ServerSocket(1555,2);
			System.out.println("serveur connecté");
			
			c1=s.accept();
			System.out.println("client 1 connecté");
			c2 = s.accept();
			System.out.println("client 2 connecté");
			
			
			
			 in1= new DataInputStream(c1.getInputStream());
			 in2= new DataInputStream(c2.getInputStream());
			
			 out1 = new DataOutputStream(c1.getOutputStream());
			 out2 = new DataOutputStream(c2.getOutputStream());

			 String str1="";
			 String str2="";
                        @SuppressWarnings("UnusedAssignment")
			 int var=0;
			 
			 double x = Math.random();
			 if (x<0.5)
			 {
				 var=1;
				 System.out.println("le client 1 debute !! ");	
				 out2.writeUTF("bloqué");
				 str1=(String)in1.readUTF();
				 System.out.println("message1 = "+str1);				
				 out2.writeUTF(str1);
				 
				 str1=(String)in1.readUTF();
				 
				 while(!str1.equals("quitter") && !str2.equals("quitter")) 
				 {
					 if(var%2!=0)
					 {
						 
						 System.out.println("message1 = "+str1);				
						 out2.writeUTF(str1);
						 out2.writeUTF("débloqué");
						 out1.writeUTF("bloqué");
						 var++;
						 str2=(String)in2.readUTF();
						 
					 } 
					 
					 if(var%2==0)
					 {
						 
						 System.out.println("message2 = "+str2);				
						 out1.writeUTF(str2);
						 out1.writeUTF("débloqué");
						 out2.writeUTF("bloqué");
						 var++;
						 str1=(String)in1.readUTF();
						 
					 } 
					 
				}
				 if(str1.equals("quitter"))
				 {
					 out2.writeUTF(str1);
				 }
				 else
				 {
					 out1.writeUTF(str2);
				 }
			 }
					
		
			 else if (x>=0.5)
			 {
				 var=2;
				 System.out.println("le client 2 debute !! ");		
				 out1.writeUTF("bloqué");
				 str2=(String)in2.readUTF();
				 System.out.println("message2 = "+str2);				
				 out1.writeUTF(str2);
				 
				 str2=(String)in2.readUTF();
				 
				 while(!str1.equals("quitter") && !str2.equals("quitter")) 
				 {
					 if(var%2!=0)
					 {
						 
						 System.out.println("message1 = "+str1);				
						 out2.writeUTF(str1);
						 out2.writeUTF("débloqué");
						 out1.writeUTF("bloqué");
						 var++;
						 str2=(String)in2.readUTF();
						 
					 } 
					 
					 if(var%2==0)
					 {
						 
						 System.out.println("message2 = "+str2);				
						 out1.writeUTF(str2);
						 out1.writeUTF("débloqué");
						 out2.writeUTF("bloqué");
						 var++;
						 str1=(String)in1.readUTF();
						 
					 } 
				}
				 if(str1.equals("quitter"))
				 {
					 out2.writeUTF(str1);
				 }
				 else
				 {
					 out1.writeUTF(str2);
				 }
			 }
			 
		
			 
	 
			
				  s.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

				  
			 }
   
			
	}

