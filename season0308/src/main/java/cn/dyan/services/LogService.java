package cn.dyan.services;

import cn.dyan.domain.OrderLog;
import cn.dyan.mapping.OrderLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class LogService {
    @Autowired
    private OrderLogMapper logMapper;

    @Transactional(propagation = Propagation.NESTED)
    public void addLog(OrderLog log){
        log.setCreated(new Date());
        logMapper.insert(log);
    }
}
