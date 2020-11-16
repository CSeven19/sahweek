package cn.javareview.ssm.po;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement(name = "UserParams")
public class UserParams {
	@XmlElement(name = "id")
    private String id;
	@XmlElement(name = "name")
    private String name;
	@XmlElement(name = "Level")
    private String Level;
	@XmlElement(name = "HP")
    private String HP;
	@XmlElement(name = "EP")
    private String EP;
	@XmlElement(name = "CP")
    private String CP;
	@XmlElement(name = "tairixyoku")
    private String tairixyoku;
	@XmlElement(name = "koudourixyoku")
    private String koudourixyoku;
	@XmlElement(name = "kannsokurixyoku")
    private String kannsokurixyoku;
	@XmlElement(name = "balance")
    private String balance;
	@XmlElement(name = "exp")
    private String exp;
	@XmlElement(name = "next")
    private String next;
	@XmlElement(name = "skillsa")
    private String skillsa;
	@XmlElement(name = "skillsb")
    private String skillsb;
	@XmlElement(name = "RMB")
    private String RMB;
	@XmlElement(name = "playtime")
    private String playtime;
	@XmlElement(name = "jacket")
    private String jacket;
	@XmlElement(name = "trousers")
    private String trousers;
	@XmlElement(name = "mood")
    private String mood;
    
	
	@XmlTransient
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}


	@XmlTransient
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	@XmlTransient
	public String getLevel() {
		return Level;
	}



	public void setLevel(String level) {
		Level = level;
	}


	@XmlTransient
	public String getHP() {
		return HP;
	}



	public void setHP(String hP) {
		HP = hP;
	}


	@XmlTransient
	public String getEP() {
		return EP;
	}



	public void setEP(String eP) {
		EP = eP;
	}


	@XmlTransient
	public String getCP() {
		return CP;
	}



	public void setCP(String cP) {
		CP = cP;
	}


	@XmlTransient
	public String getTairixyoku() {
		return tairixyoku;
	}



	public void setTairixyoku(String tairixyoku) {
		this.tairixyoku = tairixyoku;
	}


	@XmlTransient
	public String getKoudourixyoku() {
		return koudourixyoku;
	}



	public void setKoudourixyoku(String koudourixyoku) {
		this.koudourixyoku = koudourixyoku;
	}

	@XmlTransient
	public String getKannsokurixyoku() {
		return kannsokurixyoku;
	}



	public void setKannsokurixyoku(String kannsokurixyoku) {
		this.kannsokurixyoku = kannsokurixyoku;
	}


	@XmlTransient
	public String getBalance() {
		return balance;
	}



	public void setBalance(String balance) {
		this.balance = balance;
	}


	@XmlTransient
	public String getExp() {
		return exp;
	}



	public void setExp(String exp) {
		this.exp = exp;
	}


	@XmlTransient
	public String getNext() {
		return next;
	}



	public void setNext(String next) {
		this.next = next;
	}


	@XmlTransient
	public String getSkillsa() {
		return skillsa;
	}



	public void setSkillsa(String skillsa) {
		this.skillsa = skillsa;
	}


	@XmlTransient
	public String getSkillsb() {
		return skillsb;
	}



	public void setSkillsb(String skillsb) {
		this.skillsb = skillsb;
	}


	@XmlTransient
	public String getRMB() {
		return RMB;
	}



	public void setRMB(String rMB) {
		RMB = rMB;
	}


	@XmlTransient
	public String getPlaytime() {
		return playtime;
	}



	public void setPlaytime(String playtime) {
		this.playtime = playtime;
	}


	@XmlTransient
	public String getJacket() {
		return jacket;
	}



	public void setJacket(String jacket) {
		this.jacket = jacket;
	}


	@XmlTransient
	public String getTrousers() {
		return trousers;
	}



	public void setTrousers(String trousers) {
		this.trousers = trousers;
	}


	@XmlTransient
	public String getMood() {
		return mood;
	}



	public void setMood(String mood) {
		this.mood = mood;
	}



	public String toString() {
        return "User [id=" + id + ", name=" + name + ", Level=" + Level + "]";
    }
}