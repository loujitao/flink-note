package com.steve.flink.dataStream.source;

import org.apache.flink.streaming.api.functions.source.RichParallelSourceFunction;
import org.apache.flink.streaming.api.functions.source.SourceFunction;

/**
 *  可并行执行
 *
 * @AUTH: unicom
 * @DATA: 2021/5/1314:28
 */
public class CustomRichParallelSource extends RichParallelSourceFunction<String>{
    @Override
    public void run(SourceContext<String> sourceContext) throws Exception {

    }

    @Override
    public void cancel() {

    }
}
