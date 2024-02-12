package com.example.demo2.controller;

import com.example.demo2.model.entity.Child;
import com.example.demo2.model.entity.Parent;
import com.example.demo2.model.mapper.TestMapper;
import com.example.demo2.model.repository.ChildRepository;
import com.example.demo2.model.repository.Parentrepository;
import com.example.demo2.model.vo.ParentVO;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Test1 {

    @Autowired
    private Parentrepository parentrepository;

    @Autowired
    private ChildRepository childDao;

    @GetMapping(value = "/insertParent")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Child.class))})}
    )
    public ParentVO test1() {
        Parent build = Parent.builder()//
                .page(18)//
                .pname("P1_Name")//
                .puuid(UUID.randomUUID())//
                .pid("P111111111")//
                .build();
        parentrepository.save(build);
        ParentVO parentVO = TestMapper.INSTANCE.toVO(build);
        System.err.println(parentVO.toString());
        return parentVO;
    }

    @GetMapping(value = "/insertChild")
    public Child test2(@Valid @RequestBody Child aaa) {
        UUID uuid = UUID.fromString("a92ae14b-0605-4f8c-b5a6-4d23af18efa1");
        Parent parent = parentrepository.findByPuuid(uuid);
        System.err.println(parent.toString());
        Child build = Child.builder()//
                .cage(21)//
                .cname("C1_Name")//
                .cuuid(UUID.randomUUID())//
                .cid("C111111111")
                .parent(parent)//
                .build();
        childDao.save(build);
        System.err.println(build.toString());
        return build;
    }

    @GetMapping(value = "/findByPid")
    public Parent test3() {
        return parentrepository.findByPid("P111111111");
    }

    @GetMapping(value = "/gueryChild")
    public Child test4() {
        return childDao.findByCid("C111111111");
    }

    @GetMapping(value = "/gueryFindBypName")
    public Parent test5() {
        return parentrepository.findByPnameStr("P2_NAME");
    }
}
