package org.wshen.oauth2.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.wshen.oauth2.server.service.impl.UserDetailsServiceImpl;

/**
 * @ClassName WebSecurityConfiguration
 * @Deacription TODO 服务器安全配置
 * @Author apple
 * @Date 2020/10/25 14:46
 * @Version 1.0
 **/

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 使用自定义认证与授权
        auth.userDetailsService(userDetailsService());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // 将 check_token 暴露出去，否则资源服务器访问时报 403 错误
        web.ignoring().antMatchers("/oauth/check_token");
    }
}
