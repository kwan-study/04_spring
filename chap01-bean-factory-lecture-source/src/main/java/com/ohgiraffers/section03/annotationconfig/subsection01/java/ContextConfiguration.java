package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection03")
@ComponentScan(basePackages = "com.ohgiraffers.common")
public class ContextConfiguration {

}
