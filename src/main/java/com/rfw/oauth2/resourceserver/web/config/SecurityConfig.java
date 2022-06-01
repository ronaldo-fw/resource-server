package com.rfw.oauth2.resourceserver.web.config;

import com.azure.spring.cloud.autoconfigure.aad.AadResourceServerWebSecurityConfigurerAdapter;
import com.azure.spring.cloud.autoconfigure.aad.properties.AadResourceServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends AadResourceServerWebSecurityConfigurerAdapter {

    @Autowired
    ResourceServerProperties resourceServerProperties;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.cors()
            .and()
            .authorizeRequests().anyRequest().authenticated()
            .and()
            .oauth2ResourceServer().jwt();
    }
}
