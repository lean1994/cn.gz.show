package cn.gz.tvshow;

import cn.gz.tvshow.pojo.ShowAdvertisingModel;
import cn.gz.tvshow.service.ShowAdvertisingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowAdvertisingServiceTest {
    @Autowired
    ShowAdvertisingService showAdvertisingService;

    @Test
    public void insert() {
        System.out.println(showAdvertisingService.insert(new ShowAdvertisingModel(10001, 100011, 10001, new Date(), 10001)));
    }

    @Test
    public void delete() {
        System.out.println(showAdvertisingService.deleteById(10001));
    }

    @Test
    public void update() {
        System.out.println(showAdvertisingService.updateById(new ShowAdvertisingModel(10001, 100013, 10001, new Date(), 10001)));
    }

    @Test
    public void select() {
        ShowAdvertisingModel showAdvertisingModel = new ShowAdvertisingModel();
        showAdvertisingModel.setId(10001);
        System.out.println(showAdvertisingService.select(showAdvertisingModel));
    }
}
