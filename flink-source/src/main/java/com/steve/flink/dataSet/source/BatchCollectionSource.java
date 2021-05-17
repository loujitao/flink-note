package com.steve.flink.dataSet.source;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.io.CsvReader;
import org.apache.flink.api.java.operators.DataSource;

import java.util.ArrayList;

/**
 * TODO
 *
 * @AUTH: unicom
 * @DATA: 2021/5/1314:57
 */
public class BatchCollectionSource {
    public static void main(String[] args) throws Exception{
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        ArrayList<String> data = new ArrayList<>();
        data.add("apple bob");
        data.add("cat day");

        // 利用 fromCollection() 或者 fromElements()
        DataSource<String> ds001 = env.fromCollection(data);
        ds001.print();

    }
}
