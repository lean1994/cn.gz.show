package cn.gz.tvshow;

import cn.gz.tvshow.pojo.AdvertisingModel;
import cn.gz.tvshow.service.AdvertisingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdvertisingServiceTest {
    @Autowired
    AdvertisingService advertisingService;

    @Test
    public void insert() {
        AdvertisingModel advertisingModel = new AdvertisingModel();
        advertisingModel.setName("任何克里克");
        advertisingModel.setAdvertiser("任何药业");
        advertisingModel.setAdTelephone("13455568755");
        advertisingModel.setAdTime(50);
        advertisingModel.setType("植入广告");
        advertisingModel.setUpDate(new Date());
        advertisingModel.setUpUserId(10001);
        System.out.println(advertisingService.insert(advertisingModel));
    }

    @Test
    public void deleteById() {
        System.out.println(advertisingService.deleteById(100012));
    }

    @Test
    public void select() {
        AdvertisingModel advertisingModel = new AdvertisingModel();
        advertisingModel.setName("修正胃药");
        System.out.println(advertisingService.select(advertisingModel));
    }

    @Test
    public void update() {
        AdvertisingModel advertisingModel = new AdvertisingModel();
        advertisingModel.setName("仁和咳立克");
        advertisingModel.setId(100013);
        advertisingModel.setAdTime(30);
        advertisingModel.setAdTelephone("15541688945");
        advertisingModel.setUpDate(new Date());
        advertisingModel.setUpUserId(10001);
        System.out.println(advertisingService.updateById(advertisingModel));
    }
}
