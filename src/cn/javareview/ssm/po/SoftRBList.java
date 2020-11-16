package cn.javareview.ssm.po;

public class SoftRBList {
int BRid,BR_difficultLevel,BR_reviewLevel,BR_pdf,BR_note,BR_softApplication,my_content;
String BR_name,BR_reviewDuration;

public int getBRid() {
	return BRid;
}
public void setBRid(int bRid) {
	BRid = bRid;
}
public int getBR_difficultLevel() {
	return BR_difficultLevel;
}
public void setBR_difficultLevel(int bR_difficultLevel) {
	BR_difficultLevel = bR_difficultLevel;
}
public int getBR_reviewLevel() {
	return BR_reviewLevel;
}
public void setBR_reviewLevel(int bR_reviewLevel) {
	BR_reviewLevel = bR_reviewLevel;
}
public int getBR_pdf() {
	return BR_pdf;
}
public void setBR_pdf(int bR_pdf) {
	BR_pdf = bR_pdf;
}
public int getBR_note() {
	return BR_note;
}
public void setBR_note(int bR_note) {
	BR_note = bR_note;
}
public int getBR_softApplication() {
	return BR_softApplication;
}
public void setBR_softApplication(int bR_softApplication) {
	BR_softApplication = bR_softApplication;
}
public int getMy_content() {
	return my_content;
}
public void setMy_content(int my_content) {
	this.my_content = my_content;
}
public String getBR_name() {
	return BR_name;
}
public void setBR_name(String bR_name) {
	BR_name = bR_name;
}
public String getBR_reviewDuration() {
	return BR_reviewDuration;
}
public void setBR_reviewDuration(String bR_reviewDuration) {
	BR_reviewDuration = bR_reviewDuration;
}

public String toString(){
	String softRBList = "BR_name"+BR_name+"到手";
	return softRBList;	
}
}
