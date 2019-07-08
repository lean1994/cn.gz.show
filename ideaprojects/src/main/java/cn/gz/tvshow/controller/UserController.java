package cn.gz.tvshow.controller;

import cn.gz.tvshow.pojo.UserModel;
import cn.gz.tvshow.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/userLogin")
    public UserModel userLogin(@Param("name") String uname, @Param("password") String password) {
        return userService.selectByUser(uname, password);
    }

    @RequestMapping("/insertUser")
    public int inserUser(@Param("name") String name, @Param("password") String password, @Param("gender") String gender,
                         @Param("perName") String perName, @Param("telephone") String telephone, @Param("email") String email) {
        UserModel userModel = new UserModel(name, gender, perName, password, "3", "1", telephone, email, new Date(),
                new Date(), 0, "null", new Date(), 10001);
        return userService.insert(userModel);
    }

    @RequestMapping("/selectAllUser")
    public List<UserModel> selectAllUser() {
        return userService.selectAllUser();
    }

    @RequestMapping("/upDateUser")
    @ResponseBody
    public int upDareUser(UserModel userModel) {
        return userService.updateById(userModel);
    }

    @RequestMapping("/deleteUserById")
    public int deleteUser(Integer id) {
        return userService.deleteById(id);
    }

}
