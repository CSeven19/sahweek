package cn.sgogo.ssm.po;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement(name = "UserParams")
public class Schedule {
	@XmlElement(name = "scheduleid")
    private String scheduleid;
	@XmlElement(name = "content")
    private String content;
	@XmlElement(name = "level")
    private String level;
	@XmlElement(name = "completed")
	private String completed;
	@XmlElement(name = "logindate")
	private String logindate;
	@XmlElement(name = "completeddate")
	private String completeddate;
	
	
    
	@XmlTransient
	public String getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}
	@XmlTransient
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@XmlTransient
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@XmlTransient
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	@XmlTransient
	public String toString() {
        return "Schedule [scheduleid=" + scheduleid + ", level=" + level + ", content=" + content + "]";
    }
	public String getLogindate() {
		return logindate;
	}
	@XmlTransient
	public void setLogindate(String logindate) {
		this.logindate = logindate;
	}
	public String getCompleteddate() {
		return completeddate;
	}
	public void setCompleteddate(String completeddate) {
		this.completeddate = completeddate;
	}
}