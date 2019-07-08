package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.AdvertisingModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdvertisingMapper {
    int insert(AdvertisingModel advertisingModel);

    int deleteById(Integer id);

    List<AdvertisingModel> select(AdvertisingModel advertisingModel);

    int updateById(AdvertisingModel advertisingModel);
}
