package diet;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.vo.Member;

public class LoginPage extends JFrame{

public LoginPage() {
	
	Member m = new Member();
	this.setLayout(null);
	
	this.setBounds(100, 100, 300, 200);
	
	this.setContentPane(new JLabel(new ImageIcon("images/white.jpg")));

	
	JLabel l1 = new JLabel("이름   ");
	l1.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	JLabel l2 = new JLabel("생년월일   ");
	l2.setFont(new Font("휴먼모음T",Font.PLAIN,13));


	l1.setBounds(10, 10, 50, 15);
	l2.setBounds(10, 50, 70, 15);
	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	
	t1.setBounds(130, 10, 100, 20);
	t2.setBounds(130, 50, 100, 20);
	
	JButton button = new JButton(new ImageIcon("images/button/login1.png"));
	
	button.setBounds(130, 90, 80, 30);

	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(button);
	
	this.setResizable(false);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			
			try(DataInputStream dis = new DataInputStream
					(new FileInputStream(t1.getText()+t2.getText()+".dat"))){
				
				m.setName(t1.getText());
				m.setBrithday(t2.getText());
				JOptionPane jo = new JOptionPane();
				jo.showMessageDialog(null, "로그인 성공");
				
				
				dispose();
				dayView d= new dayView();
				
			
				
				
				
				
			}catch(FileNotFoundException ex) {
				JOptionPane jo = new JOptionPane();
				jo.showMessageDialog(null, "로그인 실패");
				
				dispose();
				
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
			
		}
	});
	
	
	
}
	
	
}
