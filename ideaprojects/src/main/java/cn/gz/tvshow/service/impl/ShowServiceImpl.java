package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.showModelMapper;
import cn.gz.tvshow.pojo.ShowModel;
import cn.gz.tvshow.service.ShowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ShowService")
public class ShowServiceImpl implements ShowService {
    @Resource
    showModelMapper showmodelmapper;


    @Override
    public int deleteById(Integer id) {
        return showmodelmapper.deleteById(id);
    }

    @Override
    public int insert(ShowModel record) {
        return showmodelmapper.insert(record);
    }

    @Override
    public ShowModel select(Integer id) {
        return showmodelmapper.selectById(id);
    }


    @Override
    public int updateByPrimaryKey(ShowModel record) {
        return showmodelmapper.updateByPrimaryKey(record);
    }
}
