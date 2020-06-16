package service;

import com.baomidou.mybatisplus.extension.service.IService;
import model.User;

import java.util.List;

/**
 * @author CJ
 * @date 2020/6/12
 */
public interface UserService extends IService<User> {

    boolean saveUser(User user);

    List<User> queryUserList();

}
