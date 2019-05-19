package com.zap.ForTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hg.xdoc.XDocService;

import cma.cimiss.client.DataQueryClient;


public class AppTest{
	
	private DataQueryClient client;
	private String userId;
	private String pwd;
	private String interfaceId;
	private HashMap<String, String> params = new HashMap<String, String>();
	private String dataFormat;
	StringBuffer retStr = new StringBuffer();
	
	@Before
	public void init() {
		client = new DataQueryClient();
		userId = "BENC_QXT_zdz";
		pwd = "forefore";
		dataFormat = "json";
	}
	
	@Test
	public void townrain() {
		interfaceId = "statSurfPreInRegion";
		//params.put("dataCode", "SURF_CHN_MUL_HOR"); // 资料代码
		params.put("elements", "Station_Name,Station_ID_C");// 检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		params.put("timeRange", "[20190516010000,20190517000000]"); // 检索时间
		params.put("adminCodes", "361124");
		//params.put("eleValueRanges", "SUM_PRE_1H:0,3,4");
		// 可选参数
		params.put("orderby", "SUM_PRE_1H:DESC") ; //排序：按照站号从小到大
		// params.put("limitCnt", "10") ; //返回最多记录数：10
		try {
			// 初始化接口服务连接资源
			client.initResources();
			// 调用接口
			int rst = client.callAPI_to_serializedStr(userId, pwd, interfaceId, params, dataFormat, retStr);
			// 输出结果
			if (rst == 0) { // 正常返回
				System.out.println(retStr.toString());
				Gson gson =new GsonBuilder().create();
				ReturnWeather returnWeather = gson.fromJson(retStr.toString(), ReturnWeather.class);
				System.out.println(returnWeather.getReturnMessage());
				System.out.println(returnWeather.getDS());
			} else { // 异常返回
				System.out.println("[error] StaElemSearchAPI_CLIB_callAPI_to_array2D.");
				System.out.printf("\treturn code: %d. \n", rst);
				System.out.printf("\terror message: %s.\n", retStr);
			}
		} catch (Exception e) {
			// 异常输出
			e.printStackTrace();
		} finally {
			// 释放接口服务连接资源
			client.destroyResources();
		}
	}
	
	@Test
	public void townrain2() {
		interfaceId = "statSurfEleInRegion";
		params.put("dataCode", "SURF_CHN_PRE_MIN"); // 资料代码
		params.put("elements", "Station_Name,Station_ID_C");// 检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		params.put("timeRange", "[20190517000000,20190517010000]"); // 检索时间
		params.put("adminCodes", "361124");
		params.put("statEles", "SUM_PRE");	
		params.put("eleValueRanges", "PRE:(,9999)");
		// 可选参数
		params.put("orderby", "SUM_PRE:DESC") ; //排序：按照站号从小到大
		// params.put("limitCnt", "10") ; //返回最多记录数：10

		try {
			// 初始化接口服务连接资源
			client.initResources();
			// 调用接口
			int rst = client.callAPI_to_serializedStr(userId, pwd, interfaceId, params, dataFormat, retStr);
			// 输出结果
			if (rst == 0) { // 正常返回
				System.out.println(retStr.toString());
			} else { // 异常返回
				System.out.println("[error] StaElemSearchAPI_CLIB_callAPI_to_array2D.");
				System.out.printf("\treturn code: %d. \n", rst);
				System.out.printf("\terror message: %s.\n", retStr);
			}
		} catch (Exception e) {
			// 异常输出
			e.printStackTrace();
		} finally {
			// 释放接口服务连接资源
			client.destroyResources();
		}
	}
	
	@Test
	public void townrain3() {
		interfaceId = "statSurfEleInRegion";
		params.put("dataCode", "SURF_CHN_PRE_MIN"); // 资料代码
		params.put("elements", "Station_Name,Station_ID_C");// 检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		params.put("timeRange", "[20190517000000,20190517010000]"); // 检索时间
		params.put("adminCodes", "361124");
		params.put("statEles", "SUM_PRE");	
		//params.put("eleValueRanges", "SUM_PRE_1H:0,3,4");
		// 可选参数
		params.put("orderby", "SUM_PRE:DESC") ; //排序：按照站号从小到大
		// params.put("limitCnt", "10") ; //返回最多记录数：10

		try {
			// 初始化接口服务连接资源
			client.initResources();
			// 调用接口
			int rst = client.callAPI_to_serializedStr(userId, pwd, interfaceId, params, dataFormat, retStr);
			// 输出结果
			if (rst == 0) { // 正常返回
				System.out.println(retStr.toString());
			} else { // 异常返回
				System.out.println("[error] StaElemSearchAPI_CLIB_callAPI_to_array2D.");
				System.out.printf("\treturn code: %d. \n", rst);
				System.out.printf("\terror message: %s.\n", retStr);
			}
		} catch (Exception e) {
			// 异常输出
			e.printStackTrace();
		} finally {
			// 释放接口服务连接资源
			client.destroyResources();
		}
	}
	
	@Test
	public void townrain4() {
		HashMap<String, String> params2 = new HashMap<String, String>();
		interfaceId = "statSurfEleInRegion";
		params.put("dataCode", "SURF_CHN_PRE_MIN"); // 资料代码
		params.put("elements", "Station_Name,Station_ID_C");// 检索要素：站号、站名、小时降水、气压、相对湿度、能见度、2分钟平均风速、2分钟风向
		params.put("timeRange", "[20190517000000,20190517010000]"); // 检索时间
		params.put("adminCodes", "361124");
		params.put("statEles", "SUM_PRE");	
		//params.put("eleValueRanges", "SUM_PRE_1H:0,3,4");
		// 可选参数
		params.put("orderby", "SUM_PRE:DESC") ; //排序：按照站号从小到大
		// params.put("limitCnt", "10") ; //返回最多记录数：10
		ThreadWeather threadWeather =new ThreadWeather(client, interfaceId, params2);
		Thread t1 = new Thread(threadWeather, "窗口1");
		t1.start();
		//threadWeather.run();
		}
  
    @Test
    public void AppTest( )
    {
    	XDocService xdocService = new XDocService("http://www.xdocin.com", "");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("公司名称", "北京小米科技有限责任公司");
		param.put("外文名称", "MI");
		param.put("总部地点", "北京市海淀区清河中街68号");
		param.put("成立时间", 2010);
		param.put("徽标", "http://www.xdocin.com/demo/xiaomi.gif");
		param.put("公司口号", "探索黑科技，小米为发烧而生");
		param.put("年营业额", 780);
		param.put("员工数", 14000);
		param.put("CEO", "雷军");
		try {
			xdocService.run("C:/Users/Administrator/Downloads/card.docx",//模板文件
					param,
					new File("d:/XDocResult2.docx"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    
}
