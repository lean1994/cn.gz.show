package cn.gz.tvshow;

import cn.gz.tvshow.pojo.ShowModel;
import cn.gz.tvshow.service.ShowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowServiceTest {
    @Autowired
    ShowService showService;

    @Test
    public void insert() {
        ShowModel showModel = new ShowModel();
        showModel.setId(10008);
        showModel.setName("少儿节目");
        showModel.setTheme("xxxx");
        showModel.setTime(50);
        showModel.setShowCharacter("谢谢谢谢");
        showModel.setTelephone("5538878");
        showModel.setQr("1");
        showModel.setNamedAd("dad");
        showModel.setUpDate(new Date());
        showModel.setUpUserId(10001);
        System.out.println(showService.insert(showModel));
    }

    @Test
    public void delete() {
        System.out.println(showService.deleteById(10008));
    }

    @Test
    public void select() {
        System.out.println(showService.select(10008));
    }

    @Test
    public void update() {
        ShowModel showModel = new ShowModel();
        showModel.setId(10008);
        showModel.setName("少儿节目");
        showModel.setTheme("xxxx");
        showModel.setTime(70);
        showModel.setShowCharacter("去死吧熊孩子");
        showModel.setTelephone("5538878");
        showModel.setQr("1");
        showModel.setNamedAd("dad");
        showModel.setUpDate(new Date());
        showModel.setUpUserId(10001);
        System.out.println(showService.updateByPrimaryKey(showModel));
    }
}
