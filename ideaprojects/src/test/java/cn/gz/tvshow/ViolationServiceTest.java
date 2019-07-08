package cn.gz.tvshow;

import cn.gz.tvshow.pojo.ViolationModel;
import cn.gz.tvshow.service.ViolationSrtvice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViolationServiceTest {
    @Autowired
    ViolationSrtvice violationSrtvice;

    @Test
    public void insert() {
        ViolationModel violationModel = new ViolationModel();
        violationModel.setId(1111);
        violationModel.setName("广告超时");
        violationModel.setViolationCategory("广告违规");
        violationModel.setViolationLevel("轻度违规");
        violationModel.setUpDate(new Date());
        violationModel.setUpUserId(10001);
        System.out.println(violationSrtvice.insert(violationModel));
    }

    @Test
    public void delete() {
        System.out.println(violationSrtvice.deleteById(1111));
    }

    @Test
    public void update() {
        ViolationModel violationModel = new ViolationModel();
        violationModel.setId(1111);
        violationModel.setName("广告超时");
        violationModel.setViolationCategory("广告违规");
        violationModel.setViolationLevel("中度违规");
        violationModel.setUpDate(new Date());
        violationModel.setUpUserId(10001);
        System.out.println(violationSrtvice.updateById(violationModel));
    }

    @Test
    public void select() {
        ViolationModel violationModel = new ViolationModel();
        violationModel.setViolationLevel("严重违规");
        violationModel.setId(1111);
        System.out.println(violationSrtvice.updateById(violationModel));
    }
}
