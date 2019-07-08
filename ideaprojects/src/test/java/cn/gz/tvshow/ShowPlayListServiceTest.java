package cn.gz.tvshow;

import cn.gz.tvshow.pojo.ShowPlayListModel;
import cn.gz.tvshow.service.ShowPlayListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowPlayListServiceTest {
    @Autowired
    ShowPlayListService showPlayListService;

    @Test
    public void insert() {
        ShowPlayListModel showPlayListModel = new ShowPlayListModel();
        showPlayListModel.setId(10010);
        showPlayListModel.setShowId(10001);
        showPlayListModel.setChannelId(11001);
        showPlayListModel.setBeginTime(new Date(2019 - 1900, 06, 10, 12, 20));
        showPlayListModel.setEndTime(new Date(2019 - 1900, 06, 10, 13, 20));
        showPlayListModel.setUpDate(new Date());
        showPlayListModel.setUpUserId(10001);
        System.out.println(showPlayListService.insert(showPlayListModel));
    }

    @Test
    public void delet() {
        System.out.println(showPlayListService.deleteById(10001));
    }

    @Test
    public void updateById() {
        ShowPlayListModel showPlayListModel = new ShowPlayListModel();
        showPlayListModel.setId(10001);
        showPlayListModel.setShowId(10001);
        showPlayListModel.setChannelId(11001);
        showPlayListModel.setUpDate(new Date());
        showPlayListModel.setUpUserId(10001);
        showPlayListModel.setId(10002);
        System.out.println(showPlayListService.updateById(showPlayListModel));
    }

    @Test
    public void select() {
        ShowPlayListModel showPlayListModel = new ShowPlayListModel();
        showPlayListModel.setId(10002);
        System.out.println(showPlayListService.select(showPlayListModel));
    }
}
