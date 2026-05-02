package org.example.java8.trade;

import java.util.*;
import java.util.stream.Collectors;

public class TradeApp {
    public static void main(String[] args) {
        int tradeId = new Random().nextInt(100);
        List<Trade> trades = Arrays.asList(
                TradeFactory.createTrade(tradeId,"VEDL", 400, 2,Instrument.EQUITY,Status.PENDING),
                TradeFactory.createTrade(tradeId,"Titan", 4000, 3,Instrument.EQUITY,Status.COMPLETED),
                TradeFactory.createTrade(tradeId,"Cruid", 300, 5,Instrument.COMMODITY,Status.COMPLETED),
                TradeFactory.createTrade(tradeId,"Nippon", 100, 34,Instrument.COMMODITY,Status.COMPLETED)

        );

        Map<Instrument, IntSummaryStatistics> collect = trades.stream().collect(Collectors.groupingBy
                (Trade::instrument,Collectors.summarizingInt(Trade::quantity)));
        collect.forEach((k,v)-> System.out.println("Instrument : "+k +" value "+v.getSum()));
    }
}
