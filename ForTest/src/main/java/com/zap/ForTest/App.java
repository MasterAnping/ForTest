package com.zap.ForTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import cma.cimiss.client.DataQueryClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String beginTime = "20190517000000";
    	String endTime = "20190517000000";
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    	try {
			long beginTime2 = (long) (sdf.parse(beginTime).getTime() + 9 * 60 * 60 * 1000);
			long endTime2 =  (long) (sdf.parse(endTime).getTime() + 8 * 60 * 60 * 1000);
			sdf.format(new Date(beginTime2));
			sdf.format(new Date(endTime2));
			System.out.println(sdf.format(new Date(beginTime2)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	HashMap<String, String> params = new HashMap<String, String>();
    	String interfaceId = "statSurfPreInRegion";
		params.put("elements", "Station_Name,Station_ID_C");
		params.put("timeRange", "[20190517000000,20190517010000]"); 
		params.put("adminCodes", "361124");
		params.put("orderby", "SUM_PRE_1H:DESC") ; 
		ThreadWeather threadWeather =new ThreadWeather(new DataQueryClient(), interfaceId, params);
		Thread t1 = new Thread(threadWeather, "窗口1");
		
		HashMap<String, String> params2 = new HashMap<String, String>();
    	String interfaceId2 = "statSurfEleInRegion";
		params2.put("dataCode", "SURF_CHN_PRE_MIN"); 
		params2.put("elements", "Station_Name,Station_ID_C");
		params2.put("timeRange", "[20190517002000,20190517010000]"); 
		params2.put("adminCodes", "361124");
		params2.put("statEles", "SUM_PRE");	
		params2.put("orderby", "SUM_PRE:DESC") ; 
		ThreadWeather threadWeather2 =new ThreadWeather(new DataQueryClient(), interfaceId2, params2);
		Thread t2 = new Thread(threadWeather2, "窗口2");
		t1.start();
		t2.start();
		
		}
}
