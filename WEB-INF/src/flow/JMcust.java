package flow;

import java.util.List;

import org.apache.log4j.Logger;

import beans.CustomerVO;
import beans.GasFeeVO;

import com.avaya.sce.runtimecommon.IVariableField;
import com.cqgas.tools.util.AppUtil;
import com.cqgas.tools.util.DateUtil;
import com.cqgas.tools.util.TextUtil;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2016年8月30日 上午07时06分14秒
 */
public class JMcust extends com.avaya.sce.runtime.BasicServlet {
	private static final Logger logs = Logger.getLogger(JMcust.class);
	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016年8月30日 上午07时06分14秒
	 */
	public JMcust() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method allows for custom integration with other Java components.
	 * You may use Java for sophisticated logic or to integrate with custom
	 * connectors (i.e. JMS, custom web services, sockets, XML, JAXB, etc.)
	 *
	 * Any custom code added here should work as efficiently as possible to prevent delays.
	 * It's important to design your callflow so that the voice browser (Voice Portal/IR)
	 * is not waiting too long for a response as this can lead to a poor caller experience.
	 * Additionally, if the response to the client voice browser exceeds the configured
	 * timeout, the platform may throw an "error.badfetch". 
	 *
	 * Using this method, you have access to all session variables through the 
	 * SCESession object.
	 *
	 * The code generator will *** NOT *** overwrite this method in the future.
	 * Last generated by Orchestration Designer at: 2016年8月30日 上午07时06分14秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		// TODO: Add your code here!
		IVariableField feeField = mySession.getVariableField(IProjectVariables.CQVALUE, IProjectVariables.CQVALUE_FIELD_FEERESULT);
		//feeField.setValue("居民气费查询结果如下：2016年5月，费用合计180.00元，2016年6月，费用合计200.00元");
		IVariableField monthField = mySession.getVariableField(IProjectVariables.COLLECT_MONTH, IProjectVariables.COLLECT_MONTH_FIELD_UTTERANCE);
		
		IVariableField custField = mySession.getVariableField(IProjectVariables.GAS_FEE_QRY, IProjectVariables.GAS_FEE_QRY_FIELD_UTTERANCE);
		
		logs.debug("居民用气号 ："+custField.getStringValue());
		try {
			List  list  =	AppUtil.getJMQF(custField.getStringValue(),monthField.getStringValue());
			/*if(vo!=null){
				feeField.setValue("您查询的结果如下：上月指数:"+vo.getCbjl_scbd()+",本月指数："+vo.getCbjl_bcbd()+", 用气量:"+vo.getCbjl_bcyql_js()+",用气费:"+vo.getCbjl_yje()+","+("7".equals(vo.getCbjl_zt())? "已缴费":"未缴费"));
			}*/
			if(null!=list && list.size()>0){
				//2009年5月14日 用气量：用气费： 元分  状态
				StringBuffer sb  = new StringBuffer("您查询的结果如下：");
				for(int i =0 ;i<list.size();i++){
					
					//feeField.setValue("您查询的结果如下：上月指数:"+vo.getCbjl_scbd()+",本月指数："+vo.getCbjl_bcbd()+", 用气量:"+vo.getCbjl_bcyql_js()+",用气费:"+vo.getCbjl_yje()+","+("7".equals(vo.getCbjl_zt())? "已缴费":"未缴费"));
				 //sb.append(DateUtil.getPromptDate(((java.util.Map)(list.get(i))).get("tsrq").toString()));
				 sb.append("上月指数,,"+((java.util.Map)(list.get(i))).get("cbjl_scbd"));
				 sb.append(",,本月指数,,"+((java.util.Map)(list.get(i))).get("cbjl_bcbd"));
				 sb.append(",,用气量,,"+((java.util.Map)(list.get(i))).get("cbjl_bcyql_js"));
				 String money  = ((java.util.Map)(list.get(i))).get("cbjl_yje").toString();
				 sb.append(",,用气费,,"+TextUtil.getMoney(new Double(money)));
				 String status = ((java.util.Map)(list.get(i))).get("cbjl_zt").toString();
				 sb.append(",,"+("7".equals(status)? "已缴费,,":"未缴费,,"));
					//sb.append();
				}
				feeField.setValue(sb.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * Builds the list of branches that are defined for this servlet object.
	 * This list is built automatically by defining Goto nodes in the call flow editor.
	 * It is the programmer's responsibilty to provide at least one enabled Goto.<BR>
	 *
	 * The user should override updateBranches() to determine which Goto that the
	 * framework will activate.  If there is not at least one enabled Goto item, 
	 * the framework will throw a runtime exception.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of branches for the flow item, override:
	 *     <code>updateBranches(Collection branches, SCESession mySession)</code>
	 *
	 * @return a Collection of <code>com.avaya.sce.runtime.Goto</code>
	 * objects that will be evaluated at runtime.  If there are no gotos
	 * defined in the Servlet node, then this returns null.
	 * Last generated by Orchestration Designer at: 2017年2月7日 上午12时44分25秒
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("checkFeeResult", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
