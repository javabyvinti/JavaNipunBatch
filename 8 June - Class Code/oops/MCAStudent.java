package com.vinti.oops;

public class MCAStudent {
	
	private String name;
	private int rollno;
	private long phn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		
		String phnNo = String.valueOf(phn); // "65.87"
		
		if(phnNo.length() == 10)
			this.phn = phn;
		else {
			System.out.println("10 digits are allowed. Phn no not set");
		}
	}
}