# 1、基于DataStream的DataSource
### 1) 由集合创建的DataSource
com.steve.flink.dataStream.source.ConllectionSource

### 2) 由文件创建的DataSource
com.steve.flink.dataStream.source.FileSource

### 3) 由socket创建的DataSource
com.steve.flink.dataStream.source.SocketSource

### 4) 用户自定义的DataSource
com.steve.flink.dataStream.source.CustomSource
com.steve.flink.dataStream.source.CustomParallelSource
com.steve.flink.dataStream.source.CustomRichParallelSource



# 2、基于DataSet的DataSource
基于集合生成的
com.steve.flink.dataSet.source.BatchCollectionSource

基于文件生成的
com.steve.flink.dataSet.source.FileSource
