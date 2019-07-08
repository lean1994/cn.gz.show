package cn.gz.tvshow;

import cn.gz.tvshow.pojo.ChannelModel;
import cn.gz.tvshow.service.ChannelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChannelServiceTest {
    @Autowired
    ChannelService channelService;

    @Test
    public void selectByPrimaryKey() {
        ChannelModel channelModel = new ChannelModel();
        System.out.println(channelService.selectByPrimaryKey(11001));
    }

    @Test
    public void insert() {
        ChannelModel channelModel = new ChannelModel();
        channelModel.setName("中央电视台11号频道");
        channelModel.setAlias("中央台");
        channelModel.setRegionId(110000);
        channelModel.setShowId(10001);
        channelModel.setType("央视");
        channelModel.setUpDate(new Date());
        channelModel.setUpUserId(10001);
        System.out.println(channelService.insert(channelModel));
    }

    @Test
    public void deleteById() {
        System.out.println(channelService.deleteById(11002));
    }

    @Test
    public void select() {
        ChannelModel channelModel = new ChannelModel();
        channelModel.setId(11001);
        channelModel.setAlias("北京台");
        System.out.println(channelService.select(channelModel));
    }

    @Test
    public void update() {
        ChannelModel channelModel = new ChannelModel();
        channelModel.setAlias("cctv-13");
        channelModel.setId(11003);
        channelModel.setUpDate(new Date());
        channelModel.setUpUserId(10001);
        System.out.println(channelService.updateById(channelModel));
    }
}
