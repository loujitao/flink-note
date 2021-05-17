package com.steve.flink.dataStream.source;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
* TODO
* @date: 2021/5/13 13:43
* @author: unicom 
*/
public class FileSource {

        public static void main(String[] args) throws Exception{
            StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
            String filePath="D:\\testData\\javaFlink\\20210513.txt";

            // 利用 readTextFile( )和 readFile( )
            DataStream<String> dataStream = env.readTextFile( filePath );
            dataStream.print();
            // scala还有 readCsvFile()



            env.execute();
        }
}
