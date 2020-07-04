package com.zd.service.impl;

import com.zd.Dao.ISysLogDao;
import com.zd.domain.SysLog;
import com.zd.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.service.impl
 * @ClassName: SysLogServiceImpl
 * @Author: 晴天
 * @Date: 2020/4/14 15:23
 * @Version: 1.0
 */

@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao iSysLogDao;

    @Override
    public void save(SysLog sysLog) throws Exception {
        iSysLogDao.save(sysLog);
    }

    //查询所有访问日志

    @Override
    public List<SysLog> findAll() {
        return iSysLogDao.findAll();
    }
}
