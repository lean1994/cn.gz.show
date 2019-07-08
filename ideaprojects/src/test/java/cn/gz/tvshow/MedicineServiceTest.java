package cn.gz.tvshow;

import cn.gz.tvshow.pojo.MedicineModel;
import cn.gz.tvshow.service.MedivcineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicineServiceTest {
    @Autowired
    MedivcineService medivcineService;

    @Test
    public void insert() {
        MedicineModel medicineModel = new MedicineModel();
        medicineModel.setName("中西医");
        medicineModel.setDep("心脏科");
        medicineModel.setShowId(10001);
        medicineModel.setUpDate(new Date());
        medicineModel.setUpUserId(10001);
        System.out.println(medivcineService.insert(medicineModel));
    }

    @Test
    public void update() {
        MedicineModel medicineModel = new MedicineModel();
        medicineModel.setDep("骨科");
        medicineModel.setName("西医");
        medicineModel.setUpDate(new Date());
        medicineModel.setUpUserId(10001);
        medicineModel.setId(10011);
        System.out.println(medivcineService.updateById(medicineModel));
    }

    @Test
    public void deleteById() {
        System.out.println(medivcineService.deleteByPrimaryKey(10012));
    }

    @Test
    public void select() {
        MedicineModel medicineModel = new MedicineModel();
        medicineModel.setId(10011);
        System.out.println(medivcineService.select(medicineModel));
    }
}
