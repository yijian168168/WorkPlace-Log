package com.log.jdkLog;

import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Logger;

public class JdkLogTest {

    static {
        //对于jul-to-slf4j-1.7.5.ja r的使用
        // 应该在application初始化时加入代码（移除之前存在的handle，安装SLF4JBridgeHandler）
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }

    private static final Logger log = Logger.getLogger(JdkLogTest.class.getName());

    public static void test() {
        log.info("................JdkLogTest..............SUCCESS................");
    }
}
