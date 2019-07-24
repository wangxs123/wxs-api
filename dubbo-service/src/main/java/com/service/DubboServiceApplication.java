package com.service;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wxs
 *
 */
@SpringBootApplication
@MapperScan("com.service.mapper")
public class DubboServiceApplication {

    private static Logger logger = LoggerFactory.getLogger(DubboServiceApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DubboServiceApplication.class, args);
        logger.info("wxs-api服务启动成功");
    }

}
