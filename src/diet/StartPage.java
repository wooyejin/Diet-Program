package diet;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartPage extends JFrame{

	public StartPage() {
		super("시작화면");
		
		setLayout(null);
		
		this.setBounds(100, 100, 400, 600);
		
		
		//배경
		this.setContentPane(new JLabel(new ImageIcon("images/start.jpg")));
		this.setSize(400,600);
		
		
		JLabel lb = new JLabel("살빼자! 살빼자!");
		// 수정(폰트 추가)
		lb.setFont(new Font("휴먼모음T",Font.PLAIN,15));			
		
		// 수정(lb2 이미지 추가)
		JLabel lb2 = new JLabel(new ImageIcon("images/title.jpg"));
		
		// 회원 가입 버튼/로그인 버튼 이미지 추가			
		// 회원가입,로그인버튼 수정!!!
		JButton bu = new JButton(new ImageIcon("images/button/input.png"));
		JButton bu2 = new JButton(new ImageIcon("images/button/login.png"));
		
		
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				InputInfoPage li = new InputInfoPage();
				dispose();
			}
		});
		bu2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				LoginPage lo = new LoginPage();
			
				dispose();
			}
		});
		
		
		// 수정(lb 위치) 
		lb.setBounds(155, 120, 150, 100);	
		// 수정(lb2 위치)
		lb2.setBounds(80,40,240,80);
		bu.setBounds(120, 400, 150, 40);
		bu2.setBounds(120, 470, 150, 40);
		
		
		
		
		add(lb);
		// lb2 추가
		add(lb2);
		add(bu);
		add(bu2);
		
		
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
}
