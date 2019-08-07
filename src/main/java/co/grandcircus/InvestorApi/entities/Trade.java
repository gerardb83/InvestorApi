package co.grandcircus.InvestorApi.entities;

import java.sql.Timestamp;

public class Trade {
	
	private Double price;
	private Long size;
	private Long tradeId;
	private Boolean isISO;
	private Boolean isOddLot;
	private Boolean isOutsideRegularHours;
	private Boolean isSinglePriceCross;
	private Boolean isTradeThroughExempt;
	private Timestamp timestamp;
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public Long getTradeId() {
		return tradeId;
	}
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}
	public Boolean getIsISO() {
		return isISO;
	}
	public void setIsISO(Boolean isISO) {
		this.isISO = isISO;
	}
	public Boolean getIsOddLot() {
		return isOddLot;
	}
	public void setIsOddLot(Boolean isOddLot) {
		this.isOddLot = isOddLot;
	}
	public Boolean getIsOutsideRegularHours() {
		return isOutsideRegularHours;
	}
	public void setIsOutsideRegularHours(Boolean isOutsideRegularHours) {
		this.isOutsideRegularHours = isOutsideRegularHours;
	}
	public Boolean getIsSinglePriceCross() {
		return isSinglePriceCross;
	}
	public void setIsSinglePriceCross(Boolean isSinglePriceCross) {
		this.isSinglePriceCross = isSinglePriceCross;
	}
	public Boolean getIsTradeThroughExempt() {
		return isTradeThroughExempt;
	}
	public void setIsTradeThroughExempt(Boolean isTradeThroughExempt) {
		this.isTradeThroughExempt = isTradeThroughExempt;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Trade [price=" + price + ", size=" + size + ", tradeId=" + tradeId + ", isISO=" + isISO + ", isOddLot="
				+ isOddLot + ", isOutsideRegularHours=" + isOutsideRegularHours + ", isSinglePriceCross="
				+ isSinglePriceCross + ", isTradeThroughExempt=" + isTradeThroughExempt + ", timestamp=" + timestamp
				+ "]";
	}


}
