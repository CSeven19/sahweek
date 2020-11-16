package cn.javareview.ssm.po;

import java.util.List;

public class SoftRBListQueryVo {
//	private SoftRBList softRBList;
	private List<SoftRBList> ListsoftRBList;
	
	
//	public SoftRBList getSoftRBList() {
//		return softRBList;
//	}
//
//
//	public void setSoftRBList(SoftRBList softRBList) {
//		this.softRBList = softRBList;
//	}


	public List<SoftRBList> getListsoftRBList() {
		return ListsoftRBList;
	}


	public void setListsoftRBList(List<SoftRBList> listsoftRBList) {
		ListsoftRBList = listsoftRBList;
	}


	public String toString(){
		String softList="get List of softRBList"+ListsoftRBList;
		return softList;
	}
}
