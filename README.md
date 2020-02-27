1、本项目为b站上的狂神说java项目dubbo和zookeeper入门demo项目

2、使用教程
   1、下载zookeeper作为注册中心，我使用的是3.4.14版本
   2、在github上搜索dubbo-admin的master版本作为服务监测中心，下载完毕之后在项目目录下使用maven打包：mvn clean package -Dmaven.test.skip=true 
   3、运行zookeeper的bin文件夹下的zkServer.cm启动注册中心
   4、使用java运行第二步打的jar包： java -jar dubbo-admin-0.0.1-SNAPSHOT.jar，然后访问http://localhost:7001/进入dubbo监测页面
   5、启动项目中的provider-server的application，这时候项目的ticket服务会在zookeeper中注册，并在监测中心中显示
   6、启动项目中的consumer-server的application，访问http://localhost:8002/user/ticket，就会看到返回值了
