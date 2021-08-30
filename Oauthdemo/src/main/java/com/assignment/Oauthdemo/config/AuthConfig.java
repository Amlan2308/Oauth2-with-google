package com.assignment.Oauthdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class AuthConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
            antMatcher("/**").authorizeRequests()
            .antMatchers("/").authenticated()
            .anyRequest().permitAll()
            .and()
            .oauth2Login();
    }
    

}
