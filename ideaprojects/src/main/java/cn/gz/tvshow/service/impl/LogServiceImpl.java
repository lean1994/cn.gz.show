package cn.gz.tvshow.service.impl;

import cn.gz.tvshow.dao.LogModelMapper;
import cn.gz.tvshow.pojo.LogModel;
import cn.gz.tvshow.service.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("LogService")
public class LogServiceImpl implements LogService {
    @Resource
    LogModelMapper logModelMapper;

    @Override
    public int deleteById(Integer id) {
        return logModelMapper.deleteById(id);
    }

    @Override
    public int insert(LogModel logModel) {
        return logModelMapper.insert(logModel);
    }


    public LogModel select(LogModel logModel) {
        return logModelMapper.select(logModel);
    }

    @Override
    public int updateById(LogModel logModel) {
        return logModelMapper.updateById(logModel);
    }
}
