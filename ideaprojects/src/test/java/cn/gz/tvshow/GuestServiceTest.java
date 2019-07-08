package cn.gz.tvshow;

import cn.gz.tvshow.pojo.GuestModel;
import cn.gz.tvshow.service.GuestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuestServiceTest {

    @Autowired
    GuestService guestService;

    @Test
    public void insert() {
        GuestModel guestModel = new GuestModel();
        guestModel.setName("王五丫");
        guestModel.setGender("女");
        guestModel.setDetails("恶臭年轻人");
        guestModel.setShowId(10001);
        guestModel.setUpDate(new Date());
        guestModel.setUpUserId(10001);
        int falge = guestService.insert(guestModel);
        System.out.println(falge);
    }

    @Test
    public void deleteById() {
        int flage2 = guestService.deleteById(10002);
        System.out.println(flage2);
    }

    @Test
    public void select() {
        GuestModel guestModel = new GuestModel();
        guestModel.setGender("男");
        guestModel.setGender("女");
        List<GuestModel> list = guestService.select(guestModel);
        System.out.println(list);
    }

    @Test
    public void update() {
        GuestModel guestModel = new GuestModel();
        guestModel.setName("王筱筱");
        guestModel.setDetails("文艺青年");
        guestModel.setUpDate(new Date());
        guestModel.setUpUserId(10001);
        guestModel.setId(10003);
        System.out.println(guestService.updateById(guestModel));
        /*System.out.println(new java.sql.Time(System.currentTimeMillis()));*/
    }
}
