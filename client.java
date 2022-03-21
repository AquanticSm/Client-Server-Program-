// Jordan Seth Myers 

import java.net.*; 
import java.io.*;
import java.net.*;
import java.net.InetAddress;
import java.util.Date;
import java.net.UnknownHostException;
import java.util.Scanner;


public class client{
	
		public static void main(String[] args) throws IOException{
			Socket s = new Socket("localhost", 5000);
			
			
			
			String userInput;
			InetAddress ip;
			Date date = new Date();
			
		
			
			
			
			
			
			try{
				ip = InetAddress.getLocalHost();
				System.out.println("Ip Address on Client is: " + ip);
				System.out.println(date.toString());
				System.out.println("Connected to the server...");
				System.out.println("Enter your client messages one by one and press the return key");
				
				Scanner msg = new Scanner(System.in);
				int length = 1000;
				
				String x = msg.nextLine();

				
				OutputStream outToServer = s.getOutputStream();
				DataOutputStream out = new DataOutputStream(outToServer);
				
			
				
				out.writeUTF("client sends - " + date.toString() + ": " + x);
				InputStream inFromServer = s.getInputStream();
				DataInputStream in = new DataInputStream(inFromServer);
				
				System.out.println("Server sends - : " + date.toString() + ": " + in.readUTF());
				s.close();
				
			  
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			
			    
			/*InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader b = new BufferedReader(in);
			String st = b.readLine();
			System.out.println("server: "+ st); 
			
			PrintWriter p = new PrintWriter(s.getOutputStream());
			p.println("is it working");
			p.flush();
			 */
				
				

		     
					
			
			
			
			
				
			
		
			
			
			
			
			
			
		}
		
			
		
		
		
		
		
		// Scanner sc = new Scanner(System.in);
		//m = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		  /* while(true){
					s.msgToServer();
				} */
		
		/*public ClientFunction(String as, int port){
			 this.as = as;
			 this.port = port;
			try{ 
				c = new Socket(as, port);
				r = new BufferedReader(new InputStreamReader(c.getInputStream()));
				m = new PrintWriter(new OutputStreamWriter(c.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*private void msgToServer(String mesg){
			
			try {
				m.println(msg);
				m.flush();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(msg.toLowerCase().equals("exit")){
				println("Goodbye");
				try {
					m.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
			
			
		}  */
			
}
