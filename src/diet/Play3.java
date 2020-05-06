package diet;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import controller.control;

public class Play3 extends JFrame{
	
	private int result;
	
	public Play3() {
		
	 this.setLayout(null);
     
     this.setBounds(100,100,400,600);
     
     // 수정(자리조절)
     String[] foodNames = {"걷기 ","달리기 ","축구 ","경보 ","배드민턴 ",
           "수영 ","춤추기 ","농구 ","암벽 ","훌라후프 ",
           "볼링 ","스쿼시 ","요가 ","청소 ","에어로빅 ",
           "골프 ","줄넘기 ","피구 ","유도 ","스케이트 ",
           "점프 ","숨쉬기 ","탁구 ","검도 ","필라테스 ",
           "런지 ","스피닝 ","스키 ","조깅 ","스트레칭 ",
           "승마 ","태권도 ","배구 ","숨쉬기","테너스 ",
           "유도 ","킥복싱 ","야구 ","자전거","스쿼트 "};
           

     
     JCheckBox[] boxes = new JCheckBox[40];
  
     for(int i=0; i<boxes.length; i++) {
        boxes[i] = new JCheckBox(foodNames[i]);
        boxes[i].setOpaque(false);
        // 수정(체크박스 폰트) 
        boxes[i].setFont(new Font("휴먼모음T",Font.PLAIN,14));
        
     }
     //패널1
     JPanel pan = new JPanel();
     pan.setBounds(15,20,360,275);
     pan.setBackground(Color.LIGHT_GRAY);
     
     for(int i=0; i<boxes.length; i++) {
        pan.add(boxes[i]);
     }
     
     // 수정(글씨체변경)
     Border border = BorderFactory.createTitledBorder(null,"운동선택", TitledBorder.LEFT, TitledBorder.TOP, new Font("휴먼모음T",Font.BOLD,15));
     
     pan.setBorder(border);
     pan.setOpaque(false);
        
     JButton button = new JButton(new ImageIcon("images/button/save.jpg"));
     button.setLocation(50,500);
	 button.setSize(100,40);
  
     JButton button2 = new JButton(new ImageIcon("images/button/back.jpg"));
     button2.setLocation(250,500);
	 button2.setSize(100,40);
     
     
     int[] PlayKcal = {
    		 100,200,300,400,500,
    		 150,250,350,450,550,
    		 250,350,450,550,650,
    		 750,200,120,135,158,
    		 340,320,280,190,150,
    		 360,70,80,150,240,
    		 123,310,95,50,43,
    		 160,180,240,320,100
     };
     
   
     
     JLabel lb = new JLabel("");   
     lb.setLocation(240,310);
	 lb.setSize(200,50);
	 lb.setFont(new Font("고딕체",Font.BOLD,17));
     
     
     for (int i = 0; i < boxes.length; i++) {
		boxes[i].addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				 result = 0;
				int count = 0; 
				
				for (int j = 0; j < boxes.length; j++) {
					if(boxes[j].isSelected()) {
						result += PlayKcal[j];
						count++;
					}
					
					lb.setText(result + "" + "Kcal");
				}
				
				if(count == 0) {
					lb.setText("");
				}
			}
		});				
	}
     
     getContentPane().add(pan,"Center");
     
     this.setContentPane(new JLabel(new ImageIcon("images/play.jpg")));
	 this.setSize(400,600);
  
     this.add(button);
     this.add(lb);
     this.add(pan);
     this.add(button2);
     
     this.setResizable(false);
     this.setVisible(true);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control co = new control();
				
				co.inputPlayCalorie(result);
				
				JOptionPane jo = new JOptionPane();
				
				jo.showMessageDialog(null, "저장 하였습니다");
				
				dayView d = new dayView();
				
				dispose();
				
			}
		});
     
     
     button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				dayView d = new dayView();
				
				dispose();
				
			}
		});
  }

}
