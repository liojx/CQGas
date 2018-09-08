package com.cqgas.tools.util;

import java.io.File;
import java.io.IOException;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;


public class PropertiesUtil {
	private static final Logger logs = Logger.getLogger(PropertiesUtil.class);
	private static Properties p;
	private static Map filesmap;
	
	static {
		initProperties();
	//	initTemplateMap();
	}
	public static Map initTemplateMap(){
		filesmap = new HashMap();
		//String templatePath = p.getProperty("MessageDefaultAdapter.MessageTemplate.Path");
		//String classPath = Thread.currentThread().getContextClassLoader().getResource("requestXML/IVR_MSG_1").getPath().replaceAll("%20", " ");
		//String templateFullPath = (new StringBuilder(String.valueOf(templatePath))).append("IVR_MSG_1").toString();
		//System.out.println(classPath+templateFullPath);
		String classPath  = System.getProperty("user.dir")+File.separator+"IVR_MSG_1";
		logs.info("moban path"+classPath);
		File file = new File(classPath);
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++){
			if(files[i].exists()){
			    if(files[i].getName().endsWith("xml")){
			    	String key = files[i].getName().substring(0,files[i].getName().indexOf("."));
					
			    	try {
			    		
						filesmap.put(key, FileUtils.readFileToString(files[i]));
					} catch (IOException e) {
						e.printStackTrace();
					}
			    }
			}
		}
		logs.info("初始化交易模板文件成功！共有"+filesmap.size()+"个模板文件");
		return filesmap;
	}
	public static String getXmlString(String key){
		Object obj = filesmap.get(key);
		if(null == obj){
			logs.info("无法得到代码"+key+"的交易模板");
			return null;
		}
		return (String)filesmap.get(key);
	}
	public static void initProperties() {
		InputStream inputStream = Thread.currentThread()
				.getContextClassLoader().getResourceAsStream(
						"config/env/app.properties");
		p = new Properties();
		try {
			p.load(inputStream);
			inputStream.close();
			logs.info("初始系统配置成功");
		} catch (Exception e1) {
			logs.error("初始化系统配置异常，请检查配置文件:app.properties", e1);
		}

	}

	/**
	 * @param key
	 * @return 得到配置信息
	 */
	public static String getPropertiesValue(String key) throws Exception {
		try {
			String propertieValue = p.getProperty(key).trim();
			return propertieValue;
		} catch (Exception e1) {
			logs.error("属性值班不存在:" + key, e1);
			throw new Exception("属性值班不存在:" + key, e1);
		}

	}

	/**
	 * @param key
	 * @return 属性文件是否存在KEY
	 */
	public static boolean containsKey(String key) {
		try {
			boolean containsKey = p.containsKey(key);
			return containsKey;
		} catch (Exception e1) {
			logs.error("属性文件不存在KEY:" + key, e1);
			return false;
		}
	}

	public static Map getProperMap(String s) {
		Map map = new HashMap();
		try {
			for (Map.Entry m : p.entrySet()) {
				if (((String) m.getKey()).indexOf(s) != -1) {
					map.put(m.getKey(), m.getValue());
				}
			}
			return map;
		} catch (Exception e1) {
			logs.error("获取配置文件内容失败", e1);
			return map;
		}
	}

	

	

	
	
}
