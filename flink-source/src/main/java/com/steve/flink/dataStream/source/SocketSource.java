package com.steve.flink.dataStream.source;

import com.steve.flink.common.Splitter;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;

/**
 * 在控制台执行命令nc -lk 9999，即可进入交互模式
 * 此时输出任何字符串再回车，都会将字符串传输到本机9999端口
 *
 * @AUTH: unicom
 * @DATA: 2021/5/1313:54
 */
public class SocketSource {

    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        //监听本地9999端口，读取字符串
        DataStream<String> socketDataStream = env.socketTextStream("localhost", 9999);

        //每五秒钟一次，将当前五秒内所有字符串以空格分割，然后统计单词数量，打印出来
        socketDataStream
                .flatMap(new Splitter())
                .keyBy(0)
                .timeWindow(Time.seconds(5))
                .sum(1)
                .print();

        env.execute("API DataSource demo : socket");
    }



}
