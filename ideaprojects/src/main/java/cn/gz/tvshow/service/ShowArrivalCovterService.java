package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.ShowArrivalCovterModel;

public interface ShowArrivalCovterService {
    int insert(ShowArrivalCovterModel showArrivalCovterModel);

    int deleteByShowId(Integer id);

    int update(ShowArrivalCovterModel showArrivalCovterModel);

    ShowArrivalCovterModel select(ShowArrivalCovterModel showArrivalCovterModel);
}
