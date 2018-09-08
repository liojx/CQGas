package beans;

import java.io.Serializable;

public class CallLogVO implements Serializable{
	private String callId;
	private String callType;
	private String callNum;
	private String orgId;
	private String ivrGroup;
	private String csrId;
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getCallNum() {
		return callNum;
	}
	public void setCallNum(String callNum) {
		this.callNum = callNum;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getIvrGroup() {
		return ivrGroup;
	}
	public void setIvrGroup(String ivrGroup) {
		this.ivrGroup = ivrGroup;
	}
	public String getCsrId() {
		return csrId;
	}
	public void setCsrId(String csrId) {
		this.csrId = csrId;
	}
	
}
