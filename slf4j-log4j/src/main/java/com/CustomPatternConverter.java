package com;

import org.apache.log4j.helpers.FormattingInfo;
import org.apache.log4j.helpers.PatternConverter;
import org.apache.log4j.spi.LoggingEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义日志解析器
 *
 * @Author: ZhangQingrong
 * @Date : 2017/11/22 14:19
 */
public class CustomPatternConverter extends PatternConverter {

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

    protected String convert(LoggingEvent loggingEvent) {
        return String.valueOf(customFields.get(cfg));
    }
}
