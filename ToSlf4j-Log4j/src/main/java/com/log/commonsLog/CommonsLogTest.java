package com.log.commonsLog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogTest {

    private static Log log = LogFactory.getLog(CommonsLogTest.class);

    public static void test(){
        log.info("................CommonsLogTest..............SUCCESS................");
    }
}
