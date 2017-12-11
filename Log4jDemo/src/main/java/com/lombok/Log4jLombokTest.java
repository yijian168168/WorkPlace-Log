package com.lombok;

import lombok.extern.log4j.Log4j;

/**
 * Created by QR on 2016/9/6.
 */
@Log4j
public class Log4jLombokTest {
    public static void main(String[] args) throws InterruptedException {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {

            new Thread(){
                public void run(){
                    test(start);
                }
            }.start();
        }
        Thread.sleep(60000);
    }

    public static void test(long startTime){
//        log.debug("++++++++++++++++++++++++++++++++i am test, debug+++++++++++++++++++++++++++++++++++++++++");
        log.info("++++++++++++++++++++++++++++++++i am test, info+++++++++++++++++++++++++++++++++++++++++");
        log.warn("++++++++++++++++++++++++++++++++i am test, warn+++++++++++++++++++++++++++++++++++++++++");
        log.error("++++++++++++++++++++++++++++++++i am test, error+++++++++++++++++++++++++++++++++++++++++");
        long end = System.currentTimeMillis();
        log.info("log4j用时"+(end-startTime));
    }

}
