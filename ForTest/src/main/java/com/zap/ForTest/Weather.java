package com.zap.ForTest;

public class Weather {
	
	private String Station_ID_C;
	private String Station_Name;
	private String SUM_PRE_1H;
	public String getStation_ID_C() {
		return Station_ID_C;
	}
	public void setStation_ID_C(String station_ID_C) {
		Station_ID_C = station_ID_C;
	}
	public String getStation_Name() {
		return Station_Name;
	}
	public void setStation_Name(String station_Name) {
		Station_Name = station_Name;
	}
	public String getSUM_PRE_1H() {
		return SUM_PRE_1H;
	}
	public void setSUM_PRE_1H(String sUM_PRE_1H) {
		SUM_PRE_1H = sUM_PRE_1H;
	}
	@Override
	public String toString() {
		return "Weather [Station_ID_C=" + Station_ID_C + ", Station_Name=" + Station_Name + ", SUM_PRE_1H=" + SUM_PRE_1H
				+ "]";
	}
	
	
	

}
