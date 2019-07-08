package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.ShowViolationModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShowViolationModelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ShowViolationModel showViolationModel);

    ShowViolationModel select(ShowViolationModel showViolationModel);

    int updateByPrimaryKey(ShowViolationModel showViolationModel);
}