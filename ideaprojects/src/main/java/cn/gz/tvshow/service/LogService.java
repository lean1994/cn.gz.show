package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.LogModel;

public interface LogService {
    int deleteById(Integer id);

    int insert(LogModel record);

    LogModel select(LogModel logModel);

    int updateById(LogModel LogModel);
}
