package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(UserModel userModel);

    int deleteById(Integer id);

    int updateById(UserModel userModel);

    UserModel selectById(Integer id);

    UserModel selectByUser(@Param("name") String uname, @Param("password") String password);

    List<UserModel> selectAllUser();
}
