package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.List;

/**
 * @author CJ
 * @date 2020/6/12
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/queryUserList",method = RequestMethod.GET)
    @ResponseBody
    public List<User> queryUserList(){
        return userService.queryUserList();
    }

    @RequestMapping(path = "/saveUser",method = RequestMethod.GET)
    @ResponseBody
    public boolean saveUser(){
        for(int i=1;i<=10;i++){
            User user=new User();
            user.setName("name"+i);
            user.setPwd("pwd"+i);
            userService.saveUser(user);
        }
        return true;
    }

}
