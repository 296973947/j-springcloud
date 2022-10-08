package cn.jorian.framework.jcloudgetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JCloudGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudGetwayApplication.class, args);
    }

}
