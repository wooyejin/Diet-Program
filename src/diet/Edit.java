package diet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.control;
import model.vo.Member;

public class Edit extends JFrame{

	
	public Edit() {
		super("정보수정");
		 this.setBounds(100,100,280,250);
		 this.setLayout(null);
		 this.setContentPane(new JLabel(new ImageIcon("images/white.jpg")));
		
		// 글씨체 수정
	      JLabel label1 = new JLabel("키 ");
	      label1.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	      JLabel label2 = new JLabel("현재 체중");
	      label2.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	      JLabel label3 = new JLabel("목표 체중");
	      label3.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	      
	      JLabel label4 = new JLabel("cm");
	      label4.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	      JLabel label5 = new JLabel("kg");
	      label5.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	      JLabel label6 = new JLabel("kg");
	      label6.setFont(new Font("휴먼모음T",Font.PLAIN,13));
		
		
		JTextField t1 = new JTextField(); //키
		JTextField t2 = new JTextField(); //현재 체중
		JTextField t3 = new JTextField(); //목표 체중
		
		
		JButton button = new JButton(new ImageIcon("images/button/change1.jpg"));
		
		button.setBounds(100,170,100,27);
		
		  JPanel panel1 = new JPanel();
	      panel1.setBounds(0,20,100,50);
	      panel1.setBackground(new Color(255, 0, 0, 0)); 
	       
	      JPanel panel2 = new JPanel();
	      panel2.setBounds(0,67,100,50);
	      panel2.setBackground(new Color(255, 0, 0, 0)); 
	      
	      JPanel panel3 = new JPanel();
	      panel3.setBounds(0,118,100,50);
	      panel3.setBackground(new Color(255, 0, 0, 0)); 
	      
	      JPanel panel4 = new JPanel();
	      panel4.setBounds(170,20,100,50);
	      panel4.setBackground(new Color(255, 0, 0, 0)); 
	      
	      JPanel panel5 = new JPanel();
	      panel5.setBounds(170,67,100,50);
	      panel5.setBackground(new Color(255, 0, 0, 0)); 
	      
	      JPanel panel6 = new JPanel();
	      panel6.setBounds(170,118,100,50);
	      panel6.setBackground(new Color(255, 0, 0, 0)); 
		add(t1);
		add(t2);
		add(t3);
		add(button);
		
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(label5);
		panel6.add(label6);
		
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);
		
		t1.setBounds(100,20,100,25);
		t2.setBounds(100,70,100,25);
		t3.setBounds(100,120,100,25);
		
		
	Member m = new Member();
	control co = new control();
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			JOptionPane jo = new JOptionPane();
			
			String name =null;
			char gender = 0;
			String year = null;
			String month = null;
			String day = null;
			double height = 0;
			double weight = 0;
			double goalweight = 0;
			int startyear = 0;
			int startmonth = 0;
			int startday = 0;
			int Dday = 0;
			
			
			try (DataInputStream din = new DataInputStream(new FileInputStream
					(m.getName()+m.getBrithday()+".dat"))) {
				
				
				name=		din.readUTF();//이름
				gender=		din.readChar();//성별
				year =		din.readUTF();//년
				month =		din.readUTF();//월
				day		=din.readUTF();//일
				height	=	din.readDouble();//키
				weight	=	din.readDouble();//체중
				goalweight	=	din.readDouble();//목표체중
				startyear	=	din.readInt();//시작년도
				startmonth	=	din.readInt();//시작월
				startday	=	din.readInt();//시작일
				Dday	=	din.readInt();//목표일수
			
			
			
			
			
			}catch (FileNotFoundException ex) {
				
			}catch (IOException ex) {
				
			}
			
			
	
			try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(
					m.getName()+m.getBrithday()+".dat"))) {
				
				
				height = Double.parseDouble(t1.getText());
				weight = Double.parseDouble(t2.getText());
				goalweight = Double.parseDouble(t3.getText());
				
							
							dout.writeUTF(name);//이름
							dout.writeChar(gender);//성별
							dout.writeUTF(year);//년
							dout.writeUTF(month);//월
							dout.writeUTF(day);//일
							dout.writeDouble(height);//키
							dout.writeDouble(weight);//몸무게
							dout.writeDouble(goalweight);//목표몸무게
							dout.writeInt(startyear);//시작년
							dout.writeInt(startmonth);//시작월
							dout.writeInt(startday);//시작일
							dout.writeInt(Dday);//목표일
				
							
							
		jo.showMessageDialog(null, "저장완료");
		dispose();
		
		InfoPage in = new InfoPage();
		
	}catch(FileNotFoundException ex) {
		ex.printStackTrace();

	}catch(IOException ex) {
		ex.printStackTrace();
	}

	
	
	
	}
});
	this.setResizable(false);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
}
