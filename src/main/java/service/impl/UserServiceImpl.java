package service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import mapper.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

/**
 * @author CJ
 * @date 2020/6/12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean saveUser(User user) {
        return userMapper.insert(user)>0?true:false;
    }

    @Override
    public List<User> queryUserList() {
        return userMapper.selectList(new QueryWrapper<>());
    }

}
