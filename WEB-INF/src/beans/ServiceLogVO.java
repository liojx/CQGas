package beans;

import java.io.Serializable;

public class ServiceLogVO implements Serializable{
	private String callId;
	private String csrId;
	private String orgId;
	private String btKey;
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCsrId() {
		return csrId;
	}
	public void setCsrId(String csrId) {
		this.csrId = csrId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getBtKey() {
		return btKey;
	}
	public void setBtKey(String btKey) {
		this.btKey = btKey;
	}
}
