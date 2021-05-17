package com.steve.flink.dataStream.source;

import org.apache.flink.streaming.api.functions.source.SourceFunction;

/**
 *  不可并行执行
 *
 * @AUTH: unicom
 * @DATA: 2021/5/1314:26
 */
public class CustomSource implements SourceFunction<String>{
    @Override
    public void run(SourceContext<String> sourceContext) throws Exception {

    }

    @Override
    public void cancel() {

    }
}
