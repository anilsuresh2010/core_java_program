package org.example.java8.trade;

sealed interface Trade permits EquityTrade, CommodityTrade {
    int tradeId();
    String symbol();
    double  price();
    int quantity();
    Instrument instrument();
    Status status();


}
