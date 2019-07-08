package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.GuestModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuestMapper {
    int insert(GuestModel guest);

    int deleteById(Integer id);

    List<GuestModel> select(GuestModel guestModel);

    int updateById(GuestModel guestModel);
}
