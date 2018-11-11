package flow;

/**
 * This interface is used to define the name of variables that are 
 * declared in the call flow.  All variables are defined as 
 * <code>public static final String</code>, which allows user-defined
 * code to reference variable names by the Java variable name.
 * Last generated by Orchestration Designer at: 2016年8月28日 下午10时36分57秒
 */
public interface IProjectVariables {





	//{{START:PROJECT:VARIABLES
	/**
	 * This is a reserved block of variable name definitions.
	 * The variable names defined here can be used as the key
	 * to get the <code>com.avaya.sce.runtime.Variable</code>
	 * from the <code>SCESession</code> at runtime.<br>
	 * 
	 * For example, given a variable name <code>phoneNum</code>,
	 * user-defined code should access the variable in this format:<PRE>
	 *   Variable phNum = mySession.getVariable(IProjectVariables.PHONE_NUM);
	 *   if ( phNum != null ) {
	 *        // do something with the variable
	 *   }</PRE>
	 * 
	 * This block of code is generated automatically by Orchestration Designer and should not
	 * be manually edited as changes may be overwritten by future code generation.
	 * Last generated by Orchestration Designer at: (timestamp generation disabled)
	 */
	public static final String TRANSFER_TO_CELL = "TransferToCell";
	public static final String E_INPUT = "eInput";
	public static final String TIME = "time";
	public static final String REDIRECTINFO = "redirectinfo";
	public static final String GAS_FEE_QRY = "GasFeeQry";
	public static final String SESSION = "session";
	public static final String MAIN_MENU_DAY = "MainMenuDay";
	public static final String DATE = "date";
	public static final String DAY_OR_NIGHT = "dayOrNight";
	public static final String NOTICE_MENU = "NoticeMenu";
	public static final String REPLAY_FEE_INFO = "ReplayFeeInfo";
	public static final String REPLAY_NOTICE_COPY_COPY = "ReplayNoticeCopyCopy";
	public static final String IS_EXIST = "isExist";
	public static final String MAX_ERROR_CNT = "maxErrorCnt";
	public static final String CQVALUE = "CQValue";
	public static final String CTICALLINFO = "cticallinfo";
	public static final String KEY = "key";
	public static final String COLLECT_MONTH = "CollectMonth";
	public static final String REPLAY_NOTICE_COPY_COPY_2 = "ReplayNoticeCopyCopy2";
	public static final String GAS_FEE_QRY__TEMP = "GasFeeQry_temp";
	public static final String DD_LAST_EXCEPTION = "ddLastException";
	public static final String EMERG = "emerg";
	public static final String REPLAY_NOTICE_COPY = "ReplayNoticeCopy";
	public static final String SATISFY_MENU = "SatisfyMenu";
	public static final String TRANSFER_AGENT = "transferAgent";
	public static final String SHAREDUUI = "shareduui";
	public static final String BIZ_MENU_COPY = "BizMenuCopy";
	public static final String IVRTOCSR = "IVRTOCSR";
	public static final String BIZ_MENU = "BizMenu";
	public static final String MAIN_MENU_NIGHT = "MainMenuNight";
	//}}END:PROJECT:VARIABLES
	//{{START:PROJECT:VARIABLEFIELDS
	public static final String E_INPUT_FIELD_COLUMN_0 = "Column0";
	public static final String E_INPUT_FIELD_CONFIDENCE = "confidence";
	public static final String E_INPUT_FIELD_INPUTMODE = "inputmode";
	public static final String E_INPUT_FIELD_INTERPRETATION = "interpretation";
	public static final String E_INPUT_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String E_INPUT_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String E_INPUT_FIELD_UTTERANCE = "utterance";
	public static final String E_INPUT_FIELD_VALUE = "value";
	public static final String TIME_FIELD_AUDIO = "audio";
	public static final String TIME_FIELD_HOUR = "hour";
	public static final String TIME_FIELD_MILLISECOND = "millisecond";
	public static final String TIME_FIELD_MINUTE = "minute";
	public static final String TIME_FIELD_SECOND = "second";
	public static final String TIME_FIELD_TIMEZONE = "timezone";
	public static final String REDIRECTINFO_FIELD_PRESENTATIONINFO = "presentationinfo";
	public static final String REDIRECTINFO_FIELD_REASON = "reason";
	public static final String REDIRECTINFO_FIELD_SCREENINGINFO = "screeninginfo";
	public static final String REDIRECTINFO_FIELD_URI = "uri";
	public static final String GAS_FEE_QRY_FIELD_CONFIDENCE = "confidence";
	public static final String GAS_FEE_QRY_FIELD_INPUTMODE = "inputmode";
	public static final String GAS_FEE_QRY_FIELD_INTERPRETATION = "interpretation";
	public static final String GAS_FEE_QRY_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GAS_FEE_QRY_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GAS_FEE_QRY_FIELD_UTTERANCE = "utterance";
	public static final String GAS_FEE_QRY_FIELD_VALUE = "value";
	public static final String SESSION_FIELD_AAI = "aai";
	public static final String SESSION_FIELD_ANI = "ani";
	public static final String SESSION_FIELD_CALLTAG = "calltag";
	public static final String SESSION_FIELD_CHANNEL = "channel";
	public static final String SESSION_FIELD_CHANNELTYPE = "channeltype";
	public static final String SESSION_FIELD_CONVERSEFIRST = "conversefirst";
	public static final String SESSION_FIELD_CONVERSESECOND = "conversesecond";
	public static final String SESSION_FIELD_CURRENTLANGUAGE = "currentlanguage";
	public static final String SESSION_FIELD_DNIS = "dnis";
	public static final String SESSION_FIELD_EXIT_CUSTOMER_ID = "exitCustomerId";
	public static final String SESSION_FIELD_EXIT_INFO_1 = "exitInfo1";
	public static final String SESSION_FIELD_EXIT_INFO_2 = "exitInfo2";
	public static final String SESSION_FIELD_EXIT_PREFERRED_PATH = "exitPreferredPath";
	public static final String SESSION_FIELD_EXIT_REASON = "exitReason";
	public static final String SESSION_FIELD_EXIT_TOPIC = "exitTopic";
	public static final String SESSION_FIELD_LASTERROR = "lasterror";
	public static final String SESSION_FIELD_MEDIATYPE = "mediatype";
	public static final String SESSION_FIELD_PROTOCOLNAME = "protocolname";
	public static final String SESSION_FIELD_PROTOCOLVERSION = "protocolversion";
	public static final String SESSION_FIELD_SESSIONID = "sessionid";
	public static final String SESSION_FIELD_SESSIONLABEL = "sessionlabel";
	public static final String SESSION_FIELD_SHAREDMODE = "sharedmode";
	public static final String SESSION_FIELD_UCID = "ucid";
	public static final String SESSION_FIELD_UUI = "uui";
	public static final String SESSION_FIELD_VIDEOBITRATE = "videobitrate";
	public static final String SESSION_FIELD_VIDEOCODEC = "videocodec";
	public static final String SESSION_FIELD_VIDEOENABLED = "videoenabled";
	public static final String SESSION_FIELD_VIDEOFARFMTP = "videofarfmtp";
	public static final String SESSION_FIELD_VIDEOFORMAT = "videoformat";
	public static final String SESSION_FIELD_VIDEOFPS = "videofps";
	public static final String SESSION_FIELD_VIDEOHEIGHT = "videoheight";
	public static final String SESSION_FIELD_VIDEONEARFMTP = "videonearfmtp";
	public static final String SESSION_FIELD_VIDEOWIDTH = "videowidth";
	public static final String SESSION_FIELD_VPCALLEDEXTENSION = "vpcalledextension";
	public static final String SESSION_FIELD_VPCONVERSEONDATA = "vpconverseondata";
	public static final String SESSION_FIELD_VPCOVERAGEREASON = "vpcoveragereason";
	public static final String SESSION_FIELD_VPCOVERAGETYPE = "vpcoveragetype";
	public static final String SESSION_FIELD_VPRDNIS = "vprdnis";
	public static final String SESSION_FIELD_VPREPORTURL = "vpreporturl";
	public static final String MAIN_MENU_DAY_FIELD_CONFIDENCE = "confidence";
	public static final String MAIN_MENU_DAY_FIELD_INPUTMODE = "inputmode";
	public static final String MAIN_MENU_DAY_FIELD_INTERPRETATION = "interpretation";
	public static final String MAIN_MENU_DAY_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String MAIN_MENU_DAY_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String MAIN_MENU_DAY_FIELD_UTTERANCE = "utterance";
	public static final String MAIN_MENU_DAY_FIELD_VALUE = "value";
	public static final String DATE_FIELD_AUDIO = "audio";
	public static final String DATE_FIELD_DAYOFMONTH = "dayofmonth";
	public static final String DATE_FIELD_DAYOFWEEK = "dayofweek";
	public static final String DATE_FIELD_DAYOFWEEKNUM = "dayofweeknum";
	public static final String DATE_FIELD_DAYOFYEAR = "dayofyear";
	public static final String DATE_FIELD_MONTH = "month";
	public static final String DATE_FIELD_MONTHINYEAR = "monthinyear";
	public static final String DATE_FIELD_YEAR = "year";
	public static final String NOTICE_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String NOTICE_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String NOTICE_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String NOTICE_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String NOTICE_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String NOTICE_MENU_FIELD_UTTERANCE = "utterance";
	public static final String NOTICE_MENU_FIELD_VALUE = "value";
	public static final String REPLAY_FEE_INFO_FIELD_CONFIDENCE = "confidence";
	public static final String REPLAY_FEE_INFO_FIELD_INPUTMODE = "inputmode";
	public static final String REPLAY_FEE_INFO_FIELD_INTERPRETATION = "interpretation";
	public static final String REPLAY_FEE_INFO_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String REPLAY_FEE_INFO_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String REPLAY_FEE_INFO_FIELD_UTTERANCE = "utterance";
	public static final String REPLAY_FEE_INFO_FIELD_VALUE = "value";
	public static final String REPLAY_NOTICE_COPY_COPY_FIELD_CONFIDENCE = "confidence";
	public static final String REPLAY_NOTICE_COPY_COPY_FIELD_INPUTMODE = "inputmode";
	public static final String REPLAY_NOTICE_COPY_COPY_FIELD_INTERPRETATION = "interpretation";
	public static final String REPLAY_NOTICE_COPY_COPY_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String REPLAY_NOTICE_COPY_COPY_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String REPLAY_NOTICE_COPY_COPY_FIELD_UTTERANCE = "utterance";
	public static final String REPLAY_NOTICE_COPY_COPY_FIELD_VALUE = "value";
	public static final String CQVALUE_FIELD_AGENTID = "agentid";
	public static final String CQVALUE_FIELD_CALLID = "callid";
	public static final String CQVALUE_FIELD_CALLTYPE = "calltype";
	public static final String CQVALUE_FIELD_CUSTTYPE = "custtype";
	public static final String CQVALUE_FIELD_ERRORCOUNT = "errorcount";
	public static final String CQVALUE_FIELD_ERRORCOUNT_1_0 = "errorcount10";
	public static final String CQVALUE_FIELD_ERRORCOUNT_1_1 = "errorcount11";
	public static final String CQVALUE_FIELD_ERRORCOUNT_1_2 = "errorcount12";
	public static final String CQVALUE_FIELD_ERRORCOUNT_2 = "errorcount2";
	public static final String CQVALUE_FIELD_ERRORCOUNT_3 = "errorcount3";
	public static final String CQVALUE_FIELD_ERRORCOUNT_4 = "errorcount4";
	public static final String CQVALUE_FIELD_ERRORCOUNT_5 = "errorcount5";
	public static final String CQVALUE_FIELD_ERRORCOUNT_6 = "errorcount6";
	public static final String CQVALUE_FIELD_ERRORCOUNT_7 = "errorcount7";
	public static final String CQVALUE_FIELD_ERRORCOUNT_8 = "errorcount8";
	public static final String CQVALUE_FIELD_ERRORCOUNT_9 = "errorcount9";
	public static final String CQVALUE_FIELD_FEERESULT = "feeresult";
	public static final String CQVALUE_FIELD_KHID = "khid";
	public static final String CQVALUE_FIELD_MYDID = "mydid";
	public static final String CQVALUE_FIELD_NODECODE = "nodecode";
	public static final String CQVALUE_FIELD_NOTICEMSG = "noticemsg";
	public static final String CQVALUE_FIELD_SATISFYFLAG = "satisfyflag";
	public static final String CQVALUE_FIELD_VIPFLAG = "vipflag";
	public static final String CQVALUE_FIELD_YQZH = "yqzh";
	public static final String CTICALLINFO_FIELD_ANI = "ani";
	public static final String CTICALLINFO_FIELD_CALLID = "callid";
	public static final String CTICALLINFO_FIELD_DNIS = "dnis";
	public static final String CTICALLINFO_FIELD_STATE = "state";
	public static final String CTICALLINFO_FIELD_STATIONEXTENSION = "stationextension";
	public static final String CTICALLINFO_FIELD_UCID = "ucid";
	public static final String CTICALLINFO_FIELD_UUI = "uui";
	public static final String COLLECT_MONTH_FIELD_CONFIDENCE = "confidence";
	public static final String COLLECT_MONTH_FIELD_INPUTMODE = "inputmode";
	public static final String COLLECT_MONTH_FIELD_INTERPRETATION = "interpretation";
	public static final String COLLECT_MONTH_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String COLLECT_MONTH_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String COLLECT_MONTH_FIELD_UTTERANCE = "utterance";
	public static final String COLLECT_MONTH_FIELD_VALUE = "value";
	public static final String REPLAY_NOTICE_COPY_COPY_2_FIELD_CONFIDENCE = "confidence";
	public static final String REPLAY_NOTICE_COPY_COPY_2_FIELD_INPUTMODE = "inputmode";
	public static final String REPLAY_NOTICE_COPY_COPY_2_FIELD_INTERPRETATION = "interpretation";
	public static final String REPLAY_NOTICE_COPY_COPY_2_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String REPLAY_NOTICE_COPY_COPY_2_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String REPLAY_NOTICE_COPY_COPY_2_FIELD_UTTERANCE = "utterance";
	public static final String REPLAY_NOTICE_COPY_COPY_2_FIELD_VALUE = "value";
	public static final String GAS_FEE_QRY__TEMP_FIELD_CONFIDENCE = "confidence";
	public static final String GAS_FEE_QRY__TEMP_FIELD_INPUTMODE = "inputmode";
	public static final String GAS_FEE_QRY__TEMP_FIELD_INTERPRETATION = "interpretation";
	public static final String GAS_FEE_QRY__TEMP_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String GAS_FEE_QRY__TEMP_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String GAS_FEE_QRY__TEMP_FIELD_UTTERANCE = "utterance";
	public static final String GAS_FEE_QRY__TEMP_FIELD_VALUE = "value";
	public static final String DD_LAST_EXCEPTION_FIELD_ERRORCODE = "errorcode";
	public static final String DD_LAST_EXCEPTION_FIELD_MESSAGE = "message";
	public static final String DD_LAST_EXCEPTION_FIELD_OBJECT = "object";
	public static final String DD_LAST_EXCEPTION_FIELD_STACKTRACE = "stacktrace";
	public static final String DD_LAST_EXCEPTION_FIELD_TYPE = "type";
	public static final String EMERG_FIELD_CONFIDENCE = "confidence";
	public static final String EMERG_FIELD_INPUTMODE = "inputmode";
	public static final String EMERG_FIELD_INTERPRETATION = "interpretation";
	public static final String EMERG_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String EMERG_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String EMERG_FIELD_UTTERANCE = "utterance";
	public static final String EMERG_FIELD_VALUE = "value";
	public static final String REPLAY_NOTICE_COPY_FIELD_CONFIDENCE = "confidence";
	public static final String REPLAY_NOTICE_COPY_FIELD_INPUTMODE = "inputmode";
	public static final String REPLAY_NOTICE_COPY_FIELD_INTERPRETATION = "interpretation";
	public static final String REPLAY_NOTICE_COPY_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String REPLAY_NOTICE_COPY_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String REPLAY_NOTICE_COPY_FIELD_UTTERANCE = "utterance";
	public static final String REPLAY_NOTICE_COPY_FIELD_VALUE = "value";
	public static final String SATISFY_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String SATISFY_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String SATISFY_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String SATISFY_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String SATISFY_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String SATISFY_MENU_FIELD_UTTERANCE = "utterance";
	public static final String SATISFY_MENU_FIELD_VALUE = "value";
	public static final String TRANSFER_AGENT_FIELD_ANI = "ani";
	public static final String TRANSFER_AGENT_FIELD_CALLID = "callid";
	public static final String TRANSFER_AGENT_FIELD_DNIS = "dnis";
	public static final String TRANSFER_AGENT_FIELD_STATE = "state";
	public static final String TRANSFER_AGENT_FIELD_STATIONEXTENSION = "stationextension";
	public static final String TRANSFER_AGENT_FIELD_UCID = "ucid";
	public static final String TRANSFER_AGENT_FIELD_UUI = "uui";
	public static final String SHAREDUUI_FIELD_ID = "id";
	public static final String SHAREDUUI_FIELD_VALUE = "value";
	public static final String BIZ_MENU_COPY_FIELD_CONFIDENCE = "confidence";
	public static final String BIZ_MENU_COPY_FIELD_INPUTMODE = "inputmode";
	public static final String BIZ_MENU_COPY_FIELD_INTERPRETATION = "interpretation";
	public static final String BIZ_MENU_COPY_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String BIZ_MENU_COPY_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String BIZ_MENU_COPY_FIELD_UTTERANCE = "utterance";
	public static final String BIZ_MENU_COPY_FIELD_VALUE = "value";
	public static final String IVRTOCSR_FIELD_CSRNUM = "csrnum";
	public static final String IVRTOCSR_FIELD_MENUCODE = "menucode";
	public static final String IVRTOCSR_FIELD_UUI = "uui";
	public static final String BIZ_MENU_FIELD_CONFIDENCE = "confidence";
	public static final String BIZ_MENU_FIELD_INPUTMODE = "inputmode";
	public static final String BIZ_MENU_FIELD_INTERPRETATION = "interpretation";
	public static final String BIZ_MENU_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String BIZ_MENU_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String BIZ_MENU_FIELD_UTTERANCE = "utterance";
	public static final String BIZ_MENU_FIELD_VALUE = "value";
	public static final String MAIN_MENU_NIGHT_FIELD_CONFIDENCE = "confidence";
	public static final String MAIN_MENU_NIGHT_FIELD_INPUTMODE = "inputmode";
	public static final String MAIN_MENU_NIGHT_FIELD_INTERPRETATION = "interpretation";
	public static final String MAIN_MENU_NIGHT_FIELD_NOINPUTCOUNT = "noinputcount";
	public static final String MAIN_MENU_NIGHT_FIELD_NOMATCHCOUNT = "nomatchcount";
	public static final String MAIN_MENU_NIGHT_FIELD_UTTERANCE = "utterance";
	public static final String MAIN_MENU_NIGHT_FIELD_VALUE = "value";
	//}}END:PROJECT:VARIABLEFIELDS
}
