package cn.gz.tvshow;

import cn.gz.tvshow.pojo.ShowArrivalCovterModel;
import cn.gz.tvshow.service.ShowArrivalCovterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Time;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowArrivalCovterServiceTest {
    @Autowired
    ShowArrivalCovterService showArrivalCovterService;

    @Test
    public void insert() {
        ShowArrivalCovterModel showArrivalCovterModel = new ShowArrivalCovterModel();
        showArrivalCovterModel.setShowId(10002);
        showArrivalCovterModel.setChannelId(1001);
        showArrivalCovterModel.setArrivalRate(21.45);
        showArrivalCovterModel.setBeginTime(new Date(19, 06, 28, 8, 13));
        showArrivalCovterModel.setEndTime(new Date(19, 06, 28, 9, 13));
        showArrivalCovterModel.setCovterNum(65);
        showArrivalCovterModel.setSpreadAllTv(100);
        showArrivalCovterModel.setSpreadPopulation(4555);
        showArrivalCovterModel.setTerminalName("创维");
        showArrivalCovterModel.setTerminalSum(1000);
        showArrivalCovterModel.setUpDate(new Date());
        showArrivalCovterModel.setUpUserId(10001);
        showArrivalCovterModel.setSpreadTerminal(1000);
        System.out.println(showArrivalCovterService.insert(showArrivalCovterModel));
    }

    @Test
    public void delete() {
        System.out.println(showArrivalCovterService.deleteByShowId(10001));
    }

    @Test
    public void update() {
        ShowArrivalCovterModel showArrivalCovterModel = new ShowArrivalCovterModel();
        showArrivalCovterModel.setChannelId(1001);
        showArrivalCovterModel.setArrivalRate(23.55);
        showArrivalCovterModel.setBeginTime(new Date(19, 06, 28, 15, 13));
        showArrivalCovterModel.setEndTime(new Date(19, 06, 28, 16, 13));
        showArrivalCovterModel.setCovterNum(45);
        showArrivalCovterModel.setSpreadAllTv(100);
        showArrivalCovterModel.setSpreadPopulation(4555);
        showArrivalCovterModel.setTerminalName("TCL");
        showArrivalCovterModel.setTerminalSum(1000);
        showArrivalCovterModel.setUpDate(new Date());
        showArrivalCovterModel.setUpUserId(10001);
        showArrivalCovterModel.setSpreadTerminal(1000);
        showArrivalCovterModel.setShowId(10001);
        System.out.println(showArrivalCovterService.update(showArrivalCovterModel));
    }

    @Test
    public void select() {
        ShowArrivalCovterModel showArrivalCovterModel = new ShowArrivalCovterModel();
        showArrivalCovterModel.setShowId(10001);
        System.out.println(showArrivalCovterService.select(showArrivalCovterModel));
    }
}
