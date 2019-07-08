package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.ShowArrivalCovterModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShowArrivalCovterModelMapper {

    int deleteByShowId(Integer id);

    int insert(ShowArrivalCovterModel record);

    ShowArrivalCovterModel select(ShowArrivalCovterModel showArrivalCovterModel);

    int updateByShowId(ShowArrivalCovterModel showArrivalCovterModel);
}