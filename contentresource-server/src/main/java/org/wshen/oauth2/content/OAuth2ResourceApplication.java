package org.wshen.oauth2.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "org.wshen.oauth2.content.resource.mapper")
public class OAuth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class, args);
    }
}
