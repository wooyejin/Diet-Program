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

public class Food extends JFrame{

	private int result;
	
	public Food(){
			
			this.setLayout(null);
			
			this.setBounds(100,100,400,600);
			
			// 수정(자리조절)
			String[] foodNames = {"떡볶이 ","비빔밥 ","신라면 ","불고기 ","피자 ",
			"사이다 ","설렁탕 ","자장면 ","탕수육 ","짬뽕 ",
			"돌솥밥 ","칼국수 ","물냉면 ","김말이 ","순대 ",
			"만두국 ","삼겹살 ","감자전 ","동치미 ","게장 ",
			"현미밥 ","흰쌀밥 ","보리밥 ","씨리얼 ","콜라 ",
			"바나나 ","복숭아 ","오렌지 ","토마토 ","사과 ",
			"바게트 ","모닝빵 ","모카빵 ","베이글 ","우유 ",
			"고래밥 ","새우깡 ","초콜릿 ","홈런볼 ","팝콘 "};

			
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
			 pan.setOpaque(false);

			
			for(int i=0; i<boxes.length; i++) {
				pan.add(boxes[i]);
			}
			
			// 수정(글씨체변경)
			Border border = BorderFactory.createTitledBorder(null,"음식선택", TitledBorder.LEFT, TitledBorder.TOP, new Font("휴먼모음T",Font.BOLD,15));
			pan.setBorder(border);
				
			JButton button = new JButton(new ImageIcon("images/button/save.jpg"));
			button.setLocation(50,500);
			button.setSize(100,40);
			
			JButton button2 = new JButton(new ImageIcon("images/button/back.jpg"));
			button2.setLocation(250,500);
		    button2.setSize(100,40);
			
			
			JLabel lb = new JLabel("");
			lb.setLocation(240,310);
			lb.setSize(200,50);
			lb.setFont(new Font("고딕체",Font.BOLD,17));
			
			
			int[] foodKcal = {480,525,526,50,250,
					100,240,537,340,510,
					375,500,450,90,520,
					400,200,150,22,78,
					321,300,290,350,89,
					93,91,131,17,98,
					768,98,484,200,120,
					222,440,520,250,109};
			
			for(int i=0;i<boxes.length;i++) {
				
				boxes[i].addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent e) {
						
						 result = 0;
						
						String food = "";
						
						int count = 0; 
						
						for(int j=0;j<boxes.length;j++) {
							if(boxes[j].isSelected()) {
								result += foodKcal[j];
								food += foodKcal[j] + " + ";
								count++;
							}
							
							lb.setText(result + "" +"kcal");
						}
						
						if(count == 0) {
							lb.setText("__________");
						}
					}
				});
			}
			
			getContentPane().add(pan,"Center");
		
			this.setContentPane(new JLabel(new ImageIcon("images/food.jpg")));
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
				
				co.inputFoodCalorie(result);
				
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

	
	
