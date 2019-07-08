package cn.gz.tvshow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.gz.tvshow")
@EnableAutoConfiguration
public class TvshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(TvshowApplication.class, args);
    }

}
