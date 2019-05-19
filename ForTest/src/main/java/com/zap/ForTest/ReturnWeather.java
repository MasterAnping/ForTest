package com.zap.ForTest;

import java.util.ArrayList;
import java.util.List;

public class ReturnWeather {
	
	 private String returnCode;
	 private String returnMessage;
	 private String takeTime;
	 private List<Weather> DS = new ArrayList<Weather>();
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public String getTakeTime() {
		return takeTime;
	}
	public void setTakeTime(String takeTime) {
		this.takeTime = takeTime;
	}
	public List<Weather> getDS() {
		return DS;
	}
	public void setDS(List<Weather> dS) {
		DS = dS;
	}
	
	 
	 

}
