package com.example.demo2.controller;

import com.example.demo2.model.bo.AdminBO;
import com.example.demo2.model.dto.AdminDTO;
import com.example.demo2.model.mapper.AdminMapper;
import com.example.demo2.model.user.Admin;
import com.example.demo2.model.vo.AdminVO;
import com.example.demo2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class SignUp {
    @Autowired
    AccountService accountService;

    @Autowired
    AdminMapper adminMapper;

    @PostMapping(value = "SignUp")
    public AdminVO signAccount(
            @RequestBody AdminDTO adminDTO) {
        Admin admin = adminMapper.toPO(adminDTO);
        accountService.saveData(admin);
        return adminMapper.toVO(admin);
    }

    @GetMapping("getAdminBo/{account}")
    public AdminBO getEmployeesById(@PathVariable String account) {
        Admin adminVO = accountService.getAdminInfoByAccount(account);
        return adminMapper.toBO(adminVO);
    }
}


  