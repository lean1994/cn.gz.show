package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    int insert(UserModel userModel);

    int deleteById(Integer id);

    int updateById(UserModel userModel);

    UserModel selectById(Integer id);

    UserModel selectByUser(@Param("name") String uname, @Param("password") String password);

    List<UserModel> selectAllUser();
}
