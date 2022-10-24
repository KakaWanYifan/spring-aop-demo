package com.kakawanyifan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.kakawanyifan")
@EnableAspectJAutoProxy
public class SpringConfig {
}
