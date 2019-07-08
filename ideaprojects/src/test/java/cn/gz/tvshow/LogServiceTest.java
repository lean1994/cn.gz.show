package cn.gz.tvshow;

import cn.gz.tvshow.pojo.LogModel;
import cn.gz.tvshow.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogServiceTest {
    @Autowired
    LogService logService;

    @Test
    public void insert() {
        LogModel logModel = new LogModel();
        logModel.setDateId(10001);
        logModel.setDateId(10001);
        logModel.setList("name");
        logModel.setOldValue("ax");
        logModel.setNewValue("axb");
        logModel.setTableName("guest");
        logModel.setUpDate(new Date());
        logModel.setUpUserId(10001);
        logModel.setRemarks("雨女无瓜");
        System.out.println(logService.insert(logModel));
    }

    @Test
    public void select() {
        LogModel logModel = new LogModel();
        logModel.setTableName("guest");
        System.out.println(logService.select(logModel));
    }

    @Test
    public void update() {
        LogModel logModel = new LogModel();
        logModel.setTableName("channel");
        logModel.setDateId(10002);
        logModel.setList("showid");
        logModel.setOldValue("王三丫");
        logModel.setNewValue("王丫丫");
        logModel.setUpDate(new Date());
        logModel.setUpUserId(10001);
        logModel.setId(1);
        System.out.println(logService.updateById(logModel));
    }

    @Test
    public void deleteById() {
        int i = logService.deleteById(1);
        System.out.println(i);

    }
}
