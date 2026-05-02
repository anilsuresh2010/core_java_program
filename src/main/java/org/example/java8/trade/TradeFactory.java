package org.example.java8.trade;

import java.util.Random;

public class TradeFactory {
    public static Trade createTrade(int tradeId, String symbol, double price, int quantity, Instrument instrument,
                                    Status status){
        int id = new Random().nextInt(100);
        return switch (instrument){
            case EQUITY ->  new EquityTrade(id, symbol, price, quantity, instrument,status);
            case COMMODITY -> new CommodityTrade(id, symbol, price, quantity, instrument,status);
            default -> throw new IllegalArgumentException("Not valid Instrument...");
        };
    }
}
