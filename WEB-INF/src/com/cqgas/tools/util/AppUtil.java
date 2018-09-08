package com.cqgas.tools.util;



import java.io.IOException;


import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.xml.sax.SAXException;


import beans.AgentVO;
import beans.CallLogVO;
import beans.CustomerVO;
import beans.GasFeeVO;
import beans.SatisfyVO;
import beans.ServiceLogVO;
import beans.TransferVO;

import com.cqgas.dynamicds.CustomerContextHolder;


public class AppUtil {
	private static final Logger logs = Logger.getLogger(AppUtil.class);
	private static ApplicationContext context;
	//private static IEGateAdapter adapter;
	 
	static {
		if (null == context) {
			context = new ClassPathXmlApplicationContext(
					"classpath:applicationContext.xml");
			logs.info(context);
		}
		/*if(null == adapter){
			adapter = (IEGateAdapter) getPojo(IEGateAdapter.BEAN_ID);
		}*/
	}

	
	public static Object getPojo(String beanName) {
		CustomerContextHolder.setCustomerType("CQGAS_DATA_SOURCE");
		return (Object) context.getBean(beanName);
	}

	public AppUtil() {
	}
	
	public static CustomerVO getCustomerVO(String yqzh) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$QRYCUSTBYID");
		CustomerVO customer  = (CustomerVO)jdbcTemplate.queryForObject(sql, new Object[]{yqzh}, new BeanPropertyRowMapper(CustomerVO.class));
		logs.debug("客户类型："+customer.getYqdz_kh_lx());
		return customer;
	}
	
	public static List getJMQF(String yqzh,String month) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$QRYJMQF");
		
		List list = jdbcTemplate.queryForList(sql, new Object[]{yqzh,""+month+"%"});
		
		//logs.debug("用气账号："+yqzh+"  查询月份:"+month);
		
		return list;
	}
	public static List getDWQF(String yqzh,String month) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$QRYDWQF");
		List list = jdbcTemplate.queryForList(sql,  new Object[]{yqzh,month});
		//GasFeeVO vo  = (GasFeeVO)jdbcTemplate.queryForObject(sql, new Object[]{yqzh,month}, new BeanPropertyRowMapper(GasFeeVO.class));
		//System.out.println(((Map)list.get(0)).get("dwjf_je"));
		return list;
	}
	

	public static List getTSQF(String yqzh,String month) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$QRYTSQF");
		List list =  jdbcTemplate.queryForList(sql, new Object[]{yqzh,month});
		return list;
	}
	public static int checkTuoshou(String yqzh) {
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql=null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$CHECKTUOSHOU");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = jdbcTemplate.queryForInt(sql,new Object[]{yqzh});
		return i;
		
	}
	public static List getStopGasNotice() throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$QRYSTOPGAS");
		List list =  jdbcTemplate.queryForList(sql);
		return list;
	}
	public static List getImportantNotice() throws Exception {
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$QRYIMPORT");
		List list =  jdbcTemplate.queryForList(sql);
		return list;
	}
	
	public static AgentVO  getAgentVO(String callId) throws Exception {
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$GETAGENTID");
		AgentVO agentVO  = (AgentVO)jdbcTemplate.queryForObject(sql, new Object[]{callId}, new BeanPropertyRowMapper(AgentVO.class));
		return agentVO;
	}
	public static int saveSatisfy(SatisfyVO vo) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$SAVESATISFY");
		int i = jdbcTemplate.update(sql, new Object[]{vo.getMydId(),vo.getCallId(),vo.getTelNo(),vo.getAgentId()});
	
		return i;
	}
	public static int updateSatisfy(String mydTypeId,String mydId) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$UPDATESATISFY");
		int i = jdbcTemplate.update(sql, new Object[]{mydTypeId,mydId});
		return i;
	}
	public static int saveCallLog(CallLogVO vo) throws Exception {
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$SAVECALLLOG");
		int i = jdbcTemplate.update(sql, new Object[]{vo.getCallId(),vo.getCallType(),vo.getCallNum(),vo.getOrgId(),vo.getIvrGroup(),vo.getCsrId()});
		return i;
	}
	public static int saveTransferLog(TransferVO vo ) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$TRANSFERLOG");
		int i = jdbcTemplate.update(sql, new Object[]{vo.getCallId(),vo.getCallType(),vo.getCallFlag(),vo.getCallNum(),vo.getCalledNum()});
		return i;
	}
	public  static int saveServiceLog(ServiceLogVO vo,String btTypeCode) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql1 = PropertiesUtil.getPropertiesValue("SQL$GETBTKEY");
		List list =  jdbcTemplate.queryForList(sql1,new Object[]{btTypeCode});
		int i = 0;
		if(list.size()>0){
			String btKey = ((java.util.Map)(list.get(0))).get("BTKey").toString();
			vo.setBtKey(btKey);
			String sql2 = PropertiesUtil.getPropertiesValue("SQL$SERVICELOG");
			i = jdbcTemplate.update(sql2, new Object[]{vo.getCallId(),vo.getBtKey(),vo.getCsrId(),vo.getOrgId()});
			
		}
		return i;
	}
	
	public static int updateCallTime(String callId) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$UPDATECALLTIME");
		int i = jdbcTemplate.update(sql, new Object[]{callId});
		return i;
	}
	public static int checkVIP(String ani){
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql=null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$QUERYVIP");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = jdbcTemplate.queryForInt(sql,new Object[]{ani});
		return i;
	}
	
	/*public static  int queryBlackList(String ani){
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$BLACKLIST");
		} catch (Exception e) {
			logs.debug("查询黑名单异常");
			e.printStackTrace();
		}
		int i = 0;
		if(StringUtils.isNotEmpty(ani)){
			if(ani.length()>11 && ani.startsWith("01")){
				ani = ani.substring(1,ani.length());
			}
			i = jdbcTemplate.queryForInt(sql, new Object[]{ani});
		}
	
		return i;
	}
	public static int checkVipCust(String ani){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$VIPLIST");
		} catch (Exception e) {
			logs.debug("查询VIP异常");
			e.printStackTrace();
		}
		int i = 0;
		if(StringUtils.isNotEmpty(ani)){
			if(ani.length()>11 && ani.startsWith("01")){
				ani = ani.substring(1,ani.length());
			}
			i = jdbcTemplate.queryForInt(sql, new Object[]{ani});
		}
		logs.info("电话号码:"+ani +" 是否VIP客户:"+i);
	
		return i;
	}
	
	public static int checkHolidayDay(){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		//String sql  = "call P_WORKJUDGE()";
		String sql=null;
		int i = 0;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$WORKDAY");
			 i= jdbcTemplate.queryForInt(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			logs.debug("判断节假日和上班时间异常");
			
		}
		
		if(i == 0){
			i = 1;
		}else if(i==1){
			i = 0;
		}
		return i;
	}
	
	public static int checkIDNO(String idNo){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql=null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$CHECKIDNO");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = jdbcTemplate.queryForInt(sql,new Object[]{idNo});
		return i;
	}
	
	public static CustomerVO queryCustById(String idNo) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql = PropertiesUtil.getPropertiesValue("SQL$QRYCUSTBYID");
		CustomerVO customer  = (CustomerVO)jdbcTemplate.queryForObject(sql, new Object[]{idNo}, new BeanPropertyRowMapper(CustomerVO.class));
		return customer;
	}
	
	
	
	public static CustomerVO getCaptcha(String idNo){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		
		String sql=null;
		CustomerVO customer = null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$QUERYSMS");
			customer = (CustomerVO)jdbcTemplate.queryForObject(sql, new Object[]{idNo}, new BeanPropertyRowMapper(CustomerVO.class));
		}catch(EmptyResultDataAccessException e){ 
			logs.debug("没有找到当前客户的验证码信息");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}
	
	
	public static int SaveServicePwd(String idNo,String password){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql=null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$SAVEKEY");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jdbcTemplate.update(sql, new Object[]{password,idNo});
	}
	
	public static int SaveCallBackPhone(String ucid,String ani,String callbackPhone ) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= PropertiesUtil.getPropertiesValue("SQL$SAVELEAVEBACK");
	
		
		return jdbcTemplate.update(sql, new Object[]{ucid,ani,callbackPhone});
	}
	
	
	public static CustomerVO queryCustomerByIdNo(String idNo) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql=PropertiesUtil.getPropertiesValue("SQL$QUERYPWD");
		CustomerVO customer = (CustomerVO)jdbcTemplate.queryForObject(sql, new Object[]{idNo}, new BeanPropertyRowMapper(CustomerVO.class));
		return customer;
	}
	
	public static int checkAgentNo(String agentNo) throws IOException, SAXException, Exception{
		Map paramsMap = new HashMap();
		paramsMap.put("agentNo", agentNo);
		//paramsMap.put("queryType", "1");
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		PackageList pkgs =adapter.getMessage("COM-Q0001-07", paramsMap);
		if(Contants.WEBSERVICE_TRADE_RES_SUCCESS.equals( pkgs.getPkg().getHead().getCtrl().getReturnCode())
				&& Integer.valueOf(pkgs.getPkg().getHead().getCtrl().getRecordNumber())>0){
			return 1;
		}
		if(Contants.WEBSERVICE_TRADE_RES_SUCCESS.equals( pkg.getBody().getFlag())){
			return 1;
		}
		return 0;
	}
	public static int checkPwd(String idno,String pwd){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql=null;
		int i = 0;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$CHECKPWD");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		 i = jdbcTemplate.queryForInt(sql,new Object[]{idno,pwd});
		return i;
	}
	public static PackageList getAgentNoInfo(String contractNo) throws IOException, SAXException, Exception{
		Map paramsMap = new HashMap();
		paramsMap.put("contractNo", contractNo);
		//paramsMap.put("queryType", "0");
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		PackageList pkgs = adapter.getMessage("COM-Q0001-07", paramsMap);
		
		return pkgs;
	}
	*//**
	 * 保单续缴
	 * @return
	 * @throws Exception 
	 * @throws SAXException 
	 * @throws IOException 
	 *//*
	public static PackageList getRenewalPrem(String idNo) throws IOException, SAXException, Exception {
		
		Map paramsMap = new HashMap();
		//paramsMap.put("queryDate", DateUtil.getCurrentDateAsString());
	//	paramsMap.put("queryDate", "2016-06-02");
	//	paramsMap.put("queryType", "N");
		paramsMap.put("idNo", idNo);
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		//ChinaPost post = adapter.getMessage("IVRBDXQCX", paramsMap);	
		PackageList  pkgs = adapter.getMessage("COM-Q0005-01", paramsMap);
		//PackageList  pkgs = adapter.getMessage("IVRBDXQCX", paramsMap);
		return pkgs;
	}
	public static ChinaPost getRenewalPrem1(String idNo) throws IOException, SAXException, Exception {
		
		Map paramsMap = new HashMap();
	//	paramsMap.put("queryDate", DateUtil.getCurrentDateAsString());
		//paramsMap.put("queryDate", "2016-06-02");
		paramsMap.put("idNo", idNo);
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		ChinaPost post = adapter.getMessage1("IVRBDXQCX", paramsMap);	
		//PackageList  pkgs = adapter.getMessage("COM-Q0005-01", paramsMap);
		//PackageList  pkgs = adapter.getMessage("IVRBDXQCX", paramsMap);
		return post;
	}
	*//**
	 * 万能账户查询
	 * @return
	 * @throws Exception 
	 * @throws SAXException 
	 * @throws IOException 
	 *//*
	public static PackageList getWNAccountInfo(String idNo) throws IOException, SAXException, Exception{
		Map paramsMap = new HashMap();
		//paramsMap.put("queryDate", DateUtil.getCurrentDateAsString());
		//paramsMap.put("queryDate", "2016-06-02");
		paramsMap.put("idNo", idNo);
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		PackageList  pkgs =adapter.getMessage("COM-Q0002-03", paramsMap);
		
		return pkgs;
	}
	*//**
	 * 保单红利查询
	 * @param idNo
	 * @return
	 * @throws Exception 
	 * @throws SAXException 
	 * @throws IOException 
	 *//*
	public static PackageList getBDHL(String idNo) throws IOException, SAXException, Exception{
		Map paramsMap = new HashMap();
		//paramsMap.put("queryDate", DateUtil.getCurrentDateAsString());
		paramsMap.put("queryDate", "2016-06-02");
		paramsMap.put("idNo", idNo);
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		PackageList pkgs = adapter.getMessage("COM-Q0002-01", paramsMap);
	
		return pkgs;
	}
	*//**
	 * 理赔进度查询
	 * @param idNo
	 * @return
	 * @throws Exception 
	 * @throws SAXException 
	 * @throws IOException 
	 *//*
	public static PackageList getLPJD(String idNo) throws IOException, SAXException, Exception{
		Map paramsMap = new HashMap();
		//paramsMap.put("queryDate", DateUtil.getCurrentDateAsString());
		
		paramsMap.put("queryDate", "2016-06-02");
		paramsMap.put("idNo", idNo);
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		//ChinaPost post = adapter.getMessage("IVRLPJDCX", paramsMap);
		
		PackageList pkgs = adapter.getMessage("COM-Q0006-03", paramsMap);
		return pkgs;
	}
	*//**
	 * 保全进度查询
	 * @param idNo
	 * @return
	 * @throws Exception 
	 * @throws SAXException 
	 * @throws IOException 
	 *//*
	public static PackageList getBQJD(String idNo) throws IOException, SAXException, Exception{
		Map paramsMap = new HashMap();
		//paramsMap.put("queryDate", DateUtil.getCurrentDateAsString());
		paramsMap.put("queryDate","2016-06-08");
		//paramsMap.put("queryDate","2011-01-12");
		paramsMap.put("idNo", idNo);
		//ChinaPost post = adapter.getMessage("IVRBQJDCX", paramsMap);	
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		PackageList pkgs = adapter.getMessage("COM-Q0006-02", paramsMap);
		return pkgs;
	}
	*//**
	 * 承保进度查询
	 * @param idNo
	 * @return
	 * @throws Exception 
	 * @throws SAXException 
	 * @throws IOException 
	 *//*
	public static PackageList getCBJD(String idNo) throws IOException, SAXException, Exception{
		Map paramsMap = new HashMap();
		//paramsMap.put("queryDate", DateUtil.getCurrentDateAsString());
		//paramsMap.put("queryDate","2016-06-02");
		paramsMap.put("idNo", idNo);
		paramsMap.put("transTime", DateUtil.getCurrentDateTimeAsString());
		PackageList pkgs = adapter.getMessage("COM-Q0006-01", paramsMap);

		return pkgs;
	}
	public static int updateStatisfaction(String phone,String myd){
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql=null;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$UPDATEMYD");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jdbcTemplate.update(sql, new Object[]{myd,phone,phone});
	}
	public static int  sendSMS(String context,String phone) throws Exception{
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= PropertiesUtil.getPropertiesValue("SQL$SAVESMS");
		
		return jdbcTemplate.update(sql, new Object[]{context,phone});
	}
	
	public static int saveIvrLog(IvrErrLogBean bean){
		//ivrlog_guid,className,methodName,exceptionMsg,createTime,ani,nodeName,deviceName
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= null;
		int i = 0;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$SAVEIVRLOG");
			i = jdbcTemplate.update(sql, new Object[]{bean.getClassName(),bean.getMethodName(),bean.getExceptionMsg(),bean.getAni(),bean.getNodeName(),bean.getDeviceName()});
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return i;
	}
	
	public static int delCheckKeyRes(String ucid){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= null;
		int i = 0;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$DELKEYRES");
			i = jdbcTemplate.update(sql, new Object[]{ucid});
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return i;
	}
	public static int saveCheckKeyRes(String customerid,String resCode){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= null;
		int i = 0;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$SAVEKEYRES");
			i = jdbcTemplate.update(sql, new Object[]{customerid,resCode});
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return i;
	}
	public static int updateCheckKeyRes(String idno,String resCode){
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");
		String sql= null;
		int i = 0;
		try {
			sql = PropertiesUtil.getPropertiesValue("SQL$UPDATECHKRES");
			i = jdbcTemplate.update(sql, new Object[]{resCode,idno});
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return i;
	}
	
	public static void main(String args[]){
		String ani = "018696175785";
		if(StringUtils.isNotEmpty(ani)){
			if(ani.length()>11 && ani.startsWith("01")){
				ani = ani.substring(1,ani.length());
			}
			System.out.println(ani);
		}
		ApplicationContext	context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		AppUtil.getPojo("iEGateAdapter");
		
	}*/
	
	
