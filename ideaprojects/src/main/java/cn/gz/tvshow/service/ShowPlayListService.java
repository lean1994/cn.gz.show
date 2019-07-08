package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.ShowPlayListModel;

public interface ShowPlayListService {

    int insert(ShowPlayListModel showPlayListModel);

    int deleteById(Integer id);

    int updateById(ShowPlayListModel showPlayListModel);

    ShowPlayListModel select(ShowPlayListModel showPlayListModel);
}
