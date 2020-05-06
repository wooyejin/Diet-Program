package model.vo;

import java.io.Serializable;

public class Member implements Serializable {

	public static String name;
	public static String brithday;
	

	public Member() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	
}
