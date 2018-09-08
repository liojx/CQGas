package beans;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.dao.EmptyResultDataAccessException;

import com.cqgas.tools.util.AppUtil;
import com.cqgas.tools.util.DateUtil;
import com.cqgas.tools.util.TextUtil;

public class test {
	public static void main(String args[]){
		try {
			AppUtil.getCustomerVO("49040026662");
			//AppUtil.getJMQF("4902403765","200507");
			//AppUtil.getDWQF("14100125444", "200905");
			/*System.out.println(TextUtil.getMoney((new Double("7.2")).doubleValue()));
			System.out.println(DateUtil.getPromptDate("20091009"));
			System.out.println("你好".length());
			try {
				List  list  =	AppUtil.getJMQF("4904002662","200504");
				if(vo!=null){
					feeField.setValue("您查询的结果如下：上月指数:"+vo.getCbjl_scbd()+",本月指数："+vo.getCbjl_bcbd()+", 用气量:"+vo.getCbjl_bcyql_js()+",用气费:"+vo.getCbjl_yje()+","+("7".equals(vo.getCbjl_zt())? "已缴费":"未缴费"));
				}
				if(null!=list && list.size()>0){
					//2009年5月14日 用气量：用气费： 元分  状态
					StringBuffer sb  = new StringBuffer("您查询的结果如下：");
					for(int i =0 ;i<list.size();i++){
						
						//feeField.setValue("您查询的结果如下：上月指数:"+vo.getCbjl_scbd()+",本月指数："+vo.getCbjl_bcbd()+", 用气量:"+vo.getCbjl_bcyql_js()+",用气费:"+vo.getCbjl_yje()+","+("7".equals(vo.getCbjl_zt())? "已缴费":"未缴费"));
					 //sb.append(DateUtil.getPromptDate(((java.util.Map)(list.get(i))).get("tsrq").toString()));
					 sb.append("上月指数："+((java.util.Map)(list.get(i))).get("cbjl_scbd"));
					 sb.append("本月指数："+((java.util.Map)(list.get(i))).get("cbjl_bcbd"));
					 sb.append("用气量："+((java.util.Map)(list.get(i))).get("cbjl_bcyql_js"));
					 String money  = ((java.util.Map)(list.get(i))).get("cbjl_yje").toString();
					 System.out.println(money);
					 sb.append("用气费："+TextUtil.getMoney(new Double(money)));
					 String status = ((java.util.Map)(list.get(i))).get("cbjl_zt").toString();
					 sb.append(("7".equals(status)? "已缴费":"未缴费"));
						//sb.append();
					}
					System.out.println(sb.toString());
				}
				List list = AppUtil.getStopGasNotice();
				StringBuffer sb  = new StringBuffer("");
				for(int i=0;i<list.size();i++){
					String content = ((java.util.Map)(list.get(i))).get("bulcontent").toString();
					sb.append(content);
				}
			//System.out.println(sb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			/*try {
				//List  list  =	AppUtil.getTSQF("402094","200901");
				List  list  =	AppUtil.getTSQF("0716207","201003");
				if(null!=list && list.size()>0){
					//2009年5月14日 用气量：用气费： 元分  状态
					StringBuffer sb  = new StringBuffer("您查询的结果如下：");
					for(int i =0 ;i<list.size();i++){
						
						//feeField.setValue("您查询的结果如下：上月指数:"+vo.getCbjl_scbd()+",本月指数："+vo.getCbjl_bcbd()+", 用气量:"+vo.getCbjl_bcyql_js()+",用气费:"+vo.getCbjl_yje()+","+("7".equals(vo.getCbjl_zt())? "已缴费":"未缴费"));
					 sb.append(DateUtil.getPromptDate(((java.util.Map)(list.get(i))).get("tsrq").toString()));
					 //sb.append("上月指数："+((java.util.Map)(list.get(i))).get("cbjl_scbd"));
					
					// sb.append("用气量："+((java.util.Map)(list.get(i))).get("cbjl_bcyql_js"));
					 String money  = ((java.util.Map)(list.get(i))).get("ts_je").toString();
					 sb.append("用气费："+TextUtil.getMoney(new Double(money)));
					 String status = ((java.util.Map)(list.get(i))).get("ts_zt").toString();
					 sb.append(("2".equals(status)? "已缴费":"未缴费"));
						//sb.append();
					}
					System.out.println(sb.toString());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			/*try {
				List  list  =	AppUtil.getDWQF("14100125444","200905");
				if(null!=list && list.size()>0){
					//2009年5月14日 用气量：用气费： 元分  状态
					StringBuffer sb  = new StringBuffer("您查询的结果如下：");
					for(int i =0 ;i<list.size();i++){
						
						//feeField.setValue("您查询的结果如下：上月指数:"+vo.getCbjl_scbd()+",本月指数："+vo.getCbjl_bcbd()+", 用气量:"+vo.getCbjl_bcyql_js()+",用气费:"+vo.getCbjl_yje()+","+("7".equals(vo.getCbjl_zt())? "已缴费":"未缴费"));
					 sb.append(DateUtil.getPromptDate(((java.util.Map)(list.get(i))).get("tsrq").toString()));
					 sb.append(" 用气量："+((java.util.Map)(list.get(i))).get("dwjf_yql"));
					 String money  = ((java.util.Map)(list.get(i))).get("dwjf_je").toString();
					 sb.append(" 用气费："+TextUtil.getMoney(new Double(money)));
					 String status = ((java.util.Map)(list.get(i))).get("dwjf_zt").toString();
					 sb.append(" "+("2".equals(status)? "已缴费":"未缴费"));

						//sb.append();
					}
					System.out.println(sb.toString());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			//AppUtil.checkTuoshou("0717677");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			AgentVO  vo  =	AppUtil.getAgentVO("02201609101014157");
			if(vo!=null){
				SatisfyVO svo  = new SatisfyVO();
				svo.setCallId("02201609101014157");
				
				svo.setMydId(vo.getMydId());
				svo.setSvrNo("1");
				svo.setTelNo("8501");
				svo.setAgentId("8005");
				
				//svo.setMydTypeId("0");
				AppUtil.saveSatisfy(svo);
				//mydIdField.setValue(vo.getMydId());
				
			}
		} catch(EmptyResultDataAccessException e){
		//	i=-1;
		}
		catch (Exception e) {
			//i=-2;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
