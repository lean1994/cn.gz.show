package cn.gz.tvshow.service;


import cn.gz.tvshow.pojo.ShowViolationModel;

public interface ShowViolationService {
    int insert(ShowViolationModel showViolationModel);

    int delete(Integer id);

    int updateById(ShowViolationModel showViolationModel);

    ShowViolationModel select(ShowViolationModel showViolationModel);
}
