package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.ShowArrivalCovterModelMapper;
import cn.gz.tvshow.pojo.ShowArrivalCovterModel;
import cn.gz.tvshow.service.ShowArrivalCovterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ShowArrivalCovterService")
public class ShowArrivalCovterServiceImpl implements ShowArrivalCovterService {
    @Resource
    ShowArrivalCovterModelMapper showArrivalCovterModelMapper;

    @Override
    public int insert(ShowArrivalCovterModel showArrivalCovterModel) {
        return showArrivalCovterModelMapper.insert(showArrivalCovterModel);
    }

    @Override
    public int deleteByShowId(Integer id) {
        return showArrivalCovterModelMapper.deleteByShowId(id);
    }

    @Override
    public int update(ShowArrivalCovterModel showArrivalCovterModel) {
        return showArrivalCovterModelMapper.updateByShowId(showArrivalCovterModel);
    }

    @Override
    public ShowArrivalCovterModel select(ShowArrivalCovterModel showArrivalCovterModel) {
        return showArrivalCovterModelMapper.select(showArrivalCovterModel);
    }


}
