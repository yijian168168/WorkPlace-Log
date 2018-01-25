package com.log;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.FormattingInfo;
import org.apache.log4j.helpers.PatternConverter;
import org.apache.log4j.helpers.PatternParser;
import org.apache.log4j.spi.LoggingEvent;

import java.util.HashMap;
import java.util.Map;

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

    /**
     * 自定义日志解析器
     *
     * @Author: ZhangQingrong
     * @Date : 2017/11/22 14:16
     */
    private class CustomPatternParser extends PatternParser {

        public CustomPatternParser(String pattern) {
            super(pattern);
        }

        @Override
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

    /**
     * 自定义日志解析器
     *
     * @Author: ZhangQingrong
     * @Date : 2017/11/22 14:19
     */
    public static class CustomPatternConverter extends PatternConverter {

        private static Map customFields;

        static {
            customFields = new HashMap();
            //ip本机ip地址
            customFields.put("ip",IPUtil.LOCAL_IP);
        }

        private String cfg;

        public CustomPatternConverter(FormattingInfo formattingInfo, String cfg) {
            super(formattingInfo);
            this.cfg = cfg;
        }

        @Override
        protected String convert(LoggingEvent loggingEvent) {
            return String.valueOf(customFields.get(cfg));
        }
    }
}
