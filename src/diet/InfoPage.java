package diet;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.control;
import controller.dayChange;
import model.vo.Member;

public class InfoPage extends JFrame{


	public InfoPage() {
		super("상세 페이지");
	
		
//					프레임 크기		
	 this.setBounds(100,100,400,600);
	 this.setLayout(null);
	
	 //배경
	 this.setContentPane(new JLabel(new ImageIcon("images/infopage.jpg")));
	 this.setSize(400,600);
	
	 
	 control co = new control();

	 
	 String difday = " ";
	 
	 if(co.difday() == 1) {
		 difday = "매일매일 꾸준히!!";
	 }else if (co.difday() == 2) {
		 difday = "좀더 분발하세요!";
	 }else if (co.difday() == 3) {
		 difday = "다시 힘내 봅시다!";
	 }else if(co.difday() > 4 && co.difday() < 49) {
		 difday = "초심으로 돌아가세요";
	 }
	 
	 
	 
	 JButton button = new JButton(new ImageIcon("images/button/back.jpg"));
	 JButton button2 = new JButton(new ImageIcon("images/button/change.jpg"));
	 button.setBounds(220, 510, 100, 40);
	 button2.setBounds(50, 510, 100, 40);
	 
	 
	 JPanel panel1 = new JPanel();
	 panel1.setBounds(0, 10, 120, 50);
	 // panel 색깔 투명으로 만들었음
	 panel1.setBackground(new Color(255, 0, 0, 0)); 
	 
	 JPanel panel2 = new JPanel();
	 panel2.setBounds(0, 50, 120, 50);
	 panel2.setBackground(new Color(255, 0, 0, 0)); 

	 
	 JPanel panel3 = new JPanel();
	 panel3.setBounds(0, 100, 110, 50);
	 panel3.setBackground(new Color(255, 0, 0, 0)); 

	 
	 JPanel panel4 = new JPanel();
	 panel4.setBounds(0, 150, 110, 50);
	 panel4.setBackground(new Color(255, 0, 0, 0)); 

	 
	 JPanel panel4_1 = new JPanel();
	 panel4_1.setBounds(0, 190, 120, 50);
	 panel4_1.setBackground(new Color(255, 0, 0, 0)); 

	 JPanel panel6 = new JPanel();
	 panel6.setBounds(250, 500, 100, 100);
	 panel6.setBackground(new Color(255, 0, 0, 0)); 
	 
	 JPanel panel7 = new JPanel();
	 panel7.setBounds(30,500,100,100);
	 panel7.setBackground(new Color(255, 0, 0, 0)); 

	 
	JLabel Label5 = new JLabel();
	JLabel Label6 = new JLabel();
	JLabel Label7 = new JLabel();
	JLabel Label8 = new JLabel();
	JLabel Label9 = new JLabel();
	Label5 = new JLabel(co.goalweight()-co.weight()+" Kg 남았습니다!! 힘내세요!");
	Label5.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	Label6 = new JLabel("오늘먹은 칼로리 : "+co.outFoodCalorie());
	Label6.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	Label7 = new JLabel("오늘소모 칼로리 : "+co.outPlayCalorie());
	Label7.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	
	if(co.difday() > 49) {
	Label8 = new JLabel("시작이 반이죠? 화이팅");
	}else {
	Label8 = new JLabel(co.difday()+"일만에 들어오셨습니다!");
	}
	
	Label8.setFont(new Font("휴먼모음T",Font.PLAIN,16));
	Label8.setLocation(190,90);
	Label8.setSize(200,20);
	Label9 = new JLabel(difday);
	Label9.setFont(new Font("휴먼모음T",Font.PLAIN,16));
	Label9.setLocation(200,110);
	Label9.setSize(200,20);
	 
	this.add(Label8);
	this.add(Label9);
	 
	 
	 Member m = new Member();
	 
	 JLabel Label1 = new JLabel();
	 JLabel Label2 = new JLabel();
	 JLabel Label3 = new JLabel();
	 JLabel Label4 = new JLabel();
	 JLabel Label4_1 = new JLabel();
	

	

	Label5.setBounds(110, 410, 300, 15);
	Label6.setBounds(130, 430, 200, 15);
	Label7.setBounds(130, 450, 200, 15);
	 
		
	 
		// 수정(폰트지정 + 자리 조절)
		    Label1 = new JLabel("   이름 :   "+m.getName());
		    Label1.setFont(new Font("휴먼모음T",Font.PLAIN,13));
		    Label2 = new JLabel("    키  :  "+co.height());
		    Label2.setFont(new Font("휴먼모음T",Font.PLAIN,13));
		    Label3 = new JLabel("    체중 :  "+co.weight());
		    Label3.setFont(new Font("휴먼모음T",Font.PLAIN,13));
		    Label4 = new JLabel(" 목표체중 :  "+co.goalweight());
		    Label4.setFont(new Font("휴먼모음T",Font.PLAIN,13));
		    Label4_1 = new JLabel("  BMI   :  "+co.BMI());
		    Label4_1.setFont(new Font("휴먼모음T",Font.PLAIN,13));
		   
		 
	 
	 panel1.add(Label1);
	 panel2.add(Label2);
	 panel3.add(Label3);
	 panel4.add(Label4);
	 panel4_1.add(Label4_1);

	 
	 
	 panel6.add(button);
	 panel7.add(button2);

	 this.add(panel1);
	 this.add(panel2);
	 this.add(panel3);
	 this.add(panel4);
	 this.add(panel4_1);
	 this.add(Label5);
	 this.add(Label6);
	 this.add(Label7);
	 
	 this.add(button);
	 this.add(button2);

	 button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			dayView d= new dayView();
			
			dispose();
		}
	});
	 button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Edit ed = new Edit();
				
				dispose();
			}
		});
	 this.setResizable(false);
	 this.setVisible(true);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
