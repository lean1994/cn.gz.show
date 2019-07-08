package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.MedicineModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MedicineModelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(MedicineModel record);

    MedicineModel select(MedicineModel medicineModel);

    int updateById(MedicineModel record);
}