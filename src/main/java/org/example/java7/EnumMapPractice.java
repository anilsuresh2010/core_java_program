package org.example.java7;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapPractice {

    public static void main(String[] args) {
        Map<Instrument,String> map =  new EnumMap<>(Instrument.class);
        map.put(Instrument.COMMODITY,"cruid oil silver and gold");
        map.put(Instrument.CURRENCY,"USD, INR");
        map.put(Instrument.EQUITY,"Stocks");
        map.put(Instrument.MF, "Mutual fund");

        for(Map.Entry<Instrument, String> entry :map.entrySet()){
            System.out.println("key : "+entry.getKey()+ "  value  "+entry.getValue());
        }

    }
}
