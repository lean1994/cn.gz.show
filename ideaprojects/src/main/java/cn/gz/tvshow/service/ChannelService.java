package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.ChannelModel;

import java.util.List;

public interface ChannelService {

    ChannelModel selectByPrimaryKey(Integer id);

    int insert(ChannelModel channelModel);

    int deleteById(Integer id);

    List<ChannelModel> select(ChannelModel channelModel);

    int updateById(ChannelModel guestModel);
}
