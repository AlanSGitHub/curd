package com.max.curd.service;

import com.max.curd.model.SystemInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Max
 * @date 2019-04-10 下午 9:45
 * @projectName curd
 */
public interface SystemInfoService {

    public List<SystemInfo> getAll();

    public SystemInfo getOne(String id);

    public SystemInfo add(SystemInfo systemInfo);

    public SystemInfo edit(SystemInfo systemInfo);

    public void remove(String id);

    Page<SystemInfo> getPage(Integer start,Integer count);
}
