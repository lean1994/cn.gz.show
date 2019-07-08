package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.UserMapper;
import cn.gz.tvshow.pojo.UserModel;
import cn.gz.tvshow.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public int insert(UserModel userModel) {
        return userMapper.insert(userModel);
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int updateById(UserModel userModel) {
        return userMapper.updateById(userModel);
    }

    @Override
    public UserModel selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public UserModel selectByUser(@Param("name") String uname, @Param("password") String password) {
        return userMapper.selectByUser(uname, password);
    }

    @Override
    public List<UserModel> selectAllUser() {
        return userMapper.selectAllUser();
    }


}
