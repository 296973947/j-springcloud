package cn.jorian.framework.jcloudsonsumer1.controller;

import cn.jorian.framework.jcloudsonsumer1.entiy.User;
import cn.jorian.framework.jcloudsonsumer1.service.UserService;
import cn.jorian.framework.jcloudsonsumer1.until.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RedisClient redisClient;
    @Autowired
    private UserService userService;
    @RequestMapping("/user/hello")
    public String hello(){
//        String url="http://provider-user/user/sayHello";
//        return restTemplate.getForObject(url,String.class);
        return "hello2";

    }
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @RequestMapping("/getRedis")
    public Object findRedis(String str){
        redisClient.set(str,"love u");
        return redisClient.get(str);
    }
}
