package com.log;

import com.log.commonsLog.CommonsLogTest;
import com.log.jdkLog.JdkLogTest;
import com.log.log4j.Log4jTest;
import com.log.log4j2.Log4j2Test;
import com.log.logback.LogBackTest;
import com.log.slf4j.Slf4jTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    public static void main(String[] args) {
        //slf4j
        Slf4jTest.test();
        //logback
        LogBackTest.test();
        //log4j
        Log4jTest.test();
        //log4j2
        Log4j2Test.test();
        //jdk logging
        JdkLogTest.test();
        //commons log
        CommonsLogTest.test();
    }

    @Test
    public void testLog() {
        Logger log = LoggerFactory.getLogger(Slf4jTest.class);
        for (int i = 0; i < 100000; i++) {
            log.info("测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志测试日志");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
