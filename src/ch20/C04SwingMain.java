package ch20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame {

	C04GUI() {
		super("4번째 프레임창입니다.");
		setBounds(100, 100, 700, 700);

//		panel
		JPanel panel = new JPanel(); // 패널생성
		panel.setLayout(null);

//		component
		JButton btn1 = new JButton("Button1");
		btn1.setBounds(10, 10, 100, 30);
		JButton btn2 = new JButton("Button2");
		btn2.setBounds(120, 10, 100, 30);

//		txt_component
		JTextField txt1 = new JTextField();
		txt1.setBounds(10, 50, 100, 30);
		JTextField txt2 = new JTextField();
		txt2.setBounds(120, 50, 100, 30);

//		txtArea_component
		JTextArea area1 = new JTextArea();
		area1.setBounds(10, 90, 210, 300);

//		ScrollPan_component
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,90,210,300);

//		add_panel_component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);

//		배경색 지정

		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}

public class C04SwingMain {

	public static void main(String[] args) {

		new C04GUI();

	}

}
