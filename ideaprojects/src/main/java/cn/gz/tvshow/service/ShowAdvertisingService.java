package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.ShowAdvertisingModel;

public interface ShowAdvertisingService {
    int insert(ShowAdvertisingModel showAdvertisingModel);

    int deleteById(Integer id);

    int updateById(ShowAdvertisingModel showAdvertisingModel);

    ShowAdvertisingModel select(ShowAdvertisingModel showAdvertisingModel);
}
