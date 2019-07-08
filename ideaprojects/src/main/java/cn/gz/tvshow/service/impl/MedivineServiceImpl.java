package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.MedicineModelMapper;
import cn.gz.tvshow.pojo.MedicineModel;
import cn.gz.tvshow.service.MedivcineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("MedicineService")
public class MedivineServiceImpl implements MedivcineService {
    @Resource
    MedicineModelMapper medicineModelMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return medicineModelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MedicineModel record) {
        return medicineModelMapper.insert(record);
    }

    @Override
    public MedicineModel select(MedicineModel medicineModel) {
        return medicineModelMapper.select(medicineModel);
    }

    @Override
    public int updateById(MedicineModel record) {
        return medicineModelMapper.updateById(record);
    }
}
