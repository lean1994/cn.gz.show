package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.LogModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogModelMapper {

    int deleteById(Integer id);

    int insert(LogModel record);

    LogModel select(LogModel logModel);

    int updateById(LogModel logModel);

}