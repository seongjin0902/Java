package ch24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws Exception {

		// 전화걸기
		Socket client = new Socket("192.168.2.12", 8000);
		System.out.println("[INFO] Server와 연결 완료");

		DataOutputStream dout = new DataOutputStream(client.getOutputStream());
		DataInputStream din = new DataInputStream(client.getInputStream());
		
		Scanner sc = new Scanner(System.in);
		
		String recv = null;
		String send = null;
		
		while(true) {
//			송신
			System.out.print("[Client(q:종료)] ");
			send = sc.nextLine();
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q"))
				break;
			
//			수신
			recv = din.readUTF();
			if(recv.equals("q") || recv == null)
				break;
			System.out.println("[Server] " + recv);

		}

	}

}
