package diet;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import controller.control;
import model.vo.Member;

public class InputInfoPage extends JFrame{
	public InputInfoPage() {
	     super("회원가입");
	      
	      // 사이즈
	      this.setBounds(100,100,400,600);
	      this.setLayout(null);
	      
	      //배경
	      this.setContentPane(new JLabel(new ImageIcon("images/infoback.png")));
		  this.setSize(400,600);
	      
	      // panel1 -> (이름) 칸 수 조정
	      JPanel panel1 = new JPanel();
	      panel1.setBounds(0,10,100,30);
	      panel1.setBackground(new Color(255, 0, 0, 0)); 
	      
	      // panel2 -> (성별) 칸 수 조정
	      JPanel panel2 = new JPanel();
	      JPanel pan2 = new JPanel();
	      JPanel pan2_1 = new JPanel();
	      
	      // pan2 -> (man)라디오버튼 칸 수 조정
	      // pan2_1 -> (woman)라디오버튼 칸 수 조정
	      panel2.setBounds(0,52,100,50);
	      pan2.setBounds(90,50,100,40);
	      panel2.setBackground(new Color(255, 0, 0, 0)); 
	      pan2.setBackground(new Color(255, 0, 0, 0)); 
	      
	      pan2_1.setBounds(170,50,100,40);
	      pan2_1.setBackground(new Color(255, 0, 0, 0));
	      
	      
	      // panel3 -> (생년월일) 칸 수 조정
	      JPanel panel3 = new JPanel();
	      panel3.setBounds(0,100,100,50);
	      panel3.setBackground(new Color(255, 0, 0, 0)); 
	     
	      // pan3 -> (생년월일) 중 (ex: 1997, 1998 년도를 가리킴)
	      JPanel pan3 = new JPanel();
	      pan3.setBounds(81,100,100,50);
	      pan3.setBackground(new Color(255, 0, 0, 0)); 

	      // pan3_1 -> (생년월일) 중 (ex: 01, 02 .. 등 월을 가리킴)
	      JPanel pan3_1 = new JPanel();
	      pan3_1.setBounds(155,100,100,50);
	      pan3_1.setBackground(new Color(255, 0, 0, 0)); 

	      // pan3_2 -> (생년월일) 중 (ex: 21, 22 .. 등 일을 가리킴)
	      JPanel pan3_2 = new JPanel();
	      pan3_2.setBounds(222,100,100,50);
	      pan3_2.setBackground(new Color(255, 0, 0, 0)); 

	      
	      
	      // 년도 배열 저장 
	      String[] year = {"1970","1971","1972","1973","1974","1975","1976","1977",
	            "1978","1979","1980","1981","1982","1983","1984","1985",
	            "1986","1987","1988","1989","1990","1991","1992",
	            "1993","1994","1995","1996","1997","1998","1999","2000",
	            "2001","2002","2003","2004","2005","2006","2007","2008",
	            "2009","2010","2011","2012","2013","2014","2015","2016",
	            "2017","2018","2019"
	            };
	      
	      // 년도 콤보박스 생성
	      JComboBox yearList = new JComboBox(year);
	      
	      yearList.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            JComboBox box = (JComboBox)e.getSource();
	         }
	      });
	      
	      // 월, 일 배열 저장
	      String[] month = {"01","02","03","04","05","06","07","08","09",
                 "10","11","12"};
	      String[] day = {"1","2","3","4","5","6","7","8","9",
	            "10","11","12","13","14","15","16","17","18",
	            "19","20","21","22","23","24","25","26","27","28",
	            "29","30","31"};
	      
	      // 월, 일 콤보박스 생성
	      JComboBox monthList = new JComboBox(month);
	      JComboBox dayList = new JComboBox(day);
	      
	      yearList.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            JComboBox box = (JComboBox)e.getSource();
	         }
	      });
	      
	      // panel4 -> (키) 칸 수 조정
	      JPanel panel4 = new JPanel();
	      panel4.setBounds(0,150,100,50);
	      panel4.setBackground(new Color(255, 0, 0, 0)); 
  
	      // panel5 -> (몸무게) 칸 수 조정
	      JPanel panel5 = new JPanel();
	      panel5.setBounds(0,200,100,50);
	      panel5.setBackground(new Color(255, 0, 0, 0)); 

	      // panel6 -> (목표체중) 칸 수 조정
	      JPanel panel6 = new JPanel();
	      panel6.setBounds(0,250,100,50);
	      panel6.setBackground(new Color(255, 0, 0, 0)); 

	      // panel7 -> (목표기간) 칸 수 조정
	      JPanel panel7 = new JPanel();
	      panel7.setBounds(0,300,100,50);
	      panel7.setBackground(new Color(255, 0, 0, 0)); 

	      

	      
	      // panel8 -> (등록) 버튼 칸 수 조정
	      JPanel panel8 = new JPanel();
	      panel8.setBounds(0,350,100,50);
	      panel8.setBackground(new Color(255, 0, 0, 0)); 

	      // panel9 -> (cm) 글자 위치
	      JPanel panel9 = new JPanel();
	      panel9.setBounds(170,150,100,50);
	      panel9.setBackground(new Color(255, 0, 0, 0)); 

	      // panel10 -> (kg) 글자 위치
	      JPanel panel10 = new JPanel();
	      panel10.setBounds(170,200,100,50);
	      panel10.setBackground(new Color(255, 0, 0, 0)); 

	      // panel11 -> (kg) 글자 위치
	      JPanel panel11 = new JPanel();
	      panel11.setBounds(170,250,100,50);
	      panel11.setBackground(new Color(255, 0, 0, 0)); 

	      
	      // 수정(폰트)
	      JLabel Label0 = new JLabel("이름");
	      Label0.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label1 = new JLabel("성별");
	      Label1.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label2 = new JLabel("생년월일");
	      Label2.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label3 = new JLabel("키");
	      Label3.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label4 = new JLabel("몸무게");
	      Label4.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label5 = new JLabel("목표체중");
	      Label5.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label6 = new JLabel("목표기간");
	      Label6.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      
	      JLabel Label7 = new JLabel("cm");
	      Label7.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label8 = new JLabel("kg");
	      Label8.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      JLabel Label9 = new JLabel("kg");
	      Label9.setFont(new Font("휴먼모음T",Font.PLAIN,15));
	      
	      // 등록 버튼 수정
	      JButton button = new JButton(new ImageIcon("images/button/input1.jpg"));
	      
	       JTextField t0 = new JTextField(); // 이름
	        JTextField t1 = new JTextField(); // 성별
	        JTextField t2 = new JTextField(); // 생년월일
	        JTextField t3=  new JTextField(); // 키
	        JTextField t4 = new JTextField(); // 몸무게
	        JTextField t5 = new JTextField(); // 목표체중
	        //JTextField t6 = new JTextField(); // 목표기간
	        
	        add(t0);
	        add(t1);
	        add(t2);
	        add(t3);
	        add(t4);
	        add(t5);
	        //add(t6);
	      
	        // 등록 버튼 위치 수정
	        button.setBounds(280,510,70,35);
	      
	      
	      // 수정(폰트)
	      JRadioButton man = new JRadioButton("남");
	      man.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	      JRadioButton woman = new JRadioButton("여");
	      woman.setFont(new Font("휴먼모음T",Font.PLAIN,13));
	      // 수정(폰트)
	      JRadioButton one_month = new JRadioButton("30일");
	      one_month.setFont(new Font("휴먼모음T",Font.PLAIN,12));
	      JRadioButton two_month = new JRadioButton("60일");
	      two_month.setFont(new Font("휴먼모음T",Font.PLAIN,12));
	      JRadioButton three_month = new JRadioButton("90일");
	      three_month.setFont(new Font("휴먼모음T",Font.PLAIN,12));
	      
	      // 버튼 그룹 설정
	      ButtonGroup sizeGp = new ButtonGroup();
	      ButtonGroup sizeGp2 = new ButtonGroup();
	      
	      
	      sizeGp.add(man); // (남)
	      sizeGp.add(woman); // (여)
	      
	      sizeGp2.add(one_month); // (30일)
	      sizeGp2.add(two_month); // (60일)
	      sizeGp2.add(three_month); // (90일)
	      
	      man.setBounds(97,41,40,50); // (남) 라디오 버튼 위치 수정
	      woman.setBounds(157,41,40,50); // (여) 라디오 버튼 위치 수정
	      
	      one_month.setBounds(99,290,60,50); // (30일) 라디오 버튼 위치 수정
	      two_month.setBounds(160,290,60,50); // (60일) 라디오 버튼 위치 수정
	      three_month.setBounds(220,290,60,50); // (90일) 라디오 버튼 위치 수정
	      
	      pan2.add(man);
	      pan2.add(woman);
	      
	      pan3.add(yearList);
	      pan3_1.add(monthList);
	      pan3_2.add(dayList);
	      
	      // 남,여,30일,60일,90일 라디오버튼 배경 투명 
	      man.setOpaque(false);
	      woman.setOpaque(false);
	      one_month.setOpaque(false);
	      two_month.setOpaque(false);
	      three_month.setOpaque(false);

	      
	      panel1.add(Label0); // 이름
	      panel2.add(Label1); // 성별 
	      panel3.add(Label2); // 생년월일
	      panel4.add(Label3); // 키
	      panel5.add(Label4); // 몸무게
	      panel6.add(Label5); // 목표체중
	      panel7.add(Label6); // 목표기간 
	      panel8.add(button); // 등록버튼
	      panel9.add(Label7); // cm
	      panel10.add(Label8); // kg
	      panel11.add(Label9); // kg
	      
	      this.add(panel1); // 이름
	      this.add(panel2); // 성별 
	      this.add(panel3); // 생년월일
	      this.add(panel4); // 키
	      this.add(panel5); // 몸무게
	      this.add(panel6); // 목표체중
	      this.add(panel7); // 목표기간
	      this.add(button); // 등록버튼
	      this.add(panel9); // cm
	      this.add(panel10); // kg
	      this.add(panel11); // kg
	      this.add(man); // (남) 라디오버튼 
	      this.add(woman); // (여) 라디오버튼
	      this.add(one_month); // (30일) 라디오버튼 
	      this.add(two_month); // (60일) 라디오버튼
	      this.add(three_month); // (90일) 라디오버튼
	   
	      this.add(pan2,"East");
	      this.add(pan3,"East");
	      this.add(pan3_1,"East");
	      this.add(pan3_2,"East");
	      
	      t0.setBounds(100,10,100,30); // (이름) 텍스트박스 위치 수정
	      t3.setBounds(100,150,100,30); // (키) 텍스트박스 위치 수정 
	      t4.setBounds(100,200,100,30); // (몸무게) 텍스트박스 위치 수정
	      t5.setBounds(100,250,100,30); // (목표체중) 텍스트박스 위치 수정
	      
	      this.setResizable(false);
	      this.setVisible(true);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      Member m = new Member();
	   
	    		
	      
	      button.addActionListener(new ActionListener() {
			
	    	  
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane jo = new JOptionPane();
				
	    		
				//같은 파일을 찾기 위해서 파일변수에 입력받은 내용의 파일명을 적용
	    		File filesearch = new File(t0.getText()+yearList.getSelectedItem()+monthList.getSelectedItem()
				+dayList.getSelectedItem()+".dat");
				
				if ((t0.getText()).isEmpty()) {	// 이름
					jo.showMessageDialog(null, "이름을 입력하세요");
				}else if (
						
				(!((sizeGp.getSelection()==man.getModel())||(sizeGp.getSelection() == woman.getModel())))
						
						) {	//성별
//					System.out.println("성별");
					jo.showMessageDialog(null, "성별을 선택하세요");
				}else if (t3.getText().isEmpty()) {	//키
//					System.out.println("키");
					jo.showMessageDialog(null, "키를 입력하세요");
				}else if (t4.getText().isEmpty()) {	//체중
//					System.out.println("체중");
					jo.showMessageDialog(null, "몸무게을 입력하세요");
				}else if (t5.getText().isEmpty()) {	//목표체중
//					System.out.println("목표체중");
					jo.showMessageDialog(null, "목표체중을 입력하세요");
				}else if(filesearch.isFile()) {
					// isFile == 변수와 같은 파일명이 존재하면 true반환 없으면 false
					jo.showMessageDialog(null, "이미 가입한 사용자 입니다.");

				
				}else {	
				
				try(DataOutputStream file = new DataOutputStream(new FileOutputStream(
						t0.getText()+yearList.getSelectedItem()+monthList.getSelectedItem()
						+dayList.getSelectedItem()+".dat"))){
						
				
					
						//이름
						file.writeUTF(t0.getText());
						
						// 성별
						if(sizeGp.getSelection() == man.getModel()) {
							file.writeChar('M');
							
						}else if (sizeGp.getSelection() == woman.getModel()) {
							file.writeChar('F');	
						}
						
						// 생년월일
						file.writeUTF((String)yearList.getSelectedItem());
						file.writeUTF((String)monthList.getSelectedItem());
						file.writeUTF((String)dayList.getSelectedItem());
						
						// 키
						double height = Double.parseDouble(t3.getText());
						file.writeDouble(height);
						
						// 체중
						double weight = Double.parseDouble(t4.getText());
						file.writeDouble(weight);
						
						// 목표 체중
						double goalweight = Double.parseDouble(t5.getText());
						file.writeDouble(goalweight);

						Calendar today = new GregorianCalendar();
						
						int year =  today.get(Calendar.YEAR);
						int month = today.get(Calendar.MONTH)+1;
						int day = today.get(Calendar.DATE);
						
						
						file.writeInt(year);//시작날짜
						file.writeInt(month);//시작월
						file.writeInt(day);//시작일
					
						//목표일수
						if(sizeGp2.getSelection() == one_month.getModel()) {
							file.writeInt(30);
						}else if(sizeGp2.getSelection() == two_month.getModel()) {
							file.writeInt(60);
						}else {
							file.writeInt(90);
						}
						
						
						// 로그인접근이 아닌 회원가입후 뒤에 정보를 위한 static input값.
						m.setName((String)t0.getText());
						m.setBrithday((String)yearList.getSelectedItem()+
								(String)monthList.getSelectedItem()+
								(String)dayList.getSelectedItem());
						   file.close();


							dayView d = new dayView();
							
							JOptionPane.showMessageDialog(null, "회원가입을 축하합니다");
							dispose();
						
							
							
					}catch(FileNotFoundException ex) {
						ex.printStackTrace();
					
					}catch(IOException ex) {
						JOptionPane.showMessageDialog(null, "회원가입에 실패 하였습니다.");
					}

				Calendar today = new GregorianCalendar();
				
				SimpleDateFormat format = new SimpleDateFormat ("yyyyMMdd");
				Date time = new Date();      
				String time2 = format.format(time);
				
				
				
						try(DataOutputStream file = new DataOutputStream(new FileOutputStream(
							t0.getText()+yearList.getSelectedItem()+monthList.getSelectedItem()
							+dayList.getSelectedItem()+time2+"Food.dat"))){ 
								
								
							}catch(IOException ex) {
								ex.printStackTrace();
							}
						
						
						
						try(DataOutputStream file = new DataOutputStream(new FileOutputStream(
								t0.getText()+yearList.getSelectedItem()+monthList.getSelectedItem()
								+dayList.getSelectedItem()+time2+"Work.dat"))){ 
									
									
								}catch(IOException ex) {
									ex.printStackTrace();
								}
				
				}
			}
				
		      });
	      
		   }

	}
