package com.log;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.PatternParser;

/**
 * 自定义日志输出器
 *
 * @Author: ZhangQingrong
 * @Date : 2017/11/22 14:14
 */
public class CustomPatternLayout extends PatternLayout {

    public CustomPatternLayout() {
        this(DEFAULT_CONVERSION_PATTERN);
    }

    public CustomPatternLayout(String pattern) {
        super(pattern);
    }

    @Override
    protected PatternParser createPatternParser(String pattern) {
        return new CustomPatternParser(pattern);
    }
}
