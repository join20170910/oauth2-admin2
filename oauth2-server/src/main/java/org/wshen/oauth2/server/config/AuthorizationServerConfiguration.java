package org.wshen.oauth2.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @ClassName AuthorizationServerConfiguration
 * @Deacription TODO 配置认证服务器
 * @Author apple
 * @Date 2020/10/25 14:36
 * @Version 1.0
 **/

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    //配置 客户端 用户及密码  使用内存模式
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //使用内存设置
        clients.inMemory()
                //client_id
                .withClient("client")
                //client_secret
                .secret("secret")
                //授权类型
                .authorizedGrantTypes("authorization_code")
                //授权范围
                .scopes("app")
                //注册回调地址
                .redirectUris("http://127.0.0.1:8080/index");
    }
}
