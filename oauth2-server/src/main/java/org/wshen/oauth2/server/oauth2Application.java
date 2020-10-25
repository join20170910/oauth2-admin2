package org.wshen.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName oauth2Application
 * @Deacription TODO 启动类
 * @Author apple
 * @Date 2020/10/25 14:48
 * @Version 1.0
 **/

@SpringBootApplication
@MapperScan(basePackages = "org.wshen.oauth2.server.mapper")
public class oauth2Application {
    public static void main(String[] args) {
        SpringApplication.run(oauth2Application.class,args);
    }
}
