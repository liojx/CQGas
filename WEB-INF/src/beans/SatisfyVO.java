package beans;

import java.io.Serializable;

public class SatisfyVO implements Serializable{
	private String mydId;
	private String callId;
	private String telNo;
	private String agentId;
	private String mydTypeId;
	public String getMydId() {
		return mydId;
	}
	public void setMydId(String mydId) {
		this.mydId = mydId;
	}
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getMydTypeId() {
		return mydTypeId;
	}
	public void setMydTypeId(String mydTypeId) {
		this.mydTypeId = mydTypeId;
	}
	@Override
	public String toString() {
		return "SatisfyVO [mydId=" + mydId + ", callId=" + callId + ", telNo="
				+ telNo + ", agentId=" + agentId + ", mydTypeId=" + mydTypeId
				+ "]";
	}
}
