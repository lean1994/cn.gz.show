package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.GuestModel;

import java.util.List;

public interface GuestService {
    int insert(GuestModel guest);

    int deleteById(Integer id);

    List<GuestModel> select(GuestModel guestModel);

    int updateById(GuestModel guestModel);
}
