package com.baidu.config;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testconfig {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("John", "Paul", "George", "John","Paul", "John");
        Map<String,Long> map =  names.collect(Collectors.groupingBy(name->name, TreeMap::new,Collectors.counting()));
        System.out.println(map);
    }
}
