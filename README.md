# cdeer-im
基于Netty+Redis+protobuf开发的即时通讯服务器  

第一版是一个简版，只实现了很少的功能，现在已经迁移到 [v1.0](https://github.com/linyu19872008/cdeer-im/tree/v1.0)  
第二版的目标有以下几点：  
1  工程用Maven、Spring管理  
2  重新定义协议  
3  丢包处理  
4  支持websocket  
5  集群  
支持功能包括：  
1  一对一对话  
2  群组聊天  
3  出席  
4  会话(暂缓)