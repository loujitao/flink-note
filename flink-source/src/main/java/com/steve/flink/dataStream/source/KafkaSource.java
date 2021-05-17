package com.steve.flink.dataStream.source;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;
import org.apache.flink.streaming.connectors.kafka.Kafka010TableSource;
import org.apache.flink.streaming.connectors.kafka.Kafka011TableSource;
import org.apache.kafka.clients.CommonClientConfigs;
import java.util.Properties;

public class KafkaSource {

    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        //2 .指定kafak相关信息
        String kafkaCluster = "k01:9092,k02:9092";
        String kafkaTopic = "test";
        // 3. 创建Kafka数据流
        Properties props = new Properties();
        props.setProperty(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG,kafkaCluster);
        props.setProperty("group.id", "consumer-group");
        props.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty("auto.offset.reset", "latest");

        DataStreamSource<String> ds001 = env.addSource(new FlinkKafkaConsumer010<String>(kafkaTopic, new SimpleStringSchema(), props));

        ds001.print();
    }

}
