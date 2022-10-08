package cn.jorian.framework.jcloudsonsumer1.service.impl;

import cn.jorian.framework.jcloudsonsumer1.entiy.User;
import cn.jorian.framework.jcloudsonsumer1.mapper.UserMapper;
import cn.jorian.framework.jcloudsonsumer1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service

@Transactional
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        return userMapper.findAll();
    }
}
