package ch20ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame {

	C04GUI() {
		super("Chatting Server");
		setBounds(100, 100, 700, 700);

//		panel
		JPanel panel = new JPanel(); // 패널생성
		panel.setLayout(null);

//		component
		JButton btn1 = new JButton("파일로저장");
		btn1.setBounds(250, 20, 150, 40);
		JButton btn2 = new JButton("1:1요청");
		btn2.setBounds(250, 80, 150, 40);
		JButton btn3 = new JButton("대화기록보기");
		btn3.setBounds(250, 140, 150, 40);
		JButton btn4 = new JButton("입력");
		btn4.setBounds(250, 250, 150, 40);

//		txt_component
		JTextField txt1 = new JTextField();
		txt1.setBounds(20, 250, 210, 40);
//		JTextField txt2 = new JTextField();
//		txt2.setBounds(120, 50, 100, 30);

//		txtArea_component
		JTextArea area1 = new JTextArea();
		area1.setBounds(20, 20, 210, 200);

//		ScrollPan_component
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(20,20,210,200);

//		add_panel_component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txt1);
//		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);

//		배경색 지정

		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}

public class C01ex {

	public static void main(String[] args) {

		new C04GUI();

	}

}
