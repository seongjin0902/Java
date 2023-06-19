package ch22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataInputSteram	: byte데이터를 가져올 때 기본자료형으로 받아올 수 있다.
//DataOutputSteram	: byte데이터를 파일로 저장할 때 기본자료형 단위로 저장 가능


public class C03DateInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
//		FileOutputStream out = new FileOutputStream("c:\\iotest\\test.txt");
//		DataOutputStream dout = new DataOutputStream(out);
//		dout.writeUTF("홍길동");
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.writeUTF("오구");
//		dout.writeDouble(55.5);
//		dout.writeInt(200);
//		dout.flush();
//		dout.close();
//		out.close();
		
		FileInputStream in = new FileInputStream("c:\\iotest\\test.txt");
		DataInputStream din = new DataInputStream(in);
		
		for(int i=0; i<2;i++)
		{
			String name = din.readUTF();
			double dval = din.readDouble();
			int ival = din.readInt();
			System.out.printf("%s %f %d\n", name, dval, ival);
		}
		
	}

}
