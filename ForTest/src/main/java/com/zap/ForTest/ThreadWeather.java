package com.zap.ForTest;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cma.cimiss.client.DataQueryClient;

public class ThreadWeather extends BaseThreadWeather {

	private DataQueryClient client = new DataQueryClient();
	private String interfaceId;
	private HashMap<String, String> params;
	private String dataFormat = "json";
	private StringBuffer retStr = new StringBuffer();

	public ThreadWeather(DataQueryClient client, String interfaceId,HashMap<String, String> params) {
		super();
		this.client = client;
		this.interfaceId = interfaceId;
		this.params =params;
	}

	public void query(){
		try {
			System.out.println("1");
			client.initResources();
			System.out.println("2");
			int rst = client.callAPI_to_serializedStr(getUserId(), getPwd(), interfaceId, params, dataFormat, retStr);
			System.out.println(retStr.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		System.out.println("kaishi");
		query();
	}

}
