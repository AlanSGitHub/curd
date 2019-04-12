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

    /**
     * 获取所有列表数据
     * @return list集合
     */
    public List<SystemInfo> getAll();

    /**
     * 根据主键Id获取一条数据
     * @param id
     * @return 查询到的对象
     */
    public SystemInfo getOne(String id);

    /**
     * 保存一条数据
     * 如果Id为空时，jpa会新增一条数据，否则更新该对象
     * @param systemInfo
     * @return 保存成功后的对象
     */
    public SystemInfo save(SystemInfo systemInfo);

    /**
     * 删除一条数据
     * @param id 主键
     */
    public void remove(String id);

    /**
     * 获取分页数据
     * @param start 从第几页开始
     * @param count 显示多少行
     * @return 分页结果集
     */
    Page<SystemInfo> getPage(Integer start,Integer count);
}
