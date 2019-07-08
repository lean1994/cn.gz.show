package cn.gz.tvshow;

import cn.gz.tvshow.pojo.ShowViolationModel;
import cn.gz.tvshow.service.ShowViolationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowViolationServiceTest {
    @Autowired
    ShowViolationService showViolationService;

    @Test
    public void insert() {
        ShowViolationModel showViolationModel = new ShowViolationModel();
        showViolationModel.setId(11001);
        showViolationModel.setShowId(10001);
        showViolationModel.setViolationsId(1111);
        showViolationModel.setUpDate(new Date());
        showViolationModel.setUpUserId(10001);
        System.out.println(showViolationService.insert(showViolationModel));
    }

    @Test
    public void delete() {
        System.out.println(showViolationService.delete(11001));
    }

    @Test
    public void update() {
        ShowViolationModel showViolationModel = new ShowViolationModel();
        showViolationModel.setId(11001);
        showViolationModel.setShowId(10001);
        showViolationModel.setViolationsId(1111);
        showViolationModel.setUpDate(new Date());
        showViolationModel.setUpUserId(10001);
        System.out.println(showViolationService.updateById(showViolationModel));
    }

    @Test
    public void select() {
        ShowViolationModel showViolationModel = new ShowViolationModel();
        showViolationModel.setId(11001);
        System.out.println(showViolationService.select(showViolationModel));
    }
}
