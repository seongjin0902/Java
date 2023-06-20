package Project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Date;
import java.util.UUID;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		new GUI();
	}

}

class GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	JTextField txt1;
	JTextField txt2;
	JTextArea area1;
	JScrollPane scroll1;
	JScrollPane scroll2;

	GUI() {
		// Frame
		super("다 같이 게시판");
		setBounds(100, 100, 900, 900);


		// Panel
		JPanel panel = new JPanel(); // 패널생성
		panel.setLayout(null);


		// Component
		btn1 = new JButton("글 작성");
		btn2 = new JButton("내가 쓴글");
		btn3 = new JButton("다 같이 게시판");
		txt1 = new JTextField();
		txt2 = new JTextField();
		area1 = new JTextArea();
		// area1.setBounds(10,90,210,300);
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(area1);

		// Positioning
		txt1.setBounds(10, 130, 860, 200);		//인기글
		txt2.setBounds(10, 340, 860, 450);		//메인글
		
		btn1.setBounds(680, 80, 90, 30);		//글작성
		btn2.setBounds(780, 80, 90, 30);		//내가 쓴 글
		btn3.setBounds(10, 10, 860, 60);		//제목
		
		scroll1.setBounds(10, 130, 860, 200);	//인기글 스크롤
		scroll2.setBounds(10, 340, 860, 450);	//메인글 스크롤

		// Event처리
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		txt1.addKeyListener(this);
		area1.setEditable(false);
		btn1.setFont(new Font("굴림",Font.BOLD,12));
		btn2.setFont(new Font("굴림",Font.BOLD,12));		
		btn3.setFont(new Font("굴림",Font.BOLD,25));

		
		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(txt1);
		panel.add(txt2);
//			panel.add(area1);
		panel.add(scroll1);
		panel.add(scroll2);

		// Frame
		add(panel); // 프레임에 panel추가

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// System.out.println("이벤트 발생");
		if (e.getSource() == btn1) {
			System.out.println("저장하기 클릭");

			String context = area1.getText();
			String dirpath = "c:\\iotest\\";
			String filename = UUID.randomUUID().toString();
			try {
				Writer out = new FileWriter(dirpath + filename + ".txt");
				out.write(new Date().toString() + "\n");
				out.write(context);
				out.flush();
				out.close();

			} catch (IOException el) {
				el.printStackTrace();
			}
		} else if (e.getSource() == btn2) {
			System.out.println("불러오기 클릭");
			JFileChooser fileChooser = new JFileChooser();
			int returnValue = fileChooser.showOpenDialog(null);
			String filename = null;
			if (returnValue == JFileChooser.APPROVE_OPTION) // 파일 선택한 경우
			{
				filename = fileChooser.getSelectedFile().toString();
			}
			System.out.println(filename);

			try {
				Reader in = new FileReader(filename);
				area1.setText("");
				StringBuffer buffer = new StringBuffer();
				while (true) {
					int date = in.read();
					if (date == -1)
						break;
					buffer.append((char) date);
				}
				in.close();
				area1.append(buffer.toString());

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 눌렀을때/뗏을때(UNICODE 지원)
//			System.out.println("keyTyped() : "+e.getKeyChar());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 눌렀을때
//			System.out.println("keyPressed() : "+e.getKeyChar());
//			System.out.println("keyPressed() : "+e.getKeyCode());
		if (e.getSource() == txt1) {
			if (e.getKeyCode() == 10) {
				System.out.println("txt1's Enter");
				String str = txt1.getText();
				area1.append(str + "\n");
				txt1.setText("");
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키를 뗏을때(UNICODE 미지원)
//			System.out.println("keyReleased() : " + e.getKeyChar());
//			System.out.println("keyReleased() : " + e.getKeyCode());

	}

}
