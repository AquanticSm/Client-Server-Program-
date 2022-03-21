// Jordan Seth Myers

import java.net.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.io.*;
import java.util.Scanner;

public class server{
	
		public static void main(String[] args) throws IOException{
			ServerSocket ss = new ServerSocket(5000);
			Socket s = ss.accept();
			
			
			InetAddress ip;
			Date date = new Date();
			//String myname;
			
			// Getting Ip address 
			
			
			
			
			
			
			
			try {
				ip = InetAddress.getLocalHost();
				// myname = ip.getHostName();
				System.out.println("Ip Address on server is: " + ip);
				System.out.println(date.toString());
				System.out.println("waiting for a connection...");
				System.out.println("Connection accepted from " + ip);
				System.out.println("Enter your server messages one by one and press return key!");
				
				 
			
				Scanner msg = new Scanner (System.in);
				int length = 1000;
				String x = msg.nextLine();
				
				
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				out.writeUTF(x);
				
				DataInputStream in = new DataInputStream(s.getInputStream());
				System.out.println(in.readUTF());
				
				s.close();
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			
			
			
			/*InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader b = new BufferedReader(in);
			
			String st = b.readLine();
			System.out.println("client sends - "+ st + date);
			
			PrintWriter p = new PrintWriter(s.getOutputStream());
			p.println("yes ");
			p.flush(); */
			
			
		}
		
		
		
			
			
}	
			/*InetAdress inetAddress = InetAddress.getLocalHost();
			
			System.out.println("IP Address: " + inetAddress.getHostAddress());
			
			System.out.println("Host Name: " + inetAddress.getHostName());  */