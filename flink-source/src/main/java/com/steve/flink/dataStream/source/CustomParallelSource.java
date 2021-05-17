package com.steve.flink.dataStream.source;

import org.apache.flink.streaming.api.functions.source.ParallelSourceFunction;
/**
*  可以并行执行
* @date: 2021/5/13 14:26
* @author: unicom
*/
public class CustomParallelSource implements ParallelSourceFunction<String>{
    @Override
    public void run(SourceContext sourceContext) throws Exception {

    }

    @Override
    public void cancel() {

    }
}
