package com.lombok;


import lombok.extern.slf4j.Slf4j;

/**
 * Created by QR on 2016/9/6.
 */
@Slf4j
public class Log4jLombokTest {

    public static void main(String[] args) throws InterruptedException {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {

            new Thread(){
              public void run(){
                  test(start);
              }
            }.start();
        }
        Thread.sleep(1000);
    }

    public static void test(long startTime){
        log.debug("++++++++++++++++++++++++++++++++i am test, debug+++++++++++++++++++++++++++++++++++++++++");
        log.info("++++++++++++++++++++++++++++++++i am test, info+++++++++++++++++++++++++++++++++++++++++");
        log.warn("++++++++++++++++++++++++++++++++i am test, warn+++++++++++++++++++++++++++++++++++++++++");
        log.error("++++++++++++++++++++++++++++++++i am test, error+++++++++++++++++++++++++++++++++++++++++");
        long end = System.currentTimeMillis();
        log.info("log4j2用时{},",(end-startTime));
    }
}
