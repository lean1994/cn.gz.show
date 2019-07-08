package cn.gz.tvshow;

import cn.gz.tvshow.pojo.Region;
import cn.gz.tvshow.service.RegionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionServiceTest {
    @Autowired
    RegionService regionService;

    @Test
    public void insert() {
        Region region = new Region();
        region.setId(130000);
        region.setName("河北市");
        region.setRegionCode("100000");
        region.setRegionShortName("河北");
        region.setUpDate(new Date());
        region.setUpUserId(10001);
        System.out.println(regionService.insert(region));
    }

    @Test
    public void deleteById() {
        System.out.println(regionService.deleteById(130000));
    }

    @Test
    public void updateById() {
        Region region = new Region();
        region.setName("北京市");
        region.setRegionShortName("北京");
        region.setUpDate(new Date());
        region.setId(110000);
        System.out.println(regionService.updateById(region));
    }

    @Test
    public void select() {
        Region region = new Region();
        region.setName("北京市");
        System.out.println(regionService.select(region));
    }
}
