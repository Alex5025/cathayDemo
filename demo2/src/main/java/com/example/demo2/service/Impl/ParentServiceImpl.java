package com.example.demo2.service.Impl;

import com.example.demo2.model.entity.Parent;
import com.example.demo2.model.repository.Parentrepository;
import com.example.demo2.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class ParentServiceImpl implements ParentService {
    @Autowired
    private Parentrepository parentDao;

    @Override
    public Parent findBypUuid(UUID uuid) {
        return parentDao.findByPuuid(uuid);
    }

    @Override
    public Parent findBypId(String pId) {
        return parentDao.findByPid(pId);
    }

    @Override
    public Parent findBypName(String name) {
        return parentDao.findByPnameStr(name);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Parent build) {
        parentDao.save(build);
    }
}
