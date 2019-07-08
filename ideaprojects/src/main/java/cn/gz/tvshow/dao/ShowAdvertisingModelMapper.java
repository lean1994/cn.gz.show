package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.ShowAdvertisingModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShowAdvertisingModelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ShowAdvertisingModel record);

    ShowAdvertisingModel selectByPrimaryKey(ShowAdvertisingModel showAdvertisingModel);

    int updateById(ShowAdvertisingModel record);
}