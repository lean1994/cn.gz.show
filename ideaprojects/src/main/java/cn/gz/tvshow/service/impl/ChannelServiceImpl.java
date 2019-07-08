package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.ChannelMapper;
import cn.gz.tvshow.pojo.ChannelModel;
import cn.gz.tvshow.service.ChannelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ChannelService")
public class ChannelServiceImpl implements ChannelService {
    @Resource
    private ChannelMapper channelMapper;


    @Override
    public ChannelModel selectByPrimaryKey(Integer id) {
        return channelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(ChannelModel channelModel) {
        return channelMapper.insert(channelModel);
    }

    @Override
    public int deleteById(Integer id) {
        return channelMapper.deleteById(id);
    }

    @Override
    public List<ChannelModel> select(ChannelModel channelModel) {
        return channelMapper.select(channelModel);
    }

    @Override
    public int updateById(ChannelModel guestModel) {
        return channelMapper.updateById(guestModel);
    }


}
