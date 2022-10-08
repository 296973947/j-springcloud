package cn.jorian.framework.jcloudsonsumer1.mapper;

import cn.jorian.framework.jcloudsonsumer1.entiy.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserMapper {
    List<User> findAll();
}
