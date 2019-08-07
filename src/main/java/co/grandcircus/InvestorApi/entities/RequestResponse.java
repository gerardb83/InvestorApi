package co.grandcircus.InvestorApi.entities;

import java.util.List;

public class RequestResponse {

	private String type;
	private List<Spread> properties;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Spread> getProperties() {
		return properties;
	}

	public void setProperties(List<Spread> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "RequestReponse [properties=" + properties + "]";
	}

}
