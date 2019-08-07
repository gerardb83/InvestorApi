package co.grandcircus.InvestorApi.entities;


public class Spread {
	
	private Long volume;
	private String venue;
	private String venueName;
	private Double effectiveSpread;
	private Double effectiveQuoted;
	private Double priceImprovement;

	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Double getEffectiveSpread() {
		return effectiveSpread;
	}

	public void setEffectiveSpread(Double effectiveSpread) {
		this.effectiveSpread = effectiveSpread;
	}

	public Double getEffectiveQuoted() {
		return effectiveQuoted;
	}

	public void setEffectiveQuoted(Double effectiveQuoted) {
		this.effectiveQuoted = effectiveQuoted;
	}

	public Double getPriceImprovement() {
		return priceImprovement;
	}

	public void setPriceImprovement(Double priceImprovement) {
		this.priceImprovement = priceImprovement;
	}

	@Override
	public String toString() {
		return "Properties [volume=" + volume + ", venue=" + venue + ", venueName=" + venueName + ", effectiveSpread="
				+ effectiveSpread + ", effectiveQuoted=" + effectiveQuoted + ", priceImprovement=" + priceImprovement
				+ "]";
	}

}
