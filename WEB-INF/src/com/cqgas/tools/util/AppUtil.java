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
	
	
}
