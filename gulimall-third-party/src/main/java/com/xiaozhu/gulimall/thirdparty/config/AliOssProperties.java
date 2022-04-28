package com.xiaozhu.gulimall.thirdparty.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "spring.cloud.alicloud")
@Component
@Data
@RefreshScope
public class AliOssProperties {
    private String accesskey;
    private String secretkey;
    private Map<String,String> oss=new HashMap<>();
}
