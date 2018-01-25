package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/11/22 9:55
 */
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        MDC.put("appName","slf4j-log4j2");
        for (int i = 0; i < 5; i++) {
            MDC.put("logId",String.valueOf(i));
            logger.info(".............test logback................");
        }
    }
}
