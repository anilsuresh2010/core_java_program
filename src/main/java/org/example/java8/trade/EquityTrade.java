package org.example.java8.trade;

record EquityTrade(int tradeId, String symbol, double price, int quantity, Instrument instrument,
                   Status status) implements Trade {

}
