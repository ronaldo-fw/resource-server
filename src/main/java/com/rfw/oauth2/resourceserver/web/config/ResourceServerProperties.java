package com.rfw.oauth2.resourceserver.web.config;

import com.azure.spring.cloud.autoconfigure.aad.properties.AadResourceServerProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceServerProperties extends AadResourceServerProperties {

    public ResourceServerProperties() {
        super();
    }
}
