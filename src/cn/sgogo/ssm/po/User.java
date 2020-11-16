package cn.sgogo.ssm.po;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement(name = "UserParams")
public class User {
	@XmlElement(name = "userid")
    private String userid;
	@XmlElement(name = "name")
    private String name;
	@XmlElement(name = "password")
    private String password;
	
	
    
	@XmlTransient
	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@XmlTransient
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	@XmlTransient
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
        return "User [userid=" + userid + ", name=" + name + ", password=" + password + "]";
    }
}