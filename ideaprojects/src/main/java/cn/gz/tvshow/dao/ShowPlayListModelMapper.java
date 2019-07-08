package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.ShowPlayListModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShowPlayListModelMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(ShowPlayListModel record);

    ShowPlayListModel select(ShowPlayListModel showPlayListModel);

    int updateByPrimaryKey(ShowPlayListModel record);
}