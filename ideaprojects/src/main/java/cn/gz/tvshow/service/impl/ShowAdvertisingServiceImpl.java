package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.ShowAdvertisingModelMapper;
import cn.gz.tvshow.dao.ShowPlayListModelMapper;
import cn.gz.tvshow.pojo.ShowAdvertisingModel;
import cn.gz.tvshow.service.ShowAdvertisingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ShowAdvertisingService")
public class ShowAdvertisingServiceImpl implements ShowAdvertisingService {
    @Resource
    ShowAdvertisingModelMapper showAdvertisingModelMapper;

    @Override
    public int insert(ShowAdvertisingModel showAdvertisingModel) {
        return showAdvertisingModelMapper.insert(showAdvertisingModel);
    }

    @Override
    public int deleteById(Integer id) {
        return showAdvertisingModelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(ShowAdvertisingModel showAdvertisingModel) {
        return showAdvertisingModelMapper.updateById(showAdvertisingModel);
    }

    @Override
    public ShowAdvertisingModel select(ShowAdvertisingModel showAdvertisingModel) {
        return showAdvertisingModelMapper.selectByPrimaryKey(showAdvertisingModel);
    }
}
