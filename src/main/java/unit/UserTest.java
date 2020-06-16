package unit;

import controller.UserController;
import mapper.UserMapper;
import model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.UserService;
import service.impl.UserServiceImpl;
import start.App;

import java.util.List;

/**
 * @author CJ
 * @date 2020/6/12
 */
@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void save(){
        User user=new User();
        user.setName("name");
        user.setPwd("pwd");
        boolean saveUser = userService.saveUser(user);
        Assert.assertTrue(saveUser);
    }

    @Test
    public void query(){
        List<User> users = userService.queryUserList();
        System.out.println("users:"+users);
        Assert.assertTrue(users.size()>0);
    }

}
