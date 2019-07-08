package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.GuestMapper;
import cn.gz.tvshow.pojo.GuestModel;
import cn.gz.tvshow.service.GuestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("GuestService")
public class GuestServiceImpl implements GuestService {
    @Resource
    GuestMapper guestMapper;

    @Override
    public int insert(GuestModel guest) {
        return guestMapper.insert(guest);
    }

    @Override
    public int deleteById(Integer id) {
        return guestMapper.deleteById(id);
    }

    @Override
    public List<GuestModel> select(GuestModel guestModel) {
        return guestMapper.select(guestModel);
    }

    @Override
    public int updateById(GuestModel guestModel) {
        return guestMapper.updateById(guestModel);
    }

}
