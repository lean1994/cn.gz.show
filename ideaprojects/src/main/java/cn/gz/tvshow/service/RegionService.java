package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.Region;

public interface RegionService {
    int deleteById(Integer id);

    int insert(Region record);

    Region select(Region region);

    int updateById(Region record);
}
