package com.fandow.oa;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * 工资条微服务启动类
 *
 * @author <a href="mailto::liruizhao0302@dingtalk.com">李锐钊</a>
 * @version 1.0.0
 * @since 2020-12-12
 */
@SpringBootApplication
@Configuration(proxyBeanMethods=false)
@MapperScan("com.fandow.oa.infrastructure.mapper")
public class OaStaffApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaStaffApplication.class, args);
    }

}
