package com.max.curd.endpoint;

import com.max.curd.model.SystemInfo;
import com.max.curd.service.SystemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Max
 * @date 2019-04-10 下午 9:48
 * @projectName curd
 */
@RestController
@RequestMapping("/api/sys")
public class SystemInfoEndpoint {

    @Autowired
    private SystemInfoService systemInfoService;

    @PostMapping("/save")
    public SystemInfo save(@RequestBody SystemInfo systemInfo) {
        return systemInfoService.add(systemInfo);
    }

    @GetMapping("/all")
    public List<SystemInfo> all() {
        return systemInfoService.getAll();
    }

    @RequestMapping("/one")
    public SystemInfo one(@RequestParam("id") String id) {
        return systemInfoService.getOne(id);
    }

    @RequestMapping("/del")
    public boolean delete(@RequestParam("id") String id) {
        try {
            systemInfoService.remove(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping("/page")
    public Page<SystemInfo> getPage(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("sizeNumber") Integer sizeNumber) {
        Page<SystemInfo> result = systemInfoService.getPage(pageNumber, sizeNumber);
        return result;
    }
}
