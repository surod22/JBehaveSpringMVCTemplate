package org.jbehave.business;

import org.springframework.stereotype.Component;

@Component
public class TradingServiceImpl implements TradingService {

	public Stock addNewStock(double threshold, double tradeAt) {
        Stock stock = new Stock(threshold);
        stock.setTradeAt(tradeAt);
        return stock;
	}

}
