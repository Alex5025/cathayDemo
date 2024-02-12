package com.example.demo2.service.Impl;

import com.example.demo2.model.entity.Child;
import com.example.demo2.model.repository.ChildRepository;
import com.example.demo2.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Primary
public class ChildServiceImpl implements ChildService {
    @Autowired
    ChildRepository childRepository;

    @Transactional(rollbackFor = Exception.class)
    public void save(Child build) {
        childRepository.save(build);
    }

    @Override
    public Child findBycId(String cId) {
        return childRepository.findByCid(cId);
    }

    private void AAA(){}
}
