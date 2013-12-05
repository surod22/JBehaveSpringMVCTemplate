package org.jbehave.business;

public class Stock {

	private double threshold = 0;
	private double trade = 0;
	
	public Stock(double threshold) {
		this.threshold = threshold;
	}
	
	public void setTradeAt(double tradeAt) {
		this.trade = tradeAt;
	}
	
	public StockAlertStatus getStatus() {
		if(this.trade>this.threshold) {
			return StockAlertStatus.ON;
		}
		
		return StockAlertStatus.OFF;
	}
	
}
