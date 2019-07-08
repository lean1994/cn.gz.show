package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.RegionMapper;
import cn.gz.tvshow.pojo.Region;
import cn.gz.tvshow.service.RegionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("RegionService")
public class RegionServiceImpl implements RegionService {
    @Resource
    RegionMapper regionMapper;

    @Override
    public int deleteById(Integer id) {
        return regionMapper.deleteById(id);
    }

    @Override
    public int insert(Region record) {
        return regionMapper.insert(record);
    }

    @Override
    public Region select(Region region) {
        return regionMapper.select(region);
    }

    @Override
    public int updateById(Region record) {
        return regionMapper.updateById(record);
    }
}
