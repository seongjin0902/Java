package ch21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args) {
		try {
//			Writer out =new FileWriter("c:\\iotest\\test1.txt");		//기본 false
			Writer out =new FileWriter("c:\\iotest\\test1.txt",true);	//추가하기
			out.write("bbb\n");
			out.write("ccc\n");
			out.write("dddddddddddddd\n");
			
			out.flush();	//버퍼 초기화
			out.close();	//스트림 종료
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
