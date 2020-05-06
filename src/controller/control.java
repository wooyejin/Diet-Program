package controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JProgressBar;

import model.vo.Member;

public class control {

	private int food;
	private int play;
	
	
	
	
	public int goalDay() {	//목표 일수를 return하기 위한 메소드
		
		
		Member m = new Member();
		
		int goalDay = 0;
	
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
		
			din.readUTF();//이름
			din.readChar();//성별
			din.readUTF();//년
			din.readUTF();//월
			din.readUTF();//일
			din.readDouble();//키
			din.readDouble();//체중
			din.readDouble();//목표체중
			din.readInt();//시작년도
			din.readInt();//시작월
			din.readInt();//시작일
	goalDay = din.readInt();//목표일수
				
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		return goalDay;
		}
	
	
	public char gender() {
		
		Member m = new Member();
	char gender = ' ';	
	
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
		
			din.readUTF();//이름
	gender =din.readChar();//성별
			din.readUTF();//년
			din.readUTF();//월
			din.readUTF();//일
			din.readDouble();//키
			din.readDouble();//체중
			din.readDouble();//목표체중
			din.readInt();//시작년도
			din.readInt();//시작월
			din.readInt();//시작일
			din.readInt();//목표일수
				
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		return gender;
		}

	public String year() {
		
		Member m = new Member();
	String year = " ";	
	
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
		
			din.readUTF();//이름
	        din.readChar();//성별
		year=din.readUTF();//년
			din.readUTF();//월
			din.readUTF();//일
			din.readDouble();
			din.readDouble();
			din.readDouble();
			din.readInt();//시작년도
			din.readInt();//시작월
			din.readInt();//시작일
			din.readInt();//목표일수

			

		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		return year;

		
		
	}
	public String month() {
		
		Member m = new Member();
		String month = " ";	
		
			try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
			
				din.readUTF();//이름
		        din.readChar();//성별
		        din.readUTF();//년
		  month=din.readUTF();//월
				din.readUTF();//일
				din.readDouble();
				din.readDouble();
				din.readDouble();
				din.readInt();//시작년도
				din.readInt();//시작월
				din.readInt();//시작일
				din.readInt();//목표일수

				
				
				
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
			return month;
		
		
	}
	public String day() {
		
		Member m = new Member();
		String day = " ";	
		
			try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
			
				din.readUTF();//이름
		        din.readChar();//성별
		        din.readUTF();//년
		        din.readUTF();//월
			day=din.readUTF();//일
				din.readDouble();
				din.readDouble();
				din.readDouble();
				din.readInt();//시작년도
				din.readInt();//시작월
				din.readInt();//시작일
				din.readInt();//목표일수

				

			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
			return day;
	}

	public double height() {
		
		
		Member m = new Member();
		
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
		
			din.readUTF();//이름
			din.readChar();//성별
			din.readUTF();//년
			din.readUTF();//월
			din.readUTF();//일
double height = din.readDouble();//키
			din.readDouble();//체중
			din.readDouble();//목표체중
			din.readInt();//시작년도
			din.readInt();//시작월
			din.readInt();//시작일
			din.readInt();//목표일수
			
			
			
			
			return height;
		
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		
		return 0;
	}

	public double weight() {
		
	Member m = new Member();
		
	double  weight = 0;
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
			
			din.readUTF();//이름
			din.readChar();//성별
			din.readUTF();//년
			din.readUTF();//월
			din.readUTF();//일
			din.readDouble();//키
   weight = din.readDouble();//체중
			din.readDouble();//목표체중
			din.readInt();//시작년도
			din.readInt();//시작월
			din.readInt();//시작일
			din.readInt();//목표일수
			
		
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		
		return weight;
		
	}

	public double goalweight() {
		
		
		Member m = new Member();
			
		double  goalweight = 0;
			try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
				
				din.readUTF();//이름
				din.readChar();//성별
				din.readUTF();//년
				din.readUTF();//월
				din.readUTF();//일	
				din.readDouble();//키
				din.readDouble();//체중
   goalweight = din.readDouble();//목표체중
			   din.readInt();//시작년도
				din.readInt();//시작월
				din.readInt();//시작일
				din.readInt();//목표일수
				
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
			return goalweight;
		
	}

