package flow;

/**
 * This is a special reserved class that is repsonsible for loading application 
 * variables as well as the forward to the actual first form of the application.<br>
 * This class should not be manually edited as changes may be overridden by the 
 * code generator.<br>
 * Last generated by Orchestration Designer at: 2016年8月28日 下午10时36分57秒
 */
public class Start extends com.avaya.sce.runtime.Entry {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Orchestration Designer at: 2016年8月28日 下午10时36分57秒
	 */
	public Start() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically.  Any changes may be overwritten.
	 * Returns the submit object that will redirect application flow to the first
	 * form in the application.  This also adds various standard variables to the
	 * list of data to be submitted to the runtime variable table.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 * @return the Submit object that contains the standard variables and the first form
	 */
	public com.avaya.sce.runtime.Submit getSubmit(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Submit submit = new com.avaya.sce.runtime.Submit("GetCallData");
		return ( submit );
	}
	/**
	 * This method initializes the SCE session with the variables that
	 * are defined in the application.<BR>
	 * 
	 * This method is generated automatically and should not be manually
	 * edited because changes may be overwritten by future code 
	 * generation.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public void initializeVariables(com.avaya.sce.runtimecommon.SCESession session) {
		com.avaya.sce.runtimecommon.IVariable variable = null;
		String[] variableFields = null;

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.TRANSFER_TO_CELL, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.E_INPUT_FIELD_COLUMN_0,
			IProjectVariables.E_INPUT_FIELD_CONFIDENCE,
			IProjectVariables.E_INPUT_FIELD_INPUTMODE,
			IProjectVariables.E_INPUT_FIELD_INTERPRETATION,
			IProjectVariables.E_INPUT_FIELD_NOINPUTCOUNT,
			IProjectVariables.E_INPUT_FIELD_NOMATCHCOUNT,
			IProjectVariables.E_INPUT_FIELD_UTTERANCE,
			IProjectVariables.E_INPUT_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.E_INPUT, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.TIME_FIELD_AUDIO,
			IProjectVariables.TIME_FIELD_HOUR,
			IProjectVariables.TIME_FIELD_MILLISECOND,
			IProjectVariables.TIME_FIELD_MINUTE,
			IProjectVariables.TIME_FIELD_SECOND,
			IProjectVariables.TIME_FIELD_TIMEZONE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.TIME, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REDIRECTINFO_FIELD_PRESENTATIONINFO,
			IProjectVariables.REDIRECTINFO_FIELD_REASON,
			IProjectVariables.REDIRECTINFO_FIELD_SCREENINGINFO,
			IProjectVariables.REDIRECTINFO_FIELD_URI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REDIRECTINFO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.NUM_FIELD_EIGHT,
			IProjectVariables.NUM_FIELD_FIVE,
			IProjectVariables.NUM_FIELD_FOUR,
			IProjectVariables.NUM_FIELD_NINE,
			IProjectVariables.NUM_FIELD_ONE,
			IProjectVariables.NUM_FIELD_SEVEN,
			IProjectVariables.NUM_FIELD_SIX,
			IProjectVariables.NUM_FIELD_THREE,
			IProjectVariables.NUM_FIELD_TWO,
			IProjectVariables.NUM_FIELD_ZERO };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.NUM, variableFields, new String[] {"8", "5", "4", "9", "1", "7", "6", "3", "2", "0"}, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GAS_FEE_QRY_FIELD_CONFIDENCE,
			IProjectVariables.GAS_FEE_QRY_FIELD_INPUTMODE,
			IProjectVariables.GAS_FEE_QRY_FIELD_INTERPRETATION,
			IProjectVariables.GAS_FEE_QRY_FIELD_NOINPUTCOUNT,
			IProjectVariables.GAS_FEE_QRY_FIELD_NOMATCHCOUNT,
			IProjectVariables.GAS_FEE_QRY_FIELD_UTTERANCE,
			IProjectVariables.GAS_FEE_QRY_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GAS_FEE_QRY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SESSION_FIELD_AAI,
			IProjectVariables.SESSION_FIELD_ANI,
			IProjectVariables.SESSION_FIELD_CALLTAG,
			IProjectVariables.SESSION_FIELD_CHANNEL,
			IProjectVariables.SESSION_FIELD_CHANNELTYPE,
			IProjectVariables.SESSION_FIELD_CONVERSEFIRST,
			IProjectVariables.SESSION_FIELD_CONVERSESECOND,
			IProjectVariables.SESSION_FIELD_CURRENTLANGUAGE,
			IProjectVariables.SESSION_FIELD_DNIS,
			IProjectVariables.SESSION_FIELD_EXIT_CUSTOMER_ID,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_1,
			IProjectVariables.SESSION_FIELD_EXIT_INFO_2,
			IProjectVariables.SESSION_FIELD_EXIT_PREFERRED_PATH,
			IProjectVariables.SESSION_FIELD_EXIT_REASON,
			IProjectVariables.SESSION_FIELD_EXIT_TOPIC,
			IProjectVariables.SESSION_FIELD_LASTERROR,
			IProjectVariables.SESSION_FIELD_MEDIATYPE,
			IProjectVariables.SESSION_FIELD_PROTOCOLNAME,
			IProjectVariables.SESSION_FIELD_PROTOCOLVERSION,
			IProjectVariables.SESSION_FIELD_SESSIONID,
			IProjectVariables.SESSION_FIELD_SESSIONLABEL,
			IProjectVariables.SESSION_FIELD_SHAREDMODE,
			IProjectVariables.SESSION_FIELD_UCID,
			IProjectVariables.SESSION_FIELD_UUI,
			IProjectVariables.SESSION_FIELD_VIDEOBITRATE,
			IProjectVariables.SESSION_FIELD_VIDEOCODEC,
			IProjectVariables.SESSION_FIELD_VIDEOENABLED,
			IProjectVariables.SESSION_FIELD_VIDEOFARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOFORMAT,
			IProjectVariables.SESSION_FIELD_VIDEOFPS,
			IProjectVariables.SESSION_FIELD_VIDEOHEIGHT,
			IProjectVariables.SESSION_FIELD_VIDEONEARFMTP,
			IProjectVariables.SESSION_FIELD_VIDEOWIDTH,
			IProjectVariables.SESSION_FIELD_VPCALLEDEXTENSION,
			IProjectVariables.SESSION_FIELD_VPCONVERSEONDATA,
			IProjectVariables.SESSION_FIELD_VPCOVERAGEREASON,
			IProjectVariables.SESSION_FIELD_VPCOVERAGETYPE,
			IProjectVariables.SESSION_FIELD_VPRDNIS,
			IProjectVariables.SESSION_FIELD_VPREPORTURL };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SESSION, variableFields, null, session, false, true );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MAIN_MENU_DAY_FIELD_CONFIDENCE,
			IProjectVariables.MAIN_MENU_DAY_FIELD_INPUTMODE,
			IProjectVariables.MAIN_MENU_DAY_FIELD_INTERPRETATION,
			IProjectVariables.MAIN_MENU_DAY_FIELD_NOINPUTCOUNT,
			IProjectVariables.MAIN_MENU_DAY_FIELD_NOMATCHCOUNT,
			IProjectVariables.MAIN_MENU_DAY_FIELD_UTTERANCE,
			IProjectVariables.MAIN_MENU_DAY_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MAIN_MENU_DAY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DATE_FIELD_AUDIO,
			IProjectVariables.DATE_FIELD_DAYOFMONTH,
			IProjectVariables.DATE_FIELD_DAYOFWEEK,
			IProjectVariables.DATE_FIELD_DAYOFWEEKNUM,
			IProjectVariables.DATE_FIELD_DAYOFYEAR,
			IProjectVariables.DATE_FIELD_MONTH,
			IProjectVariables.DATE_FIELD_MONTHINYEAR,
			IProjectVariables.DATE_FIELD_YEAR };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DATE, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.DAY_OR_NIGHT, "d", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.NOTICE_MENU_FIELD_CONFIDENCE,
			IProjectVariables.NOTICE_MENU_FIELD_INPUTMODE,
			IProjectVariables.NOTICE_MENU_FIELD_INTERPRETATION,
			IProjectVariables.NOTICE_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.NOTICE_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.NOTICE_MENU_FIELD_UTTERANCE,
			IProjectVariables.NOTICE_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.NOTICE_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.LEN, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REPLAY_FEE_INFO_FIELD_CONFIDENCE,
			IProjectVariables.REPLAY_FEE_INFO_FIELD_INPUTMODE,
			IProjectVariables.REPLAY_FEE_INFO_FIELD_INTERPRETATION,
			IProjectVariables.REPLAY_FEE_INFO_FIELD_NOINPUTCOUNT,
			IProjectVariables.REPLAY_FEE_INFO_FIELD_NOMATCHCOUNT,
			IProjectVariables.REPLAY_FEE_INFO_FIELD_UTTERANCE,
			IProjectVariables.REPLAY_FEE_INFO_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REPLAY_FEE_INFO, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_FIELD_CONFIDENCE,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_FIELD_INPUTMODE,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_FIELD_INTERPRETATION,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_FIELD_NOINPUTCOUNT,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_FIELD_NOMATCHCOUNT,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_FIELD_UTTERANCE,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REPLAY_NOTICE_COPY_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.IS_EXIST, "", null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.MAX_ERROR_CNT, "0", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.CQVALUE_FIELD_AGENTID,
			IProjectVariables.CQVALUE_FIELD_CALLID,
			IProjectVariables.CQVALUE_FIELD_CALLTYPE,
			IProjectVariables.CQVALUE_FIELD_CUSTTYPE,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_1_0,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_1_1,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_1_2,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_2,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_3,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_4,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_5,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_6,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_7,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_8,
			IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_9,
			IProjectVariables.CQVALUE_FIELD_FEERESULT,
			IProjectVariables.CQVALUE_FIELD_GH,
			IProjectVariables.CQVALUE_FIELD_KHID,
			IProjectVariables.CQVALUE_FIELD_MYDID,
			IProjectVariables.CQVALUE_FIELD_NODECODE,
			IProjectVariables.CQVALUE_FIELD_NOTICEMSG,
			IProjectVariables.CQVALUE_FIELD_SATISFYFLAG,
			IProjectVariables.CQVALUE_FIELD_VIPFLAG,
			IProjectVariables.CQVALUE_FIELD_YQZH };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.CQVALUE, variableFields, new String[] {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "0", ""}, null, session, false, false );
		variable.getComplexVariable().getField(IProjectVariables.CQVALUE_FIELD_ERRORCOUNT_5).setAttribute(com.avaya.sce.runtimecommon.IVariableField.VARATTR_PRIVATE, true);
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.CTICALLINFO_FIELD_ANI,
			IProjectVariables.CTICALLINFO_FIELD_CALLID,
			IProjectVariables.CTICALLINFO_FIELD_DNIS,
			IProjectVariables.CTICALLINFO_FIELD_STATE,
			IProjectVariables.CTICALLINFO_FIELD_STATIONEXTENSION,
			IProjectVariables.CTICALLINFO_FIELD_UCID,
			IProjectVariables.CTICALLINFO_FIELD_UUI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.CTICALLINFO, variableFields, null, session, false, true );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.KEY, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.COLLECT_MONTH_FIELD_CONFIDENCE,
			IProjectVariables.COLLECT_MONTH_FIELD_INPUTMODE,
			IProjectVariables.COLLECT_MONTH_FIELD_INTERPRETATION,
			IProjectVariables.COLLECT_MONTH_FIELD_NOINPUTCOUNT,
			IProjectVariables.COLLECT_MONTH_FIELD_NOMATCHCOUNT,
			IProjectVariables.COLLECT_MONTH_FIELD_UTTERANCE,
			IProjectVariables.COLLECT_MONTH_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.COLLECT_MONTH, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_2_FIELD_CONFIDENCE,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_2_FIELD_INPUTMODE,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_2_FIELD_INTERPRETATION,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_2_FIELD_NOINPUTCOUNT,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_2_FIELD_NOMATCHCOUNT,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_2_FIELD_UTTERANCE,
			IProjectVariables.REPLAY_NOTICE_COPY_COPY_2_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REPLAY_NOTICE_COPY_COPY_2, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.GAS_FEE_QRY__TEMP_FIELD_CONFIDENCE,
			IProjectVariables.GAS_FEE_QRY__TEMP_FIELD_INPUTMODE,
			IProjectVariables.GAS_FEE_QRY__TEMP_FIELD_INTERPRETATION,
			IProjectVariables.GAS_FEE_QRY__TEMP_FIELD_NOINPUTCOUNT,
			IProjectVariables.GAS_FEE_QRY__TEMP_FIELD_NOMATCHCOUNT,
			IProjectVariables.GAS_FEE_QRY__TEMP_FIELD_UTTERANCE,
			IProjectVariables.GAS_FEE_QRY__TEMP_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.GAS_FEE_QRY__TEMP, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_ERRORCODE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_MESSAGE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_OBJECT,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_STACKTRACE,
			IProjectVariables.DD_LAST_EXCEPTION_FIELD_TYPE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.DD_LAST_EXCEPTION, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.EMERG_FIELD_CONFIDENCE,
			IProjectVariables.EMERG_FIELD_INPUTMODE,
			IProjectVariables.EMERG_FIELD_INTERPRETATION,
			IProjectVariables.EMERG_FIELD_NOINPUTCOUNT,
			IProjectVariables.EMERG_FIELD_NOMATCHCOUNT,
			IProjectVariables.EMERG_FIELD_UTTERANCE,
			IProjectVariables.EMERG_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.EMERG, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.REPLAY_NOTICE_COPY_FIELD_CONFIDENCE,
			IProjectVariables.REPLAY_NOTICE_COPY_FIELD_INPUTMODE,
			IProjectVariables.REPLAY_NOTICE_COPY_FIELD_INTERPRETATION,
			IProjectVariables.REPLAY_NOTICE_COPY_FIELD_NOINPUTCOUNT,
			IProjectVariables.REPLAY_NOTICE_COPY_FIELD_NOMATCHCOUNT,
			IProjectVariables.REPLAY_NOTICE_COPY_FIELD_UTTERANCE,
			IProjectVariables.REPLAY_NOTICE_COPY_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.REPLAY_NOTICE_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SATISFY_MENU_FIELD_CONFIDENCE,
			IProjectVariables.SATISFY_MENU_FIELD_INPUTMODE,
			IProjectVariables.SATISFY_MENU_FIELD_INTERPRETATION,
			IProjectVariables.SATISFY_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.SATISFY_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.SATISFY_MENU_FIELD_UTTERANCE,
			IProjectVariables.SATISFY_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SATISFY_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.TRANSFER_AGENT_FIELD_ANI,
			IProjectVariables.TRANSFER_AGENT_FIELD_CALLID,
			IProjectVariables.TRANSFER_AGENT_FIELD_DNIS,
			IProjectVariables.TRANSFER_AGENT_FIELD_STATE,
			IProjectVariables.TRANSFER_AGENT_FIELD_STATIONEXTENSION,
			IProjectVariables.TRANSFER_AGENT_FIELD_UCID,
			IProjectVariables.TRANSFER_AGENT_FIELD_UUI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.TRANSFER_AGENT, variableFields, null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.IDX, "1", null, session, false, false );
		session.putVariable(variable);

		variable = com.avaya.sce.runtime.SimpleVariable.createSimpleVariable(IProjectVariables.CUR__G, "", null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.SHAREDUUI_FIELD_ID,
			IProjectVariables.SHAREDUUI_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.SHAREDUUI, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.BIZ_MENU_COPY_FIELD_CONFIDENCE,
			IProjectVariables.BIZ_MENU_COPY_FIELD_INPUTMODE,
			IProjectVariables.BIZ_MENU_COPY_FIELD_INTERPRETATION,
			IProjectVariables.BIZ_MENU_COPY_FIELD_NOINPUTCOUNT,
			IProjectVariables.BIZ_MENU_COPY_FIELD_NOMATCHCOUNT,
			IProjectVariables.BIZ_MENU_COPY_FIELD_UTTERANCE,
			IProjectVariables.BIZ_MENU_COPY_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.BIZ_MENU_COPY, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.IVRTOCSR_FIELD_CSRNUM,
			IProjectVariables.IVRTOCSR_FIELD_MENUCODE,
			IProjectVariables.IVRTOCSR_FIELD_UUI };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.IVRTOCSR, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.BIZ_MENU_FIELD_CONFIDENCE,
			IProjectVariables.BIZ_MENU_FIELD_INPUTMODE,
			IProjectVariables.BIZ_MENU_FIELD_INTERPRETATION,
			IProjectVariables.BIZ_MENU_FIELD_NOINPUTCOUNT,
			IProjectVariables.BIZ_MENU_FIELD_NOMATCHCOUNT,
			IProjectVariables.BIZ_MENU_FIELD_UTTERANCE,
			IProjectVariables.BIZ_MENU_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.BIZ_MENU, variableFields, null, session, false, false );
		session.putVariable(variable);

		variableFields = new String[] {
			IProjectVariables.MAIN_MENU_NIGHT_FIELD_CONFIDENCE,
			IProjectVariables.MAIN_MENU_NIGHT_FIELD_INPUTMODE,
			IProjectVariables.MAIN_MENU_NIGHT_FIELD_INTERPRETATION,
			IProjectVariables.MAIN_MENU_NIGHT_FIELD_NOINPUTCOUNT,
			IProjectVariables.MAIN_MENU_NIGHT_FIELD_NOMATCHCOUNT,
			IProjectVariables.MAIN_MENU_NIGHT_FIELD_UTTERANCE,
			IProjectVariables.MAIN_MENU_NIGHT_FIELD_VALUE };
		variable = com.avaya.sce.runtime.ComplexVariable.createComplexVariable(IProjectVariables.MAIN_MENU_NIGHT, variableFields, null, session, false, false );
		session.putVariable(variable);
	}
	/**
	 * This method returns the name of the application.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public String getEntryName() {
		return("KYGas");
	}
	/**
	 * This method returns a list of life cycle classes for Pluggable Connectors.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public java.util.Collection getPluggableLifeCycle() {
		java.util.ArrayList result = new java.util.ArrayList();
		result.add("com.avaya.sce.runtime.connectivity.cti.pdc.CTIConnectorInit");
		return(result);
	}
	/**
	 * This method returns a list of VXML contributor classes for Pluggable Connectors.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public java.util.Collection getPluggableVXMLContrib() {
		java.util.ArrayList result = new java.util.ArrayList();
		return(result);
	}
	/**
	 * This method returns the root document for the application.
	 * This method is generated automatically and should not be modified
	 * because changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public String getRootDoc() {
		return("AppRoot");
	}
	/**
	 * Builds the list of input parameters that are defined for this application 
	 * entry.  This list is built automatically by adding Input Parameter
	 * nodes to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>java.lang.String</code> objects that
	 * are the names of parameters the application is expecting.
	 * If the AppRoot node does not have any input parameters, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public java.util.Collection getInputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
	/**
	 * Builds the list of capture expression that are defined for this application 
	 * entry.  This list is built automatically by adding Capture Expression
	 * items to AppRoot in the call flow editor.<BR>
	 *
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 *
	 * @return a Collection of <code>CaptureExpression</code> objects that
	 * specify the ECMA script expression and the Orchestration Designer 
	 * session variable that will store the captured result.
	 * If the AppRoot node does not have any capture expression items, then 
	 * this returns an empty list
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public java.util.Collection getCaptureExpressions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return list;
	}
}
