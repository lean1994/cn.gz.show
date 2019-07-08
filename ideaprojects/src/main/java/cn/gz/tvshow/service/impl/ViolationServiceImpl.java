package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.ViolationModelMapper;
import cn.gz.tvshow.pojo.ViolationModel;
import cn.gz.tvshow.service.ViolationSrtvice;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ViolationService")
public class ViolationServiceImpl implements ViolationSrtvice {
    @Resource
    ViolationModelMapper violationModelMapper;

    @Override
    public int insert(ViolationModel violationModel) {
        return violationModelMapper.insert(violationModel);
    }

    @Override
    public ViolationModel selectByPrimaryKey(ViolationModel violationModel) {
        return violationModelMapper.selectByPrimaryKey(violationModel);
    }

    @Override
    public int updateById(ViolationModel violationModel) {
        return violationModelMapper.updateByPrimaryKey(violationModel);
    }

    @Override
    public int deleteById(Integer id) {
        return violationModelMapper.deleteByPrimaryKey(id);
    }
}
