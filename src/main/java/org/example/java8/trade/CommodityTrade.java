package org.example.java8.trade;

record CommodityTrade(int tradeId, String symbol, double price, int quantity, Instrument instrument,
                             Status status) implements  Trade {
}
