package co.grandcircus.InvestorApi.entities;

import java.sql.Timestamp;
import java.util.Date;

public class Quote {

	private String symbol;
	private String companyName;
	private String primaryExchange;
	private String sector;
	private String calculationPrice;
	private Double open;
	private Timestamp openTime;
	private Double close;
	private Timestamp closeTime;
	private Double high;
	private Double low;
	private Double latestPrice;
	private String latestSource;
	private String latestTime;
	private Timestamp latestUpdate;
	private Long latestVolume;
	private Double iexRealtimePrice;
	private Long iexRealtimeSize;
	private Timestamp iexLastUpdated;
	private Double delayedPrice;
	private Timestamp delayedPriceTime;
	private Double extendedPrice;
	private Double extendedChange;
	private Double extendedChangePercent;
	private Timestamp extendedPriceTime;
	private Double previousClose;
	private Double change;
	private Double changePercent;
	private Double iexMarketPercent;
	private Long iexVolume;
	private Long avgTotalVolume;
	private Double iexBidPrice;
	private Long iexBidSize;
	private Double iexAskPrice;
	private Long iexAskSize;
	private Long marketCap;
	private Double peRatio;
	private Double week52High;
	private Double week52Low;
	private Double ytdChange;

	
	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getPrimaryExchange() {
		return primaryExchange;
	}


