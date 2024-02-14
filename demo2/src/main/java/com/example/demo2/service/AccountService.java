package com.example.demo2.service;

import com.example.demo2.model.user.Admin;

public interface AccountService {

    /**
     * 取得管理這帳號資料組
     *
     * @param account
     * @return
     */
    Admin getAdminInfoByAccount(String account);

    /**
     * 註冊管理者帳號
     *
     * @param admin
     */
    void saveData(Admin admin);
}
