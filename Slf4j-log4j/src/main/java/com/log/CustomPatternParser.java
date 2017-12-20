package com.log;


import org.apache.log4j.helpers.PatternParser;

/**
 * 自定义日志解析器
 *
 * @Author: ZhangQingrong
 * @Date : 2017/11/22 14:16
 */
public class CustomPatternParser extends PatternParser {

    public CustomPatternParser(String pattern) {
        super(pattern);
    }

    public void finalizeConverter(char c) {
        if (c == '#') {
            String exs = super.extractOption();
            addConverter(new CustomPatternConverter(formattingInfo, exs));
            currentLiteral.setLength(0);

        } else {
            super.finalizeConverter(c);
        }
    }
}
