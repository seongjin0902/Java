package ch21;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C06UrlStream {

	public static void main(String[] args) throws Exception {

		URL url = new URL(
				"https://news.sbs.co.kr/news/endPage.do?news_id=N1007231753&amp;plink=STAND&amp;cooper=NAVERMAIN");
		InputStream bin = url.openStream(); // java <- 브라우저 출력내용
		BufferedInputStream buffin = new BufferedInputStream(bin); // 보조스트림 추가
																	// 버퍼공간을 둬서 한번에 받기

		Reader r = new InputStreamReader(buffin); // 보조스트림 추가
													// byte->char사이즈로 받아옴

		OutputStream out = new FileOutputStream("c:\\iotest\\index.html");
		Writer wout = new OutputStreamWriter(out);
		
		while (true) {
			int data = r.read();
			if (data == -1)
				break;
			System.out.print((char) data);
			wout.write(data);

		}

	}

}
