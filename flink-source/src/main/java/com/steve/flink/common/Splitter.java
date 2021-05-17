package com.steve.flink.common;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;
import org.apache.flink.util.StringUtils;

/**
 * TODO
 *
 * @AUTH: unicom
 * @DATA: 2021/5/1313:59
 */
public class Splitter implements FlatMapFunction<String, Tuple2<String, Integer>> {

    @Override
    public void flatMap(String s,Collector<Tuple2<String, Integer>> collector)throws Exception{

        if(StringUtils.isNullOrWhitespaceOnly(s)){
        System.out.println("invalid line");
        return;
        }

        for(String word:s.split(" ")){
        collector.collect(new Tuple2<String, Integer>(word,1));
        }
    }
}