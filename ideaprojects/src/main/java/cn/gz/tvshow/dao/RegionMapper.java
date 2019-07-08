package cn.gz.tvshow.dao;

import cn.gz.tvshow.pojo.Region;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RegionMapper {

    int deleteById(Integer id);

    int insert(Region record);

    Region select(Region region);

    int updateById(Region record);
}