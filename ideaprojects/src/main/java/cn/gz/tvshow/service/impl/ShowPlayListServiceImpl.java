package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.ShowPlayListModelMapper;
import cn.gz.tvshow.pojo.ShowPlayListModel;
import cn.gz.tvshow.service.ShowPlayListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ShowPlayListService")
public class ShowPlayListServiceImpl implements ShowPlayListService {
    @Resource
    ShowPlayListModelMapper showPlayListModelMapper;

    @Override
    public int insert(ShowPlayListModel showPlayListModel) {
        return showPlayListModelMapper.insert(showPlayListModel);
    }

    @Override
    public int deleteById(Integer id) {
        return showPlayListModelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(ShowPlayListModel showPlayListModel) {
        return showPlayListModelMapper.updateByPrimaryKey(showPlayListModel);
    }

    @Override
    public ShowPlayListModel select(ShowPlayListModel showPlayListModel) {
        return showPlayListModelMapper.select(showPlayListModel);
    }
}
