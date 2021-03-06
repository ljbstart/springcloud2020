package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan(basePackages = "com.atguigu.db.mapper.*")
@SpringBootApplication
@Configurable
@EnableAsync
@EnableScheduling
@ComponentScan(basePackages = "com.atguigu")
public class PaMentMain8001 {
}