	public String BMI() {
		
		
		Member m = new Member();
			
		double  weight = 0;
		double height = 0;
		double BMI = 0;
		String result = " ";
				
		height=	height();
		weight= weight();

			
	    BMI = weight/((height/100)*(height/100));		
			
	    if(BMI<20) { // BMI
	    	result = "저체중";
	    }else if(BMI<25) {
	    	result = "정상";
	    }else if(BMI<30) {
	    	result = "과체중";
	    }else {
	    	result = "비만";
	    }
		return result;
	}

//	시작년
	public int startyear() {
		
		Member m = new Member();
		
		int year = 0;
		
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
				
				din.readUTF();//이름
				din.readChar();//성별
				din.readUTF();//년
				din.readUTF();//월
				din.readUTF();//일	
				din.readDouble();//키
				din.readDouble();//체중
				din.readDouble();//목표체중
	   year=    din.readInt();//시작년도
	   			din.readInt();//시작월
				din.readInt();//시작일
				din.readInt();//목표일수
				
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		
		return year;
		
	}
//	시작월
	public int startmonth() {
		
		Member m = new Member();
		
		int month = 0;
		
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
				
				din.readUTF();//이름
				din.readChar();//성별
				din.readUTF();//년
				din.readUTF();//월
				din.readUTF();//일	
				din.readDouble();//키
				din.readDouble();//체중
				din.readDouble();//목표체중
				din.readInt();//시작년도
		month=	din.readInt();//시작월
				din.readInt();//시작일
				din.readInt();//목표일수

			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		
		return month;
		
	}
	
