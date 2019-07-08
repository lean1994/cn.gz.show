package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.ViolationModel;

public interface ViolationSrtvice {
    int insert(ViolationModel violationModel);

    ViolationModel selectByPrimaryKey(ViolationModel violationModel);

    int updateById(ViolationModel violationModel);

    int deleteById(Integer id);

}
