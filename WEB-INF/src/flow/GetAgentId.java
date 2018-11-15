package flow;

import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;

import beans.AgentVO;
import beans.CustomerVO;
import beans.SatisfyVO;

import com.avaya.sce.runtimecommon.IVariableField;
import com.cqgas.tools.util.AppUtil;
import com.cqgas.tools.util.TextUtil;

/**
 * A basic servlet which allows a user to define their code, generate
 * any output, and to select where to transition to next.
 * Last generated by Orchestration Designer at: 2016年8月29日 下午09时54分01秒
 */
public class GetAgentId extends com.avaya.sce.runtime.BasicServlet {
	private static final Logger logs = Logger.getLogger(GetAgentId.class);
	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016年8月29日 下午09时54分01秒
	 */
	public GetAgentId() {
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
	 * Last generated by Orchestration Designer at: 2016年8月29日 下午09时54分01秒
	 */
	public void servletImplementation(com.avaya.sce.runtimecommon.SCESession mySession) {

		// TODO: Add your code here!
		//IVariableField yqzh_field = mySession.getVariableField(IProjectVariables.GAS_FEE_QRY,IProjectVariables.GAS_FEE_QRY_FIELD_UTTERANCE);
		//IVariableField custtypeField = mySession.getVariableField(IProjectVariables.CQVALUE, IProjectVariables.CQVALUE_FIELD_CUSTTYPE);
		//IVariableField kh_field = mySession.getVariableField(IProjectVariables.CQVALUE,IProjectVariables.CQVALUE_FIELD_KHID);
		//IVariableField Cq_yqzh = mySession.getVariableField(IProjectVariables.CQVALUE,IProjectVariables.CQVALUE_FIELD_YQZH);
		//Cq_yqzh.setValue(arg0)
		IVariableField callIdField = mySession.getVariableField(IProjectVariables.CQVALUE,IProjectVariables.CQVALUE_FIELD_CALLID);
		IVariableField aniField = mySession.getVariableField(IProjectVariables.CTICALLINFO,IProjectVariables.CTICALLINFO_FIELD_ANI);
		//custtypeField.setValue(null);
		IVariableField satisfyField = mySession.getVariableField(IProjectVariables.CQVALUE, IProjectVariables.CQVALUE_FIELD_SATISFYFLAG);
		IVariableField agentIdField = mySession.getVariableField(IProjectVariables.CQVALUE, IProjectVariables.CQVALUE_FIELD_AGENTID);
		IVariableField mydIdField = mySession.getVariableField(IProjectVariables.CQVALUE, IProjectVariables.CQVALUE_FIELD_MYDID);
		int i = 0;
		logs.debug("满意度callId==="+callIdField.getStringValue());
		try {
			IVariableField uui = mySession.getVariableField(IProjectVariables.CTICALLINFO, IProjectVariables.CTICALLINFO_FIELD_UUI);
			String tempUui =  uui.getStringValue();
			String uuiStr =tempUui.replaceAll(",", "|");
			logs.debug("uuiStr ===> "+uuiStr);
			Map<String,String> map = TextUtil.toMapForUUI(uuiStr);
				SatisfyVO svo  = new SatisfyVO();
				String callId = callIdField.getStringValue();
				if(callId == null || "".equals(callId)){
					callId =  map.get("callId2");
				}
				if(callId == null || "".equals(callId)){
					callId = map.get("callid");
				}
				if(callId == null || "".equals(callId)){
					callId = "nocallid";
				}
				svo.setCallId(callId);
				System.out.println("MYD   callId : " + callId);
				String mydId = UUID.randomUUID().toString().replaceAll("-","");
//				String mydId_t = mydId.substring(0,10);
				svo.setMydId(mydId);
				svo.setTelNo(aniField.getStringValue());
				String agentID = null;
				if(StringUtils.isNotEmpty(agentIdField.getStringValue())){
					agentID = agentIdField.getStringValue();
				}else{
					agentID = (map != null ? map.get("AgentID") : "");
				}
				if(agentID == null){
					agentID = (map != null ? map.get("agentId") : "");
				}
				svo.setAgentId(agentID == null ? "noagentid" : agentID);
				logs.debug("满意度agentId==="+svo.getAgentId());
				logs.debug("满意度数据："+svo.toString());
				System.out.println("满意度数据："+svo.toString());
				i  = AppUtil.saveSatisfy(svo);
				mydIdField.setValue(mydId);
				
		} catch(EmptyResultDataAccessException e){
			i=-1;
		}
		catch (Exception e) {
			i=-2;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		satisfyField.setValue(i);
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
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public java.util.Collection getBranches(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Goto aGoto = null;
		list = new java.util.ArrayList(1);

		aGoto = new com.avaya.sce.runtime.Goto("SatisfyMenu", 0, true, "Default");
		list.add(aGoto);

		return list;
	}
}
