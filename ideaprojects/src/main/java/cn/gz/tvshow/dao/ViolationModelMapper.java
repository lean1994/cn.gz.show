package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.ViolationModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ViolationModelMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(ViolationModel record);

    ViolationModel selectByPrimaryKey(ViolationModel violationModel);

    int updateByPrimaryKey(ViolationModel violationModel);
}