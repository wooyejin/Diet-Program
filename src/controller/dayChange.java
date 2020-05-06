package controller;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.stream.events.StartDocument;

import model.vo.Member;

public class dayChange {

		
// 디데이 구하기
	public long Dday() {
		
// 시작날짜를 구해서 목표일수를 더하는 코드	
		control co = new control();
		
		Calendar today = new GregorianCalendar();
		Date date = null;
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		String startyear = String.valueOf(co.startyear());
		String startmonth = String.valueOf(co.startmonth());
		String startday = String.valueOf(co.startday());
		
		String startyday = startyear+startmonth+startday;
		
		try {
			date = dateFormat.parse(startyday);
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,co.Dday());
		
		String strDate = dateFormat.format(cal.getTime());
//		여기 까지가 시작날짜 + 목표일수 날짜 구하는식	
		
//		시작날짜에서 당일날짜를 빼가지고 디데이를 구하는 코드
	
		
		String year = String.valueOf(today.get(Calendar.YEAR)); 
		String month = String.valueOf(today.get(Calendar.MONTH)+1); 
		String day = String.valueOf(today.get(Calendar.DATE)); 
		
		String start = year+month+day;//당일날짜
		String end = strDate; //시작날짜 + 목표일수
		
		long diffDays = 0;
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			Date beginDate = format.parse(start);
			Date endDate = format.parse(end);
			
			long diff = endDate.getTime() - beginDate.getTime();
			diffDays = diff/(24*60*60*1000);
			
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		return diffDays;
	}
	
	public String difday(int count) {
		
		Calendar today = new GregorianCalendar();
		
		control co = new control();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		Date date = null;
		
		String year = String.valueOf(today.get(Calendar.YEAR)); 
		String month = String.valueOf(today.get(Calendar.MONTH)+1); 
		String day = String.valueOf(today.get(Calendar.DATE)); 

		String start = year+month+day;
		
		try {
			date = dateFormat.parse(start);
			
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,count);
		
		String strDate = dateFormat.format(cal.getTime());
		return strDate;
		
	}
	
	
		
	}
	
	
