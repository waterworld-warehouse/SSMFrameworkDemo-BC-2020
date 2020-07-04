package com.zd.service;

import com.zd.domain.SysLog;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service
 * @ClassName: ISysLogService
 * @Author: 晴天
 * @Date: 2020/4/14 15:22
 * @Version: 1.0
 */
public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    public List<SysLog> findAll();
}
