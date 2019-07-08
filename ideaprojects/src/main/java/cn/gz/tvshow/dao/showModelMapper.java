package cn.gz.tvshow.dao;


import cn.gz.tvshow.pojo.ShowModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface showModelMapper {


    int deleteById(Integer id);

    int insert(ShowModel record);

    ShowModel selectById(Integer id);

    int updateByPrimaryKey(ShowModel record);


}