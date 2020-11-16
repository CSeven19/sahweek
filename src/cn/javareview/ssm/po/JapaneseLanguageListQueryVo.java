package cn.javareview.ssm.po;

import java.util.List;

public class JapaneseLanguageListQueryVo {
	private JapaneseLanguageList japaneseLanguageList;
	private List<JapaneseLanguageList> ListJapaneseLanguageList;

	

	public JapaneseLanguageList getJapaneseLanguageList() {
		return japaneseLanguageList;
	}



	public void setJapaneseLanguageList(JapaneseLanguageList japaneseLanguageList) {
		this.japaneseLanguageList = japaneseLanguageList;
	}



	public List<JapaneseLanguageList> getListJapaneseLanguageList() {
		return ListJapaneseLanguageList;
	}



	public void setListJapaneseLanguageList(
			List<JapaneseLanguageList> listJapaneseLanguageList) {
		ListJapaneseLanguageList = listJapaneseLanguageList;
	}



	public String toString(){
		String JapaneseLanguageList="get List of JapaneseLanguageList"+ListJapaneseLanguageList;
		return JapaneseLanguageList;
	}
}
