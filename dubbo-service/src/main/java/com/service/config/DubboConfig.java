package com.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Dubbo配置类
 *
 * @author wxs
 * @date 2019-05-28 18:45
 */
@Configuration
@PropertySource("classpath:dubbo/dubbo-${spring.profiles.active}.properties")
@ImportResource({"classpath:dubbo/*.xml"})
public class DubboConfig {

}
