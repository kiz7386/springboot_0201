package com.springboot_0201.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggerAspect.class);
}
