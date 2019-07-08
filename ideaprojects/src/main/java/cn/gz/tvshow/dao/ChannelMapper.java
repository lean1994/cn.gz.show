package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.ChannelModel;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChannelMapper {

    ChannelModel selectByPrimaryKey(Integer id);

    int insert(ChannelModel channelModel);

    int deleteById(Integer id);

    List<ChannelModel> select(ChannelModel channelModel);

    int updateById(ChannelModel guestModel);
}