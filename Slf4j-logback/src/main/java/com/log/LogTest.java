package com.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/11/22 9:55
 */
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        logger.info(".............test................");
    }
}
