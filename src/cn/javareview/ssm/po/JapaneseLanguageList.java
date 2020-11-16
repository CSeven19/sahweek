package cn.javareview.ssm.po;

public class JapaneseLanguageList {
int JLid,JL_difficultLevel,JL_reviewLevel,JL_pdf,JL_note,my_content;
String JL_name,JL_reviewDuration;
public int getJLid() {
	return JLid;
}
public void setJLid(int jLid) {
	JLid = jLid;
}
public int getJL_difficultLevel() {
	return JL_difficultLevel;
}
public void setJL_difficultLevel(int jL_difficultLevel) {
	JL_difficultLevel = jL_difficultLevel;
}
public int getJL_reviewLevel() {
	return JL_reviewLevel;
}
public void setJL_reviewLevel(int jL_reviewLevel) {
	JL_reviewLevel = jL_reviewLevel;
}
public int getJL_pdf() {
	return JL_pdf;
}
public void setJL_pdf(int jL_pdf) {
	JL_pdf = jL_pdf;
}
public int getJL_note() {
	return JL_note;
}
public void setJL_note(int jL_note) {
	JL_note = jL_note;
}
public int getMy_content() {
	return my_content;
}
public void setMy_content(int my_content) {
	this.my_content = my_content;
}
public String getJL_name() {
	return JL_name;
}
public void setJL_name(String jL_name) {
	JL_name = jL_name;
}
public String getJL_reviewDuration() {
	return JL_reviewDuration;
}
public void setJL_reviewDuration(String jL_reviewDuration) {
	JL_reviewDuration = jL_reviewDuration;
}

public String toString(){
	String JLList = "JL_name"+JL_name+"到手";
	return JLList;	
}
}
