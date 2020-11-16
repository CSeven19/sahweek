package cn.javareview.ssm.po;

import java.util.List;
import java.util.Map;

public class GetListOfSoftBRListResJson {
	private String page;//current page
	private int total;// total pages
	private String records;//records number
	private List <Map<String, String>>rows;//row data
	
	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public String getRecords() {
		return records;
	}


	public void setRecords(String records) {
		this.records = records;
	}


	public List<Map<String, String>> getRows() {
		return rows;
	}


	public void setRows(List<Map<String, String>> rows) {
		this.rows = rows;
	}
}
