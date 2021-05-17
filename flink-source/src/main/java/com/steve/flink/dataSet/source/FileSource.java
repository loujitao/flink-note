package com.steve.flink.dataSet.source;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.io.CsvReader;
import org.apache.flink.api.java.operators.DataSource;

/**
 * TODO
 *
 * @AUTH: unicom
 * @DATA: 2021/5/1315:04
 */
public class FileSource {

    public static void main(String[] args) throws Exception{

        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        String csvPath="D:\\testData\\javaFlink\\csv001.txt";


        CsvReader csvReader = env.readCsvFile(csvPath);

        // 基于 readTextFile readFile
        DataSource<String> ds001 = env.readTextFile(csvPath);
        ds001.print();
    }
}
