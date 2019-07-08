package cn.gz.tvshow.service;

import cn.gz.tvshow.pojo.MedicineModel;

public interface MedivcineService {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicineModel record);

    MedicineModel select(MedicineModel medicineModel);

    int updateById(MedicineModel record);
}
