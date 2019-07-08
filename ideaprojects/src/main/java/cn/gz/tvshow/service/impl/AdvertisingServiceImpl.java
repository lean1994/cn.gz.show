package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.AdvertisingMapper;
import cn.gz.tvshow.pojo.AdvertisingModel;
import cn.gz.tvshow.service.AdvertisingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AdvertisingService")
public class AdvertisingServiceImpl implements AdvertisingService {
    @Resource
    AdvertisingMapper advertisingMapper;

    @Override
    public int insert(AdvertisingModel advertisingModel) {
        return advertisingMapper.insert(advertisingModel);
    }

    @Override
    public int deleteById(Integer id) {
        return advertisingMapper.deleteById(id);
    }

    @Override
    public List<AdvertisingModel> select(AdvertisingModel advertisingModel) {
        return advertisingMapper.select(advertisingModel);
    }

    @Override
    public int updateById(AdvertisingModel advertisingModel) {
        return advertisingMapper.updateById(advertisingModel);
    }
}
