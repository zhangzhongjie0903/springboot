package com.zzj.fmod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Administrator
 * @program: demo
 * @description: FMod启动类
 * @date 2022-05-12 19:56:10
 */
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class FModApplication {
    public static void main(String[] args) {
        SpringApplication.run(FModApplication.class, args);
        System.out.println("服务启动成功");
    }
}
