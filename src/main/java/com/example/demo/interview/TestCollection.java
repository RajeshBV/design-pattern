package com.example.demo.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestCollection {
  public static void main(String[] args) {
    Map< String, String > cityCode = new ConcurrentHashMap<>();
    cityCode.put("India", "Kolkata");
    cityCode.put("Russia", "Moscow");
    cityCode.put("USA", "New York");
    Iterator< String > iterator = cityCode.keySet().iterator();
    while (iterator.hasNext()) {
      String country = iterator.next();
      if ("India".equals(country)) {
        cityCode.put("India", "Delhi");
        cityCode.put("Pakisthan", "Lahore");
      }
      System.out.println("Country : " + country + ", Capitol : " + cityCode.get(country));
    }
  }
}