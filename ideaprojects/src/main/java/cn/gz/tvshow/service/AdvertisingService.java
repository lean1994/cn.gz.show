package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.AdvertisingModel;

import java.util.List;

public interface AdvertisingService {
    int insert(AdvertisingModel advertisingModel);

    int deleteById(Integer id);

    List<AdvertisingModel> select(AdvertisingModel advertisingModel);

    int updateById(AdvertisingModel advertisingModel);
}