/*	public static boolean initDerby() {
		JdbcTemplate jdbcTemplate = (JdbcTemplate) getPojo("jdbcTemplate");

		try {

			Map dynamicVoiceInitDerbyMap = PropertiesUtil
					.getProperMap("DynamicVoiceInitDerbyForTableName$");
			java.util.Collection<String> list = dynamicVoiceInitDerbyMap
					.values();
			for (Iterator i = list.iterator(); i.hasNext();) {
				String tablename = (String) i.next();
				List tableNameLsit = jdbcTemplate
						.queryForList("select * from sys.systables where tablename = '"
								+ tablename + "'");

				if (null == tableNameLsit || tableNameLsit.isEmpty()) {
					String sql = PropertiesUtil
							.getPropertiesValue("DynamicVoiceInitDerbyCreateTableSql$"
									+ tablename);
					jdbcTemplate.execute(sql);
				}
			}
			// jdbcTemplate.execute("SELECT 1 FROM  TEST");
			logs.warn("数据库已初始化!");
			return true;
		} catch (Exception e) {
			// logs.debug(e.getMessage());
			// e.printStackTrace();
			
			 * jdbcTemplate.execute(
			 * "create table TEST(ID INT NOT NULL,NAME VARCHAR(10) NOT NULL)");
			 * jdbcTemplate.execute(
			 * "create table MENU_TREES    (MENUID VARCHAR(30) NOT NULL PRIMARY KEY,PARENTMENUID VARCHAR(30),MENUNAME VARCHAR(1000),MENUKEY VARCHAR(1000),KEYVALUE VARCHAR(1000),VOICENAME VARCHAR(1000),BACKMENU VARCHAR(1000),TRADEURL VARCHAR(1000),ORDERID INT)"
			 * ); jdbcTemplate.execute(
			 * "create table VOICE_CONFIG  (ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) ,MENUID VARCHAR(30) NOT NULL,VOICETYPE VARCHAR(20),VOICEVALUE VARCHAR(1000))"
			 * ); jdbcTemplate.execute(
			 * "create table PASSWOD_KEYS(KEYID VARCHAR(30) NOT NULL PRIMARY KEY,KEYVALUE VARCHAR(1000) NOT NULL)"
			 * );
			 
			logs.warn(e.getMessage());
			return false;
		}
	}

	public static void initData() {
		// 菜单 初始化
		try {
			JdbcTemplate jdbcTemplate = (JdbcTemplate) AppUtil
					.getPojo("jdbcTemplate");
			String configPath = System.getProperty("user.dir") + File.separator
					+ PropertiesUtil.getDecoratePropertiesValue("DV.config")
					+ File.separator;
			File menuConfigFile = new File(configPath + "MenuConfig.xml");
			File voiceConfigFile = new File(configPath + "VoiceConfig.xml");
			 File keyConfigFile = new File(configPath + "key.xml"); 
			// logs.debug("初始化数据!");
			String tableName = PropertiesUtil
					.getPropertiesValue("DynamicVoiceInitDerbyForTableName$MENU_TREES");

			if (menuConfigFile.exists()) {
				logs.debug("初始化菜单!");

				String menuConfigText = FileUtils.readFileToString(
						menuConfigFile, "utf-8");

				Reader reader = new StringReader(menuConfigText);

				MenuBean menuBean = DigesterParseMenuXmlToBean
						.parseMenuXmlToBean(reader);

				jdbcTemplate.execute("delete from " + tableName);

				String isinitMenuTreeToCSR = PropertiesUtil
						.getDecoratePropertiesValue("DynamicVoice$isinitMenuTreeToCSR");
				if ("true".equalsIgnoreCase(isinitMenuTreeToCSR)) {
					CustomerContextHolder.setCustomerType("COMIX_DATA_SOURCE");

					JdbcTemplate jdbcTemplateComix = (JdbcTemplate) AppUtil
							.getPojo("jdbcTemplate");
					jdbcTemplateComix.execute("delete from CX_BAS_IVR_MENU ");
					CustomerContextHolder.clearCustomerType();
				}

				for (MenuBean m : menuBean.getChildren()) {
					m.initMenuTree();
				}

				if ("true".equalsIgnoreCase(isinitMenuTreeToCSR)) {
					for (MenuBean m : menuBean.getChildren()) {
						m.initMenuTreeToCSR();
					}
				}
				if (menuConfigFile.exists()) {
					menuConfigFile.delete();
				}
				logs.debug("初始化菜单完成!");
			}
			*//***********************************************************************************************************************************//*
			tableName = PropertiesUtil
					.getPropertiesValue("DynamicVoiceInitDerbyForTableName$VOICE_CONFIG");
			if (voiceConfigFile.exists()) {
				logs.debug("初始化语音文件!");
				InputStream inputStream2 = null;

				inputStream2 = new FileInputStream(voiceConfigFile);
				jdbcTemplate.execute("delete from " + tableName);

				URL rule = Thread.currentThread().getContextClassLoader()
						.getResource("config/env/voiceConfigRules.xml");
				Reader reader2 = new InputStreamReader(inputStream2);
				List list = (List) DigesterParse.parseReaderToBean(reader2,
						rule);

				for (Iterator i = list.iterator(); i.hasNext();) {
					VoiceConfig voiceConfig = (VoiceConfig) i.next();
					voiceConfig.initVoiceConfig();
				}
				if (voiceConfigFile.exists()) {
					voiceConfigFile.delete();
				}
				logs.debug("初始化语音文件完成!");
			}
			*//***********************************************************************************************************************************//*
			
			int count = jdbcTemplate
					.queryForInt("select count(*) from PASSWOD_KEYS");
			if (count > 1) {
				logs.debug("更新密钥!");
				UnionMM unionMM = (UnionMM) AppUtil.getPojo("JMJResource");
				unionMM.setZPK();
				logs.debug("更新密钥结束!");
			} else {
				logs.debug("初始化密钥!");
				CustomerContextHolder.setCustomerType("COMIX_DATA_SOURCE");
				JdbcTemplate jdbcTemplateComix = (JdbcTemplate) AppUtil
						.getPojo("jdbcTemplate");
				List list = jdbcTemplateComix
						.queryForList("select * from cx_bas_code_info where parent_code_no='ENCRYPT_KEY'");
				CustomerContextHolder.clearCustomerType();
				Map map = null;
				for (Iterator i = list.iterator(); i.hasNext();) {
					map = (Map) i.next();
					String mapKey = (String) map.get("CODE_NO");
					String mapValue = (String) map.get("CODE_VALUE");
					logs.debug(mapKey + "=" + mapValue);
					jdbcTemplate
							.execute("insert into PASSWOD_KEYS(KEYID,KEYVALUE) values ('"
									+ mapKey + "','" + mapValue + "')");
				}
				logs.debug("初始化密钥完成!");
			}
				
		} catch (Exception e) {
			logs.warn(e.getMessage());
		}

	}

	public static void initFileDir() {
		try {
			String templatePath = System.getProperty("user.dir")
					+ File.separator
					+ PropertiesUtil
							.getDecoratePropertiesValue("FILE_RESOURCE_LOADER_PATH");
			String askTemplatePath = System.getProperty("user.dir")
					+ File.separator
					+ PropertiesUtil
							.getDecoratePropertiesValue("MessageAskTemplate.Path");
			String configPath = System.getProperty("user.dir") + File.separator
					+ PropertiesUtil.getDecoratePropertiesValue("DV.config");
			String phraseDir = System.getProperty("user.dir")
					+ File.separator
					+ PropertiesUtil
							.getDecoratePropertiesValue("DynamicVoiceFileDirectory$fileDir");

			String repBusConfig = System.getProperty("user.dir")
					+ File.separator
					+ PropertiesUtil
							.getDecoratePropertiesValue("RepeatBusiness.config");

			File templateFile = new File(templatePath);
			if (!templateFile.exists()) {
				templateFile.mkdirs();

			}
			File askTemplateFile = new File(askTemplatePath);
			if (!askTemplateFile.exists()) {
				askTemplateFile.mkdirs();
			}

			File configFile = new File(configPath);
			if (!configFile.exists()) {
				configFile.mkdirs();
			}

			File phraseFile = new File(phraseDir);
			if (!phraseFile.exists()) {
				phraseFile.mkdirs();
			}
			File repBusConfigFile = new File(repBusConfig);
			if (!repBusConfigFile.exists()) {
				repBusConfigFile.mkdirs();
			}
		} catch (Exception e) {
			logs.warn(e.getMessage());
		}
	}

	public static void updateMM() {
		UnionMM unionMM = (UnionMM) AppUtil.getPojo("JMJResource");
		unionMM.setZPK();
	}
*/
}
