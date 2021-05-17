package com.steve.flink.dataStream.source;

import com.steve.flink.bean.Person;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;
import java.util.List;

/**
* TODO
* @author unicom
* @date 2021/5/13 11:27
*/
public class ConllectionSource {

    public static void main(String[] args) throws Exception {

        // 获取上下文的环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        List<Person> ts =  Arrays.asList(
                new Person("sensor_1", 15321312412L, 41),
                new Person("sensor_2", 15321763412L, 47),
                new Person("sensor_3", 15369732412L, 49)
        );

//        1）最简单的generateSequence()
//        DataStream<Long> ds01 = env.generateSequence(1, 10); //多态表示方式
        DataStreamSource<Long> ds01 = env.generateSequence(1, 10);
        ds01.print();
        System.out.println("============================");

//        2）利用fromElements() 和fromCollection()
        DataStreamSource<Person> dataStream = env.fromCollection(ts );
        dataStream.print();
        System.out.println("============================");

        DataStreamSource<Person> ds03 = env.fromElements(
                new Person("zhangsan", 123, 20),
                new Person("lisi", 124, 27),
                new Person("wangwu", 125, 28)
        );
        ds03.print();
        System.out.println("============================");

        env.execute();
    }

}
