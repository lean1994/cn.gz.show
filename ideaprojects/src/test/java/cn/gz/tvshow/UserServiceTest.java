package cn.gz.tvshow;

import cn.gz.tvshow.pojo.UserModel;
import cn.gz.tvshow.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void insert() {
        UserModel userModel = new UserModel();
        userModel.setName("ly19444");
        userModel.setGender("男");
        userModel.setPerName("阿y");
        userModel.setPassword("123456");
        userModel.setAuthority("1");
        userModel.setState("1");
        userModel.setTelephone("1234998657");
        userModel.setEmail("1349986721@qq.com");
        userModel.setRegDate(new Date());
        userModel.setLastReg(new Date());
        userModel.setLoginNum(0);
        userModel.setAutRole("null");
        userModel.setUpDate(new Date());
        userModel.setUpUserId(10001);
        System.out.println(userService.insert(userModel));
    }

    @Test
    public void deleteById() {
        System.out.println(userService.deleteById(10004));
    }

    @Test
    public void update() {
        UserModel userModel = new UserModel();

        userModel.setName("ly19444");
        userModel.setGender("男");
        userModel.setPerName("ere");
        userModel.setPassword("123456");
        userModel.setAuthority("1");
        userModel.setState("1");
        userModel.setTelephone("1234998657");
        userModel.setEmail("1349986721@qq.com");
        userModel.setRegDate(new Date());
        userModel.setLastReg(null);
        userModel.setLoginNum(0);
        userModel.setAutRole(null);
        userModel.setUpDate(new Date());
        userModel.setId(10004);
        userModel.setUpUserId(10001);
        System.out.println(userService.updateById(userModel));
    }

    @Test
    public void select() {
        System.out.println(userService.selectById(10001));
    }

    @Test
    public void selectByUser() {
        System.out.println(userService.selectByUser("gkd01", "123456"));

    }

    @Test
    public void selectall() {
        System.out.println(userService.selectAllUser());
    }
}
