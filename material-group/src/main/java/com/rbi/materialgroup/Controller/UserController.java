package com.rbi.materialgroup.Controller;

import com.rbi.materialgroup.Entity.User;
import com.rbi.materialgroup.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String save(){
        User user = new User();
        user.setUserName("111");
        user.setPassword("111");
        user.setGender("1");
        user.setDepartment("行政部");
        userService.save(user);
        return "保存成功";
    }
}
