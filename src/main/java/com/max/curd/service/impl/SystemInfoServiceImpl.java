package com.max.curd.service.impl;

import com.max.curd.dao.SystemInfoDao;
import com.max.curd.model.SystemInfo;
import com.max.curd.service.SystemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Max
 * @date 2019-04-10 下午 9:46
 * @projectName curd
 */
@Service
public class SystemInfoServiceImpl implements SystemInfoService {

    @Autowired
    private SystemInfoDao systemInfoDao;

    @Override
    public List<SystemInfo> getAll() {
        return systemInfoDao.findAll();
    }

    @Override
    public SystemInfo getOne(String id) {
        try {
            SystemInfo systemInfo = systemInfoDao.getOne(id);
            return systemInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SystemInfo save(SystemInfo systemInfo) {
        return systemInfoDao.save(systemInfo);
    }

    @Override
    public void remove(String id) {
        systemInfoDao.deleteById(id);
    }

    @Override
    public Page<SystemInfo> getPage(Integer pageNumber, Integer sizeNumber) {
        if (pageNumber == 0 || null == pageNumber || sizeNumber == 0 || null == sizeNumber) {
            pageNumber = 0;
            sizeNumber = 20;
        } else {
            --pageNumber;
        }
        Pageable pageable = new PageRequest(pageNumber, sizeNumber);
        Page<SystemInfo> page = systemInfoDao.findAll(pageable);
        return page;
    }
}