	//시작일
	public int startday() {
		
		Member m = new Member();
		
		int startday = 0;
		
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
				
				din.readUTF();//이름
				din.readChar();//성별
				din.readUTF();//년
				din.readUTF();//월
				din.readUTF();//일	
				din.readDouble();//키
				din.readDouble();//체중
				din.readDouble();//목표체중
				din.readInt();//시작년도
				din.readInt();//시작월
	    startday=din.readInt();//시작일
				din.readInt();//목표일수

	   
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
		return startday;
	}
	//목표일수
	public int Dday() {
		
		Member m = new Member();
		
		int Dday = 0;
		
		try(DataInputStream din = new DataInputStream(new FileInputStream(m.getName()+m.getBrithday()+".dat"))){
				
				din.readUTF();//이름
				din.readChar();//성별
				din.readUTF();//년
				din.readUTF();//월
				din.readUTF();//일	
				din.readDouble();//키
				din.readDouble();//체중
				din.readDouble();//목표체중
				din.readInt();//시작년도
				din.readInt();//시작월
				din.readInt();//시작일
		   Dday=din.readInt();//목표일수
	   
	   
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			
		return Dday;
	}
	
	public int age() {
		//	생년월일으로 나이 계산하는 메소드
		
		
		Calendar current = Calendar.getInstance();
        int currentYear  = current.get(Calendar.YEAR);
        int currentMonth = current.get(Calendar.MONTH) + 1;
        int currentDay   = current.get(Calendar.DAY_OF_MONTH);
       
        int age = currentYear - Integer.parseInt(year());
        // 생일 안 지난 경우 -1
        if (Integer.parseInt(month()) * 100 + Integer.parseInt(day()) > currentMonth * 100 + currentDay)  
            age--;
        
		return age;
	}
	
	public double metabolism() {
		// 기초 대사량 계산 메소드 체중, 키, 나이를 받는다.
		// http://u-health.dobong.go.kr/hcal/metabolism.asp 산출식 참조
		double meta = 0;
		
		if(gender()=='M') {
			meta = 66.47+(13.75*weight())+(5*height())
					-(6.76*age());
		}else if(gender()=='F') {
			meta = 65.51+(9.56*weight())+(1.85*height())
					-(4.68*age());	
		}
		
		return meta;
	}
	
	public double goalCal() {
		// 하루 달성량day에 todayAchiev 을 위한 계산기 page3 달성량 막대바
		// 하루 온전히 소모해야하는 칼로리 총량 = ((현재체중 - 목표체중)*7000 / 목표일수) - 하루기초대사량
		// 7000Cal은 1kg당 낼 수 있는 열량.
		double todayAchiev = 0;
		
		todayAchiev = (
				((weight()-goalweight())*7000)/
						goalDay() - metabolism()
				);
		return todayAchiev;
	}
	
	public int goalScore() {
		// page5에 넣고싶은 점수를 리턴하는 계산기.
		// 현재까지 누적된 total 달성량 / 현재일까지 합산된 total 목표량 *100
		int score=0;
//		score = (int)(td.getTotalAchiev()/td.getTodayGoal()*td.getCount()*100);
		
		return score;
	}
	
	public void inputFoodCalorie(int result) {	
		// Food에서 받은 최종 result값을 저장 하기위한 메소드. Food에서 저장을 누르면 저장. 
		// dayview에서 달성률을 보여주기 위해 사용
		
		control co  = new control();
		Member m = new Member();
		Calendar today = new GregorianCalendar();
		
		String year =String.valueOf(today.get(Calendar.YEAR));
		String day = String.valueOf(today.get(Calendar.DATE));
		String month = String.valueOf(today.get(Calendar.MONTH)+1);
		
		String today1 = year+month+day;
		
		String startyear = String.valueOf(co.startyear());
		String startmonth = String.valueOf(co.startmonth());
		String startday = String.valueOf(co.startday());
		
		String start = startyear+startmonth+startday;
		
		if(start.equals(today1)) {
			
			try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(
					m.getName()+m.getBrithday()+start+"Food.dat",true))){
				
				dout.writeInt(result);
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			}else {
				try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(
						m.getName()+m.getBrithday()+today1+"Food.dat",true))){
							
					dout.writeInt(result);
					
				}catch(IOException ex) {
						ex.printStackTrace();
				}
		}
	}
	public int outFoodCalorie() {
		// 저장된 Food Cal를 불러와서 달성률에 사용하는 메소드
		
		Member m = new Member();
		Calendar today = new GregorianCalendar();
		
		String year =String.valueOf(today.get(Calendar.YEAR));
		String day = String.valueOf(today.get(Calendar.DATE));
		String month = String.valueOf(today.get(Calendar.MONTH)+1);
		
		String today1 = year+month+day;
		
		// 넘어온 데이터들을 더해줄 값
		int sum = 0;
		// 받아줄 공간
		int food = 0;
		
		try (DataInputStream dis = new DataInputStream
				(new FileInputStream(m.getName()+m.getBrithday()+today1+"Food.dat"))) {
			
			while (true) {
				food = dis.readInt();
				sum += food;
				food = 0;
			}
			
		}catch (FileNotFoundException ex) {

		}catch (EOFException ex) {
//			System.out.println("저장파일 읽기 완료");
		}catch (IOException ioe) {
			ioe.printStackTrace();
//			System.out.println("IOException 걸렸다.");
		}
		
		return sum;
	}

	public void inputPlayCalorie(int result) {
		// Food에서 받은 최종 result값을 저장 하기위한 메소드. Food에서 저장을 누르면 저장. 
		// dayview에서 달성률을 보여주기 위해 사용
				
		
		Member m = new Member();
		Calendar today = new GregorianCalendar();
				
		String year =String.valueOf(today.get(Calendar.YEAR));
		String day = String.valueOf(today.get(Calendar.DATE));
		String month = String.valueOf(today.get(Calendar.MONTH)+1);
				
		String today1 = year+month+day;
				
		
		// co 추가해야될수도있음 지움 TODO
		String startyear = String.valueOf(startyear());
		String startmonth = String.valueOf(startmonth());
		String startday = String.valueOf(startday());
				
		String start = startyear+startmonth+startday;
				
				
		if(start.equals(today1)) {	// result를 축척하여 저장.
			
			try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(
							m.getName()+m.getBrithday()+start+"Work.dat",true))){
				
				dout.writeInt(result);
				
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			
					}else {
						
						try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(
								m.getName()+m.getBrithday()+today1+"Work.dat",true))){
							
							dout.writeInt(result);
							
						}catch(IOException ex) {
								ex.printStackTrace();
						}
						
				}
				
			}

	public int outPlayCalorie() {
		// 저장된 play Cal를 불러와서 달성률에 사용하는 메소드
		
		Member m = new Member();
		Calendar today = new GregorianCalendar();
		
		String year =String.valueOf(today.get(Calendar.YEAR));
		String day = String.valueOf(today.get(Calendar.DATE));
		String month = String.valueOf(today.get(Calendar.MONTH)+1);
		
		String today1 = year+month+day;
		
		
		int play = 0;
		
		int sum = 0;
		
		try (DataInputStream dis = new DataInputStream
				(new FileInputStream(m.getName()+m.getBrithday()+today1+"Work.dat"))) {
			
			while (true) {
				play = dis.readInt();
				sum += play;
				play = 0;
			}
			
			
		}catch (FileNotFoundException ex) {
	
		}catch (EOFException ex) {
//			System.out.println("저장파일 읽기 완료");
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return sum;
	}
	
	public int progress_add() {
		//progressbar를 위한 계산메소드
		// 하루에 달성해야할 칼로리
		control co = new control();
		
		double goalCal1 = co.goalCal();
		int goalCal2 = (int)goalCal1;
		
		// 하루동안 먹은 양
		int food = outFoodCalorie();
		// 하루 동안 한 운동량
		int play = outPlayCalorie();
		
		// probar에 표현할 나타낼 크기.
		int result = 0;
		
		if (play > (goalCal2+food)) {
			result = 100;
		}else {
			double progress = play/(goalCal1+food)*100;
			result = (int)progress;
		}
		
		
		return result;
	}
	
	public int difday() {
		
	Member m = new Member();
	
	dayChange d = new dayChange();
	
	Calendar today = new GregorianCalendar();
	
	int count = -1;
	while(true) {
		
	File file = new File(m.getName()+m.getBrithday()+d.difday(count)+"Food.dat");
	
	if(file.isFile()) {
		 break;
	}else{
		count--;
		if(count == -50) {
			break;
			}
		}
	}
	return count*-1;
	}
	
}
