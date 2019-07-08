package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.ShowModel;

public interface ShowService {
    int deleteById(Integer id);

    int insert(ShowModel record);

    ShowModel select(Integer id);

    int updateByPrimaryKey(ShowModel record);
}
