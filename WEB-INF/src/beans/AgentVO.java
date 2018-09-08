package beans;

import java.io.Serializable;

public class AgentVO implements Serializable {
	private String agentId;
	private String mydId;
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getMydId() {
		return mydId;
	}
	public void setMydId(String mydId) {
		this.mydId = mydId;
	}
}
