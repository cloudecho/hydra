hydra
=====

原文档：

Hydra是java开发的分布式跟踪系统。可以接入各种基础组件，完成对业务系统的跟踪。已接入的基础组件是阿里开源的分布式服务框架Dubbo（http://dubbo.io ）。  Hydra可以针对并发量和数据量的大小选择（需要手动配置），是否使用消息中间件，使用Hbase或是Mysql存储跟踪数据。
Hydra自身提供跟踪数据展现功能，基于angularJS和D3.js。提交者：刘宇：yfliuyu@jd.com,项奎：xiangkui@jd.com,边迪:biandi@jd.com。

2016-03-28
* 升級了一些dependency,hadoop+hbase,commons-lang3

2017-02-27
* refactor：将hydra-manager-db模块中hydra.mysql.persistent下的service和entity内容移至hydra-store-interface模块，统一存储层。
* 新增hydra-store/hydra-mongodb模块：元数据与跟踪数据统一存储至mongodb

