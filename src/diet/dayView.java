package diet;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import controller.control;
import controller.dayChange;

public class dayView extends JFrame{
	
	public dayView() {
		super("하루 달성 정보 창");
		
		setSize(400,600);
		setLayout(null);
		control co = new control();
		//배경
		this.setContentPane(new JLabel(new ImageIcon("images/dayview.jpg")));
		this.setSize(400,600);
		
		// Dday랑 경과시간 적는 Label
		
		dayChange dc = new dayChange();
		

		JLabel label1 = new JLabel("D -");
		label1.setLayout(null);
		label1.setFont(new Font("휴먼엑스포",Font.BOLD,35));
		label1.setLocation(140,40);
		label1.setSize(70,80);
		
//		String D_day = String.valueOf(dc.Dday());
		

		// 영어랑 숫자 글씨크기가 차이가 많이 나서 label 하나 더 만들었음!		
		JLabel label2 = new JLabel("  " + dc.Dday());
		label2.setLayout(null);
		label2.setFont(new Font("휴먼엑스포",Font.PLAIN,35));
		label2.setLocation(190,40);
		label2.setSize(200,80);
	
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy년 MM월 dd일");
		Date time = new Date();      
		String time2 = format.format(time);
			    
		JLabel label3 = new JLabel(time2);
		label3.setLayout(null);
		label3.setFont(new Font("휴먼엑스포",Font.BOLD,14));
		label3.setLocation(140,10);
		label3.setSize(200,15);
		
		
		
		
		this.add(label1);
		this.add(label2);
		this.add(label3);
		// 달성량/목표량을 %로 나타내주는 진행바

		// 달성량/목표량을 %로 나타내주는 진행바
		JProgressBar progress1 = new JProgressBar();
		Border border = BorderFactory.createTitledBorder
				(null,"달성률 %", TitledBorder.LEFT, TitledBorder.TOP, new Font("휴먼모음T",Font.BOLD,15));
		progress1.setLocation(100, 130);
		progress1.setSize(200,50);
		progress1.setBorder(border);
		progress1.setStringPainted(true);
//		co.progress_start(progress1);
		progress1.setValue(co.progress_add());
		
		
//		co.progress_start(progress1);
		
		
		this.add(progress1);
		
		// 수정(버튼 크기조절)
	      JButton btn1 = new JButton(new ImageIcon("images/button/play2.jpg"));
	      btn1.setBorderPainted(false);
	      btn1.setLocation(13, 200);
	      btn1.setSize(171, 82);
	      
	      // 수정(버튼 크기조절)
	      JButton btn2 = new JButton(new ImageIcon("images/button/food2.jpg"));
	      btn2.setBorderPainted(false);
	      btn2.setLocation(200, 200);
	      btn2.setSize(171, 82);
		
		this.add(btn1);
		this.add(btn2);
		
		
		// 수정(버튼 크기조절)
		JButton btn3 = new JButton(new ImageIcon("images/button/detail.jpg"));
		btn3.setLocation(135, 510);
		btn3.setSize(129, 43);
		
		
		this.add(btn3);

		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Play3 p = new Play3();
				
				dispose();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Food f = new Food();
			
				dispose();

			}
		});
		
		
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				InfoPage in = new InfoPage();
				
				dispose();

				
			}
		});
		
	
		
		this.setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
}
