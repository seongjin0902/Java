package ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C04StreamCopy {
                                                                                                  
	public static void main(String[] args) throws Exception {

		InputStream in = new FileInputStream("c:\\iotest\\아기오구.png");
		OutputStream out = new FileOutputStream("c:\\iotest\\copy오구.png");

		byte[] buffer = new byte[4096];

		while (true) {
			int cnt = in.read(buffer);
			if (cnt == -1)
				break;
			out.write(buffer, 0, cnt);
		}

	}

}
