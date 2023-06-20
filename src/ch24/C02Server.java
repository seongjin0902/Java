package ch24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class C02Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(6000);
		System.out.println("Server Socket Listening..");
		
//		1:1
		Socket client = server.accept();
		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		DataInputStream din = new DataInputStream(client.getInputStream());
		
		Scanner sc = new Scanner(System.in);
		
		String recv = null;
		String send = null;
		
		while(true) {
//			수신
			recv = din.readUTF();
			if(recv.equals("q") || recv == null)
				break;
			System.out.println("[Client] " + recv);
			
//			송신
			System.out.print("[Server(q:종료)] ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				break;
		}

	}

}
