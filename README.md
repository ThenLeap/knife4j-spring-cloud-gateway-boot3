## 介绍

```xml
  <modules>
    <module>gateway-service</module>
    <module>user-service</module>
    <module>order-service</module>
    <module>common-module</module>
  </modules>
```

- gateway-service：网关服务，负责请求的转发、权限校验、流量控制等。
- user-service：用户服务，负责用户的注册、登录、权限管理等。
- order-service：订单服务，负责订单的创建、支付、查询等。
- common-module：公共模块，负责一些工具类、工具方法等。

当然，本仓库都没有具体的实现，这里只是描述了各个服务应有的功能。

那么，本仓库的功能是什么呢？

## 功能

整合以下依赖，实现了网关控制访问、网关聚合接口文档
- SpringCloud Alibaba 2023.0.1.2
- SpringCloud 2023.0.3
- SpringBoot 3.2.4
- Knife4j 4.4.0

## 参考
- https://blog.csdn.net/m0_37798046/article/details/117252573
- https://blog.csdn.net/zhangbeizhen18/article/details/129760458
