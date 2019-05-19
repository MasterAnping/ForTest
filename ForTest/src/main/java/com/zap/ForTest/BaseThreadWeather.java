package com.zap.ForTest;

import java.util.HashMap;

import cma.cimiss.client.DataQueryClient;

public class BaseThreadWeather implements Runnable{

	private String userId = "BENC_QXT_zdz";
	private String pwd = "forefore";

	public BaseThreadWeather() {
		
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void run() {
		
	}

}