	public void setPrimaryExchange(String primaryExchange) {
		this.primaryExchange = primaryExchange;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getCalculationPrice() {
		return calculationPrice;
	}


	public void setCalculationPrice(String calculationPrice) {
		this.calculationPrice = calculationPrice;
	}


	public Double getOpen() {
		return open;
	}


	public void setOpen(Double open) {
		this.open = open;
	}


	public Timestamp getOpenTime() {
		return openTime;
	}


	public void setOpenTime(Timestamp openTime) {
		this.openTime = openTime;
	}


	public Double getClose() {
		return close;
	}


	public void setClose(Double close) {
		this.close = close;
	}


	public Timestamp getCloseTime() {
		return closeTime;
	}


	public void setCloseTime(Timestamp closeTime) {
		this.closeTime = closeTime;
	}


	public Double getHigh() {
		return high;
	}


	public void setHigh(Double high) {
		this.high = high;
	}


	public Double getLow() {
		return low;
	}


	public void setLow(Double low) {
		this.low = low;
	}


	public Double getLatestPrice() {
		return latestPrice;
	}


	public void setLatestPrice(Double latestPrice) {
		this.latestPrice = latestPrice;
	}


	public String getLatestSource() {
		return latestSource;
	}


	public void setLatestSource(String latestSource) {
		this.latestSource = latestSource;
	}


	public String getLatestTime() {
		return latestTime;
	}


	public void setLatestTime(String latestTime) {
		this.latestTime = latestTime;
	}


	public Timestamp getLatestUpdate() {
		return latestUpdate;
	}


	public void setLatestUpdate(Timestamp latestUpdate) {
		this.latestUpdate = latestUpdate;
	}


	public Long getLatestVolume() {
		return latestVolume;
	}


	public void setLatestVolume(Long latestVolume) {
		this.latestVolume = latestVolume;
	}


	public Double getIexRealtimePrice() {
		return iexRealtimePrice;
	}


	public void setIexRealtimePrice(Double iexRealtimePrice) {
		this.iexRealtimePrice = iexRealtimePrice;
	}


	public Long getIexRealtimeSize() {
		return iexRealtimeSize;
	}


	public void setIexRealtimeSize(Long iexRealtimeSize) {
		this.iexRealtimeSize = iexRealtimeSize;
	}


	public Timestamp getIexLastUpdated() {
		return iexLastUpdated;
	}


	public void setIexLastUpdated(Timestamp iexLastUpdated) {
		this.iexLastUpdated = iexLastUpdated;
	}


	public Double getDelayedPrice() {
		return delayedPrice;
	}


	public void setDelayedPrice(Double delayedPrice) {
		this.delayedPrice = delayedPrice;
	}


	public Timestamp getDelayedPriceTime() {
		return delayedPriceTime;
	}


	public void setDelayedPriceTime(Timestamp delayedPriceTime) {
		this.delayedPriceTime = delayedPriceTime;
	}


	public Double getExtendedPrice() {
		return extendedPrice;
	}


	public void setExtendedPrice(Double extendedPrice) {
		this.extendedPrice = extendedPrice;
	}


	public Double getExtendedChange() {
		return extendedChange;
	}


	public void setExtendedChange(Double extendedChange) {
		this.extendedChange = extendedChange;
	}


	public Double getExtendedChangePercent() {
		return extendedChangePercent;
	}


	public void setExtendedChangePercent(Double extendedChangePercent) {
		this.extendedChangePercent = extendedChangePercent;
	}


	public Timestamp getExtendedPriceTime() {
		return extendedPriceTime;
	}


	public void setExtendedPriceTime(Timestamp extendedPriceTime) {
		this.extendedPriceTime = extendedPriceTime;
	}


	public Double getPreviousClose() {
		return previousClose;
	}


	public void setPreviousClose(Double previousClose) {
		this.previousClose = previousClose;
	}


	public Double getChange() {
		return change;
	}


	public void setChange(Double change) {
		this.change = change;
	}


	public Double getChangePercent() {
		return changePercent;
	}


	public void setChangePercent(Double changePercent) {
		this.changePercent = changePercent;
	}


	public Double getIexMarketPercent() {
		return iexMarketPercent;
	}


	public void setIexMarketPercent(Double iexMarketPercent) {
		this.iexMarketPercent = iexMarketPercent;
	}


	public Long getIexVolume() {
		return iexVolume;
	}


	public void setIexVolume(Long iexVolume) {
		this.iexVolume = iexVolume;
	}


	public Long getAvgTotalVolume() {
		return avgTotalVolume;
	}


	public void setAvgTotalVolume(Long avgTotalVolume) {
		this.avgTotalVolume = avgTotalVolume;
	}


	public Double getIexBidPrice() {
		return iexBidPrice;
	}


	public void setIexBidPrice(Double iexBidPrice) {
		this.iexBidPrice = iexBidPrice;
	}


	public Long getIexBidSize() {
		return iexBidSize;
	}


	public void setIexBidSize(Long iexBidSize) {
		this.iexBidSize = iexBidSize;
	}


	public Double getIexAskPrice() {
		return iexAskPrice;
	}


	public void setIexAskPrice(Double iexAskPrice) {
		this.iexAskPrice = iexAskPrice;
	}


	public Long getIexAskSize() {
		return iexAskSize;
	}


	public void setIexAskSize(Long iexAskSize) {
		this.iexAskSize = iexAskSize;
	}


	public Long getMarketCap() {
		return marketCap;
	}


	public void setMarketCap(Long marketCap) {
		this.marketCap = marketCap;
	}


	public Double getPeRatio() {
		return peRatio;
	}


	public void setPeRatio(Double peRatio) {
		this.peRatio = peRatio;
	}


	public Double getWeek52High() {
		return week52High;
	}


	public void setWeek52High(Double week52High) {
		this.week52High = week52High;
	}


	public Double getWeek52Low() {
		return week52Low;
	}


	public void setWeek52Low(Double week52Low) {
		this.week52Low = week52Low;
	}


	public Double getYtdChange() {
		return ytdChange;
	}


	public void setYtdChange(Double ytdChange) {
		this.ytdChange = ytdChange;
	}


	@Override
	public String toString() {
		return "Quote [symbol=" + symbol + ", companyName=" + companyName + ", primaryExchange=" + primaryExchange
				+ ", sector=" + sector + ", calculationPrice=" + calculationPrice + ", open=" + open + ", close="
				+ close + ", high=" + high + ", low=" + low + ", latestPrice=" + latestPrice + ", previousClose="
				+ previousClose + ", change=" + change + ", changePercent=" + changePercent + ", avgTotalVolume="
				+ avgTotalVolume + ", peRatio=" + peRatio + ", week52High=" + week52High + ", week52Low=" + week52Low
				+ ", ytdChange=" + ytdChange + "]";
	}
	
		
}
