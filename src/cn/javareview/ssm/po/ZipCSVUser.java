package cn.javareview.ssm.po;

public class ZipCSVUser {
	String name;
	String number;
	String wavFilePath;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getWavFilePath() {
		return wavFilePath;
	}
	public void setWavFilePath(String wavFilePath) {
		this.wavFilePath = wavFilePath;
	}
	public String toString(){
		return "my name is "+name+";my number is "+number;
	}
}
