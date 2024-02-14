package com.example.demo2.service.Impl;

import com.example.demo2.model.repository.AdminRepostory;
import com.example.demo2.model.user.Admin;
import com.example.demo2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl implements AccountService {
    @Autowired
    AdminRepostory adminDao;

    /**
     * 取得管理這帳號資料組
     *
     * @param account
     * @return
     */
    @Override
    public Admin getAdminInfoByAccount(String account) {
        return adminDao.findByAdminAccount(account);
    }

    /**
     * 註冊管理者帳號資料組
     *
     * @param admin
     */
    @Override
    public void saveData(Admin admin) {
        adminDao.save(admin);
    }
}
