package cn.jorian.framework.jcloudsonsumer1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan("cn.jorian.framework.jcloudsonsumer1.mapper")
@SpringBootApplication
@EnableEurekaClient
public class JCloudSonsumerApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(JCloudSonsumerApplication1.class, args);
	}

}
