package co.grandcircus.InvestorApi.entities;

import java.util.List;

public class Book {

	private Quote quote;
	private List<Trade> trades;

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	public List<Trade> getTrades() {
		return trades;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}

	@Override
	public String toString() {
		return "Book [quote=" + quote + ", trades=" + trades + "]";
	}

}
