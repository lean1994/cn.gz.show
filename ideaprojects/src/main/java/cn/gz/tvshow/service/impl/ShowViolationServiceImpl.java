package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.ShowAdvertisingModelMapper;
import cn.gz.tvshow.dao.ShowViolationModelMapper;
import cn.gz.tvshow.pojo.ShowViolationModel;
import cn.gz.tvshow.service.ShowViolationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ShowViolationService")
public class ShowViolationServiceImpl implements ShowViolationService {
    @Resource
    ShowViolationModelMapper showViolationModelMapper;


    @Override
    public int insert(ShowViolationModel showViolationModel) {
        return showViolationModelMapper.insert(showViolationModel);
    }

    @Override
    public int delete(Integer id) {
        return showViolationModelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(ShowViolationModel showViolationModel) {
        return showViolationModelMapper.updateByPrimaryKey(showViolationModel);
    }

    @Override
    public ShowViolationModel select(ShowViolationModel showViolationModel) {
        return showViolationModelMapper.select(showViolationModel);
    }
}
